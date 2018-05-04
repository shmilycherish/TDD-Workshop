package com.studyforever.tdd;

import org.junit.Test;

import static java.util.Arrays.asList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class MarsRoverStarterTest {

    @Test
    public void shouldInitMarsRover() {

        UserInput userInput = mock(UserInput.class);
        StatusConverter statusConverter = mock(StatusConverter.class);
        MarsRoverStarter marsRoverStarter = new MarsRoverStarter(userInput, statusConverter);
        String input = "1 2 N";
        given(userInput.readline()).willReturn(input);
        given(statusConverter.convert(input)).willReturn(asList("1", "2", "N"));

        MarsRover marsRover = marsRoverStarter.initStatus();

        assertThat(marsRover.getStatus(), is("1 2 N"));
    }
}