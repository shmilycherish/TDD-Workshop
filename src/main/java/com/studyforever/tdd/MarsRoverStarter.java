package com.studyforever.tdd;

import java.util.List;

public class MarsRoverStarter {

    private final UserInput userInput;
    private final StatusConverter statusConverter;

    public MarsRoverStarter(UserInput userInput, StatusConverter statusConverter) {
        this.userInput = userInput;
        this.statusConverter = statusConverter;
    }

    public MarsRover initStatus() {
        String input = userInput.readline();
        List<String> result = statusConverter.convert(input);
        int x = Integer.valueOf(result.get(0));
        int y = Integer.valueOf(result.get(1));
        String direction = result.get(2);
        return  new MarsRover(x, y, direction);

    }
}
