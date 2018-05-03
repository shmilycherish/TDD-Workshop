package com.studyforever.tdd;

import static java.lang.String.format;

public class MarsRover {
    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String getStatus() {
        return format("%s %s %s", x, y, direction);
    }

    public void execute(String command) {
        this.direction = "W";
    }
}
