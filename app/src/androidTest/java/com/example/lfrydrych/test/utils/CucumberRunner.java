package com.example.lfrydrych.test.utils;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "features",
        glue = {"com.example.lfrydrych.test.steps"},
        plugin = {"pretty"} //"html: cucumber-html-reports",
        // "json: cucumber-html-reports/cucumber.json"}
)
public class CucumberRunner {
}
