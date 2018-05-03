package com.studyforever.tdd;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void shouldReturnWelcomeMessage() {
        //given
        HelloWorld helloWorld = new HelloWorld();
        //when

        String welcomeMessage = helloWorld.welcome();

        //then
        assertThat(welcomeMessage, is("Hello World!"));
    }
}