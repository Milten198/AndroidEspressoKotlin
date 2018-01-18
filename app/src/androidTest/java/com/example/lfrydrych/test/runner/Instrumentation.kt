package com.example.lfrydrych.test.runner

import android.os.Bundle

import cucumber.api.android.CucumberInstrumentationCore

class Instrumentation : android.support.test.runner.AndroidJUnitRunner() {

    private val instrumentationCore = CucumberInstrumentationCore(this)

    override fun onCreate(bundle: Bundle) {
        super.onCreate(bundle)
        instrumentationCore.create(bundle)
    }

    override fun onStart() {
        waitForIdleSync()
        instrumentationCore.start()
    }
}