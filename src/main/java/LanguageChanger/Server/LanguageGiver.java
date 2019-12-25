package LanguageChanger.Server;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LanguageGiver {
    private ObjectMapper mapper;

    public LanguageGiver() {
        mapper = new ObjectMapper();
    }

    public String read(String language) {
        try {
            return mapper.readValue(new File("Languages/" + language + ".json"), String.class);
        } catch (IOException e) {
//            e.printStackTrace();
            return null;
        }
    }


}
