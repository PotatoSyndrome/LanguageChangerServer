package LanguageChanger.Server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class Controller {
    private static ApplicationContext context = new AnnotationConfigApplicationContext(Context.class);

    @RequestMapping(value = "/language")
    public String getLanguage(String language) {
        LanguageGiver languageGiver = context.getBean(LanguageGiver.class);
        return "\"" + languageGiver.read(language) + "\"";
    }

    @RequestMapping(value = "/getAll")
    private String[] getLanguages() {
        File folder = new File("languages/");
        String[] languages = folder.list();
        for(int i = 0;languages !=null &&  i < languages.length; ++i) {
            languages[i] = languages[i].replace(".json","");
        }
        return languages;
    }
}
