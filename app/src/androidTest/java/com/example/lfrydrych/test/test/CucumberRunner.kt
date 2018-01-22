package com.example.lfrydrych.test.test

import cucumber.api.CucumberOptions

@CucumberOptions(features = arrayOf("features"), glue = arrayOf("com.example.lfrydrych.test.cucumber.steps"), plugin = arrayOf("pretty"), tags = arrayOf("@test2, @test3"))
class CucumberRunner
