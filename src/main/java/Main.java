import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        Main main = new Main("score.csv");
        main.execute();
    }

    private List<Student> students;

    public Main(String filename) {
        try {
            students = Files.lines(Paths.get(filename))
                    .map(s -> s.split(","))
                    .map(Student::new)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void execute() {
        viewTop();
        viewAvg();
    }

    public void viewTop() {
        Optional<String> first = students
                .stream()
                .sorted(Comparator.comparing(Student::getEnglishScore, Comparator.reverseOrder()))
                .map(Student::getName)
                .findFirst();
        System.out.println("英語: " + first.orElse("該当なし"));
    }

    public void viewAvg() {
        OptionalDouble average = students
                .stream()
                .mapToDouble(Student::getEnglishScore)
                .average();
        System.out.println(average.orElse(0));
    }
}
