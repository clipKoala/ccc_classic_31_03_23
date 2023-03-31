import level_1.Level_1;

import java.nio.file.Path;
import java.util.stream.Stream;

public class MainStart {
    public static void main(String[] args) {

        Stream<String> input = new FileOperations().readFile(Path.of("resources/level_1/level1_1.in"));
        String result = new Level_1().solve(input);
        new FileOperations().writeFile(Path.of("src/level_1/level1_1.out"), result);

        input = new FileOperations().readFile(Path.of("resources/level_1/level1_2.in"));
        result = new Level_1().solve(input);
        new FileOperations().writeFile(Path.of("src/level_1/level1_2.out"), result);

        input = new FileOperations().readFile(Path.of("resources/level_1/level1_3.in"));
        result = new Level_1().solve(input);
        new FileOperations().writeFile(Path.of("src/level_1/level1_3.out"), result);

        input = new FileOperations().readFile(Path.of("resources/level_1/level1_4.in"));
        result = new Level_1().solve(input);
        new FileOperations().writeFile(Path.of("src/level_1/level1_4.out"), result);

        input = new FileOperations().readFile(Path.of("resources/level_1/level1_5.in"));
        result = new Level_1().solve(input);
        new FileOperations().writeFile(Path.of("src/level_1/level1_5.out"), result);
    }
}
