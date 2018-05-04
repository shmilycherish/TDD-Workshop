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

    @Test
    public void shouldDirectToWWhenCurrentDirectionIsNandCommandISTurnLeft() {
        MarsRover marsrover = new MarsRover(0, 1, "N");

        marsrover.execute("L");

        assertThat(marsrover.getStatus(), is("0 1 W"));
    }


    @Test
    public void shouldDirectToSWhenCurrentDirectionIsWandCommandISTurnLeft() {
        MarsRover marsrover = new MarsRover(0, 1, "W");

        marsrover.execute("L");

        assertThat(marsrover.getStatus(), is("0 1 S"));
    }

    @Test
    public void shouldDirectToEWhenCurrentDirectionIsSandCommandISTSrnLeft() {
        MarsRover marsrover = new MarsRover(0, 1, "S");

        marsrover.execute("L");

        assertThat(marsrover.getStatus(), is("0 1 E"));
    }

    @Test
    public void shouldDirectToNWhenCurrentDirectionIsEandCommandISTSrnLeft() {
        MarsRover marsrover = new MarsRover(0, 1, "E");

        marsrover.execute("L");

        assertThat(marsrover.getStatus(), is("0 1 N"));
    }


    @Test
    public void shouldDirectToEWhenCurrentDirectionIsNandCommandISTurnRight() {
        MarsRover marsrover = new MarsRover(0, 1, "N");

        marsrover.execute("R");

        assertThat(marsrover.getStatus(), is("0 1 E"));
    }


    @Test
    public void shouldDirectToNWhenCurrentDirectionIsWandCommandISTurnRight() {
        MarsRover marsrover = new MarsRover(0, 1, "W");

        marsrover.execute("R");

        assertThat(marsrover.getStatus(), is("0 1 N"));
    }

    @Test
    public void shouldDirectToWWhenCurrentDirectionIsSandCommandISTSrnRight() {
        MarsRover marsrover = new MarsRover(0, 1, "S");

        marsrover.execute("R");

        assertThat(marsrover.getStatus(), is("0 1 W"));
    }

    @Test
    public void shouldDirectToSWhenCurrentDirectionIsEandCommandISTSrnLeft() {
        MarsRover marsrover = new MarsRover(0, 1, "E");

        marsrover.execute("R");

        assertThat(marsrover.getStatus(), is("0 1 S"));
    }
}
