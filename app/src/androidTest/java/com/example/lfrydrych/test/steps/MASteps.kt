package com.example.lfrydrych.test.steps

import android.app.Activity
import android.content.Context
import android.test.ActivityInstrumentationTestCase2

import com.example.lfrydrych.myapplication.MainActivity
import com.example.lfrydrych.test.ActivityFinisher

import cucumber.api.java.After
import cucumber.api.java.Before
import cucumber.api.java.en.Given

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withText

/**
 * Created by lfrydrych on 15.01.2018.
 */

class MASteps : ActivityInstrumentationTestCase2<MainActivity>(MainActivity::class.java) {

    private var mActivity: Activity? = null
    private var mInstrumentationContext: Context? = null
    private var mAppContext: Context? = null

    @Before
    @Throws(Exception::class)
    public override fun setUp() {
        super.setUp()
        mInstrumentationContext = instrumentation.context
        mAppContext = instrumentation.targetContext
        mActivity = activity
    }

    @After
    @Throws(Exception::class)
    public override fun tearDown() {
        ActivityFinisher.finishOpenActivities()
        activity.finish()
        super.tearDown()
    }

    @Given("^App has started$")
    @Throws(Throwable::class)
    fun app_has_started() {
        Thread.sleep(1000)
        onView(withText("Hello World!")).check(matches(isDisplayed()))
    }
}
