package LanguageChanger.Server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class Context {


    @Bean
    public LanguageGiver getLanguageGiver() {
        return new LanguageGiver();
    }
}
