import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
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
        double v = calcAvg();
        System.out.println(v);
        viewAvg2();
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


    public double calcAvg() {
        return students
                .stream()
                .mapToDouble(Student::getEnglishScore)
                .average().orElse(0);
    }


    public void viewAvg2() {
        OptionalDouble m = students
                .stream()
                .filter(student -> Objects.equals(String.valueOf(student.getSex()), "M"))
                .mapToDouble(Student::getEnglishScore)
                .average();
        System.out.println(Math.round(m.orElse(0)));

    }
}
