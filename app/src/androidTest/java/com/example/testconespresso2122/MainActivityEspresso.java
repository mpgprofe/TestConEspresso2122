package com.example.testconespresso2122;

import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.action.ViewActions.typeTextIntoFocusedView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;


import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest

public class MainActivityEspresso {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void resetear(){
        Espresso.onView(withId(R.id.button)).perform(click());
        Espresso.onView(withId(R.id.editTextOriginal)).check(matches(withText("Limpiado")));
    }
    @Test
    public void pruebaCambiar(){
        Espresso.onView(withId(R.id.editTextOriginal)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOriginal)).perform(typeText("Hola Mundo"), closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonCambiar)).perform(click());
        Espresso.onView(withId(R.id.textViewResultado)).check(matches(withText("Hola Mundo")));
    }
    @Test
    public void pruebaAceptar(){
        Espresso.onView(withId(R.id.editTextOriginal)).perform(clearText());
        Espresso.onView(withId(R.id.editTextOriginal)).perform(typeText("Viva Espana"), closeSoftKeyboard());
        Espresso.onView(withId(R.id.buttonAceptar)).perform(click());
        Espresso.onView(withId(R.id.textViewNuevo)).check(matches(withText("Viva Espana")));
    }

}
