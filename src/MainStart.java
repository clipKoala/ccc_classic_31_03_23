import level_1.Level_1;
import level_2.Level_2;

import java.nio.file.Path;
import java.util.stream.Stream;

public class MainStart {
    public static void main(String[] args) {

//        Stream<String> input = new FileOperations().readFile(Path.of("resources/level_2/level2_example.in"));
//        String result = new Level_2().solve(input);
//        new FileOperations().writeFile(Path.of("src/level_2/level2_example.out"), result);

        Stream<String> input = new FileOperations().readFile(Path.of("resources/level_2/level2_1.in"));
        String result = new Level_2().solve(input);
        new FileOperations().writeFile(Path.of("src/level_2/level2_1.out"), result);
//
//        input = new FileOperations().readFile(Path.of("resources/level_2/level2_2.in"));
//        result = new Level_2().solve(input);
//        new FileOperations().writeFile(Path.of("src/level_2/level2_2.out"), result);
//
//        input = new FileOperations().readFile(Path.of("resources/level_2/level2_3.in"));
//        result = new Level_2().solve(input);
//        new FileOperations().writeFile(Path.of("src/level_2/level2_3.out"), result);
//
//        input = new FileOperations().readFile(Path.of("resources/level_2/level2_4.in"));
//        result = new Level_2().solve(input);
//        new FileOperations().writeFile(Path.of("src/level_2/level2_4.out"), result);
//
//        input = new FileOperations().readFile(Path.of("resources/level_2/level2_5.in"));
//        result = new Level_2().solve(input);
//        new FileOperations().writeFile(Path.of("src/level_2/level2_5.out"), result);
    }
}
