package level_1;

import java.util.stream.Stream;

public class Level_1 {

    public String solve(Stream<String> input) {
        return input
                .filter((mark) -> mark.equals("x"))
                .count() + "";
    }
}
