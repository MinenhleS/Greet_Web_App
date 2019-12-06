package sampleClass;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        get("/hello", (req, res) -> {

            Map<String, String> dataMap = new HashMap<>();
            dataMap.put("name", "Golden");
            return new ModelAndView(dataMap, "hello.hbs");

        }, new HandlebarsTemplateEngine());

    }
}