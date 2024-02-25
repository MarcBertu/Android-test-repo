package com.example.androidtestapp;

import static org.junit.Assert.assertEquals;

import android.content.Context;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.androidtestapp", appContext.getPackageName());
    }

    /*
        Component Test
     */

    @Test
    public void getObjectWithMock() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        String jsonString = ComponentTestClass.getJsonStringMocked(appContext);

        ComponentTestClass.ComponentDataClass entity = ComponentTestClass.parseFromJson(jsonString);

        assertEquals(200, entity.getStatut());
        assertEquals("Good", entity.getMessage());
    }

    /*
        Integration Test
     */

    @Test
    public void getObjectFromApi() {
        String jsonString = ""; // TODO: 25/02/2024 : Replace "jsonString" by the result of your API 😊

        ComponentTestClass.ComponentDataClass entity = ComponentTestClass.parseFromJson(jsonString);

        assertEquals(200, entity.getStatut());
        assertEquals("Good", entity.getMessage());
    }
}