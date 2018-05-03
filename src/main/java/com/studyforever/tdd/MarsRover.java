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
        if (command.equals("L")) {
            if (this.direction.equals("N")) {
                this.direction = "W";
            } else if (this.direction.equals("W")) {
                this.direction = "S";
            } else if (this.direction.equals("S")) {
                this.direction = "E";
            } else if (this.direction.equals("E")) {
                this.direction = "N";
            }
        }
    }
}
