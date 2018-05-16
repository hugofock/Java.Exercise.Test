import java.util.ArrayList;
import java.util.List;

public final class TimeMeasureTool {

    private long startTime;
    private long timeMeasure;
    private long endTime;
    private List<String> results;

    public TimeMeasureTool() {
        start();
    }

    public void start() {
        results = new ArrayList<>();
        startTime = System.currentTimeMillis();
        timeMeasure = System.currentTimeMillis();
        endTime = System.currentTimeMillis();
    }

    public void stop(String method) {
        endTime = System.currentTimeMillis();
        String msg = "Time measure for " + method + " : " + (endTime - timeMeasure) + " ms";
        results.add(msg);
        timeMeasure = endTime;
    }

    public void printResult() {
        endTime = System.currentTimeMillis();
        System.out.println("Total time for execution : " + (endTime - startTime) + " ms");
        results.forEach(System.out::println);
    }
}
