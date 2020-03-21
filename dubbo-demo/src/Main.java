import java.util.*;

public class Main {

    private static List<Line> lines = new ArrayList<>();

    static {
        Line line1 = new Line("line1", 2400.0);
        Line line2 = new Line("line2", 1100.0);
        Line line3 = new Line("line3", 400.0);
        Line line4 = new Line("line4", 400.0);
        Line line5 = new Line("line5", 3200.0);
        Line line6 = new Line("line6", 300.0);
        Line line7 = new Line("line7", 500.0);
        Line line8 = new Line("line8", 3200.0);
        Line line9 = new Line("line9", 4000.0);
        Line line10 = new Line("line10", 700.0);
        Collections.addAll(lines, line1, line2, line3, line4, line5, line6, line7, line8, line9, line10);
    }

    public static void main(String[] args) {
        lines.stream().sorted(Comparator.comparing(Line::getFlow).reversed()).limit(3).forEach(System.out::println);
    }

}






