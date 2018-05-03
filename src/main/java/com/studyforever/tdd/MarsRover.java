package com.studyforever.tdd;

import static java.lang.String.format;

public class MarsRover {
    private final int x;
    private final int y;
    private final String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public String getStatus() {
        return format("%s %s %s", x, y, direction);
    }
}
