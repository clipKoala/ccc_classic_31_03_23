package level_1;

import java.util.List;
import java.util.stream.Stream;

public class Level_1 {

//    public String solve(Stream<String> input) {
//        return input
//                .filter((mark) -> mark.equals("x"))
//                .count() + "";
//    }

    public String solve(Stream<String> input) {

//        List<String[]> fight = input.map(regex -> regex.split("")).toList();
        var wins = "";
        for (String fight : input.toList()) {
            if (fight.contains("P") && fight.contains("S")) {
                wins += "S\n";
            }
            if (fight.contains("P") && fight.contains("R")) {
                wins += "P\n";
            }
            if (fight.contains("R") && fight.contains("S")) {
                wins += "R\n";
            }
            if (fight.charAt(0) == 'P' && fight.charAt(1) == 'P') {
                wins += "P\n";
            }
            if (fight.charAt(0) == 'R' && fight.charAt(1) == 'R') {
                wins += "R\n";
            }
            if (fight.charAt(0) == 'S' && fight.charAt(1) == 'S') {
                wins += "S\n";
            }
        }
        return wins;
    }
}

