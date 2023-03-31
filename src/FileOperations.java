import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FileOperations {
    // Do not touch!!!

    public Stream<String> readFile(Path path) {
        List<String> returnLines = null;
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(returnLines::add);
        } catch (IOException e) {
            System.out.println("Error reading file: " + path.toString());
            e.printStackTrace();
        }
        return returnLines.stream();
    }

    public void writeFile(Path path, String lines) {
        try {
            Files.writeString(path, lines);
        } catch (IOException e) {
            System.out.println("Error writing file: " + path.toString());
            e.printStackTrace();
        }
    }
}
