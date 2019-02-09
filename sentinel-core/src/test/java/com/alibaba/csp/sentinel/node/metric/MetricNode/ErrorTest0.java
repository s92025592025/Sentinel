import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        java.lang.String str1 = metricNode0.toFatString();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getTimestamp();
        java.lang.String str5 = metricNode0.toThinString();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps((long) (short) 1);
        java.lang.String str3 = metricNode0.toThinString();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        metricNode0.setTimestamp((long) (byte) 1);
        java.lang.String str8 = metricNode0.toFatString();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        metricNode0.setBlockQps((long) (-1));
        java.lang.String str8 = metricNode0.toFatString();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        java.lang.String str3 = metricNode0.toString();
        java.lang.String str4 = metricNode0.toThinString();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setRt(100L);
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        long long8 = metricNode0.getBlockQps();
        metricNode0.setTimestamp((long) (short) 0);
        java.lang.String str11 = metricNode0.toThinString();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps((long) (short) 1);
        long long3 = metricNode0.getTimestamp();
        java.lang.String str4 = metricNode0.toThinString();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        long long4 = metricNode0.getPassQps();
        metricNode0.setTimestamp((long) 'a');
        java.lang.String str7 = metricNode0.toFatString();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        java.lang.String str6 = metricNode0.getResource();
        long long7 = metricNode0.getExceptionQps();
        java.lang.String str8 = metricNode0.toFatString();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setTimestamp(0L);
        java.lang.String str9 = metricNode0.toThinString();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        long long4 = metricNode0.getPassQps();
        long long5 = metricNode0.getPassQps();
        java.lang.String str6 = metricNode0.toFatString();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        long long4 = metricNode0.getRt();
        java.lang.String str5 = metricNode0.toFatString();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps(0L);
        java.lang.String str3 = metricNode0.toFatString();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setExceptionQps(0L);
        metricNode0.setSuccessQps((long) 'a');
        metricNode0.setRt(0L);
        metricNode0.setRt((long) (byte) -1);
        long long10 = metricNode0.getPassQps();
        java.lang.String str11 = metricNode0.toThinString();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setPassQps((long) (byte) 0);
        long long9 = metricNode0.getBlockQps();
        long long10 = metricNode0.getRt();
        java.lang.String str11 = metricNode0.toThinString();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setRt(100L);
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        java.lang.String str8 = metricNode0.toString();
        java.lang.String str9 = metricNode0.toFatString();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getRt();
        java.lang.String str2 = metricNode0.toFatString();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getRt();
        java.lang.Class<?> wildcardClass2 = metricNode0.getClass();
        java.lang.String str3 = metricNode0.toThinString();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps(0L);
        java.lang.Class<?> wildcardClass3 = metricNode0.getClass();
        metricNode0.setBlockQps((-1L));
        metricNode0.setExceptionQps((long) (byte) 10);
        java.lang.String str8 = metricNode0.toFatString();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        java.lang.String str6 = metricNode0.getResource();
        long long7 = metricNode0.getExceptionQps();
        metricNode0.setPassQps(10L);
        java.lang.String str10 = metricNode0.toThinString();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setExceptionQps(0L);
        metricNode0.setSuccessQps((long) 'a');
        metricNode0.setRt(0L);
        java.lang.String str8 = metricNode0.toThinString();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setSuccessQps(0L);
        java.lang.String str6 = metricNode0.toFatString();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setRt(100L);
        java.lang.String str7 = metricNode0.toThinString();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getExceptionQps();
        java.lang.String str7 = metricNode0.toString();
        metricNode0.setRt(100L);
        metricNode0.setSuccessQps(10L);
        java.lang.String str12 = metricNode0.toFatString();
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setPassQps(0L);
        java.lang.String str4 = metricNode0.toThinString();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setTimestamp(0L);
        metricNode0.setBlockQps((long) ' ');
        java.lang.String str11 = metricNode0.getResource();
        java.lang.String str12 = metricNode0.toFatString();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        long long7 = metricNode0.getRt();
        java.lang.String str8 = metricNode0.getResource();
        metricNode0.setSuccessQps(100L);
        java.lang.String str11 = metricNode0.toFatString();
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        long long4 = metricNode0.getSuccessQps();
        java.lang.String str5 = metricNode0.toThinString();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setExceptionQps(0L);
        metricNode0.setSuccessQps((long) 'a');
        metricNode0.setExceptionQps((long) 'a');
        java.lang.String str8 = metricNode0.toFatString();
    }
}

