import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Paths.get("./src/main/resources/score.csv").toFile().getAbsolutePath());
        System.out.println(Paths.get(".").toFile().getAbsolutePath());

        Stream<String> stream = Files.lines(Paths.get("score.csv"));
        System.out.println(stream);

    }
}
