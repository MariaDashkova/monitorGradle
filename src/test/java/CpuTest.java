import org.junit.Test;
import org.test.monitoring.CPUMonitor;

import java.util.Map;

import static junit.framework.Assert.*;

public class CpuTest {

    private CPUMonitor monitor = new CPUMonitor();

    @Test
    public void GET_cpuUsageReturnDouble() {
        Double result = monitor.GET_cpuUsage();
        assertTrue(result >= 0);
    }

    @Test
    public void GET_cpuUsageReturnMap() {
        Map<String, Double> result = monitor.gEtaLL_CPU_Usage();
        assertNotNull(result);
    }

    @Test
    public void diskFreeReturnMap() {
        Map<String, Integer> result = monitor.diskFree();
        assertNotNull(result);
    }

    @Test
    public void memoryFreeReturnMap() {
        Map<String, Integer> result = monitor.memoryFree();
        assertNotNull(result);
        assertEquals(2, result.size());
    }


}
