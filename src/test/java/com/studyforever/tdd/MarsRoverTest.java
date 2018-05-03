package com.studyforever.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {
    @Test
    public void shouldReturnMarsRoverStatus() {
        MarsRover marsrover = new MarsRover(0, 0, "N");

        String status = marsrover.getStatus();

        assertThat(status, is("0,0,N"));
    }
}
