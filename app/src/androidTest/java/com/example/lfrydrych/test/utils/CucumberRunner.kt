package com.example.lfrydrych.test.utils

import cucumber.api.CucumberOptions

@CucumberOptions(features = arrayOf("features"), glue = arrayOf("com.example.lfrydrych.test.steps"), plugin = arrayOf("pretty"))
class CucumberRunner
