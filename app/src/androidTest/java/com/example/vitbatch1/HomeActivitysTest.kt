package com.example.vitbatch1

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@LargeTest
@RunWith(AndroidJUnit4::class)
class HomeActivitysTest {

    @Rule
    @JvmField
    var mActivityScenarioRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loginTest(){
        //select edittext
        onView(withId(R.id.etUItest))
        //type andnroid workshops in that et
            .perform(typeText("androidworkshops@gmail.com"), closeSoftKeyboard());
        //click the button
        onView(withId(R.id.btnUI)).perform(click())
        //check if the text view has android workshops
        onView(withId(R.id.tvUI))
            .check(matches(withText("androidworkshops@gmai.com")));

    }
}