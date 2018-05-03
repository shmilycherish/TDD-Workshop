package com.studyforever.tdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {
    @Test
    public void shouldReturn00NWhenMarsRoverStatusIS00N() {
        MarsRover marsrover = new MarsRover(0, 0, "N");

        String status = marsrover.getStatus();

        assertThat(status, is("0 0 N"));
    }

    @Test
    public void shouldReturn01WWhenMarsRoverStatusIS01W() {
        MarsRover marsrover = new MarsRover(0, 1, "W");

        String status = marsrover.getStatus();

        assertThat(status, is("0 1 W"));
    }
}
