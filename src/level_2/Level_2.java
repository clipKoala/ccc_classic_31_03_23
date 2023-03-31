package level_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Level_2 {

    public String solve(Stream<String> input) {

        var inputList = input.toList();

        var wins = "";
        while (true) {
            if (inputList.get(1).length() == 2) {
                break;
            }

            wins = getRound(inputList);
            inputList = Arrays.stream(wins.split("\n")).toList();

        }

        return wins;
    }

    private String getRound(List<String> inputList) {
        String wins = "";
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i).length() % 2 != 0) {
                continue;
            }

            for (int j = 0; j < inputList.get(i).length(); j += 2) {
                wins += getWinners(inputList.get(i).substring(j, j + 2));
            }

            wins += "\n";
        }
        return wins;
    }

    private String getWinners(String fight) {
        var wins = "";
        if (fight.contains("P") && fight.contains("S")) {
            wins += "S";
        }
        if (fight.contains("P") && fight.contains("R")) {
            wins += "P";
        }
        if (fight.contains("R") && fight.contains("S")) {
            wins += "R";
        }
        if (fight.charAt(0) == 'P' && fight.charAt(1) == 'P') {
            wins += "P";
        }
        if (fight.charAt(0) == 'R' && fight.charAt(1) == 'R') {
            wins += "R";
        }
        if (fight.charAt(0) == 'S' && fight.charAt(1) == 'S') {
            wins += "S";
        }

        return wins;
    }
}
