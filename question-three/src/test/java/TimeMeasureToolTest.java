import org.junit.Test;

public class TimeMeasureToolTest {
    @Test
    public void testTimeMeasureTool() throws Exception {
        final TimeMeasureTool timeMeasureTool = new TimeMeasureTool();
        timeMeasureTool.start();
        Thread.sleep(100);
        timeMeasureTool.stop("Method A");
        Thread.sleep(200);
        timeMeasureTool.stop("Method B");
        timeMeasureTool.printResult();
    }
}