import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromFatString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromThinString("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromFatString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        long long6 = metricNode0.getTimestamp();
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        metricNode0.setSuccessQps((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setPassQps((long) (byte) 0);
        long long9 = metricNode0.getBlockQps();
        long long10 = metricNode0.getExceptionQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setRt(100L);
        metricNode0.setTimestamp(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        long long6 = metricNode0.getExceptionQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        long long4 = metricNode0.getTimestamp();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromThinString("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=-1, rt=0, resource='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=-1, rt=0, resource='null'}\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        java.lang.String str6 = metricNode0.getResource();
        long long7 = metricNode0.getExceptionQps();
        metricNode0.setRt((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        long long4 = metricNode0.getRt();
        metricNode0.setTimestamp((long) (-1));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setExceptionQps(0L);
        metricNode0.setSuccessQps((long) 'a');
        metricNode0.setRt(0L);
        metricNode0.setRt((long) (byte) -1);
        long long10 = metricNode0.getPassQps();
        metricNode0.setPassQps((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setPassQps(0L);
        java.lang.String str4 = metricNode0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str4.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromFatString("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=-1, rt=0, resource='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=-1, rt=0, resource='null'}\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        java.lang.String str4 = metricNode0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}" + "'", str4.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromThinString("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        long long6 = metricNode0.getTimestamp();
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource=''}");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getTimestamp();
        metricNode0.setResource("");
        metricNode0.setRt(100L);
        long long9 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setPassQps((long) (byte) 0);
        long long9 = metricNode0.getBlockQps();
        long long10 = metricNode0.getBlockQps();
        metricNode0.setBlockQps((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps(0L);
        java.lang.Class<?> wildcardClass3 = metricNode0.getClass();
        long long4 = metricNode0.getPassQps();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        long long6 = metricNode0.getBlockQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        long long4 = metricNode0.getPassQps();
        metricNode0.setTimestamp((long) 'a');
        long long7 = metricNode0.getPassQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getBlockQps();
        metricNode0.setExceptionQps((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getBlockQps();
        long long5 = metricNode0.getRt();
        java.lang.Class<?> wildcardClass6 = metricNode0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromFatString("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setExceptionQps(0L);
        metricNode0.setExceptionQps((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setTimestamp((long) (short) -1);
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource=''}");
        metricNode0.setResource("MetricNode{timestamp=0, passQps=-1, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}");
        java.lang.String str10 = metricNode0.toThinString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "-1|MetricNode{timestamp=0, passQps=-1, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}|0|0|0|0|0" + "'", str10.equals("-1|MetricNode{timestamp=0, passQps=-1, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}|0|0|0|0|0"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setSuccessQps(0L);
        long long6 = metricNode0.getRt();
        java.lang.String str7 = metricNode0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str7.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setExceptionQps(0L);
        metricNode0.setBlockQps(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        metricNode0.setTimestamp((long) (-1));
        metricNode0.setTimestamp(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromFatString("-1|MetricNode{timestamp=0, passQps=-1, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}|0|0|0|0|0");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setTimestamp((long) (short) -1);
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource=''}");
        metricNode0.setResource("MetricNode{timestamp=0, passQps=-1, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}");
        metricNode0.setExceptionQps((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getTimestamp();
        metricNode0.setResource("");
        metricNode0.setRt(100L);
        long long9 = metricNode0.getExceptionQps();
        metricNode0.setRt((long) (short) 10);
        java.lang.String str12 = metricNode0.getResource();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}");
        java.lang.String str5 = metricNode0.getResource();
        java.lang.String str6 = metricNode0.getResource();
        metricNode0.setBlockQps((long) 1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str5.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str6.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getRt();
        java.lang.String str2 = metricNode0.getResource();
        long long3 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setPassQps((long) (byte) 0);
        java.lang.Class<?> wildcardClass9 = metricNode0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        long long5 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        long long3 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps((long) (short) -1);
        java.lang.String str3 = metricNode0.getResource();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps((long) (short) -1);
        metricNode0.setExceptionQps((long) (-1));
        long long5 = metricNode0.getSuccessQps();
        metricNode0.setBlockQps((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromThinString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromThinString("0|1969-12-31 16:00:00||0|0|100|0|0\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        metricNode0.setTimestamp((long) (byte) 1);
        metricNode0.setSuccessQps((long) 10);
        long long10 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromFatString("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=1, rt=0, resource='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=1, rt=0, resource='null'}\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setExceptionQps(0L);
        metricNode0.setSuccessQps((long) 'a');
        metricNode0.setRt(0L);
        metricNode0.setRt((long) (byte) -1);
        long long10 = metricNode0.getPassQps();
        long long11 = metricNode0.getSuccessQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        metricNode0.setTimestamp((long) 1);
        long long5 = metricNode0.getPassQps();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setRt(100L);
        long long7 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getExceptionQps();
        metricNode0.setBlockQps((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setPassQps((long) (byte) 0);
        long long9 = metricNode0.getBlockQps();
        long long10 = metricNode0.getRt();
        java.lang.String str11 = metricNode0.getResource();
        metricNode0.setBlockQps((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        long long4 = metricNode0.getRt();
        metricNode0.setRt((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        long long6 = metricNode0.getTimestamp();
        java.lang.String str7 = metricNode0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MetricNode{timestamp=0, passQps=100, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str7.equals("MetricNode{timestamp=0, passQps=100, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}");
        long long5 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        java.lang.Class<?> wildcardClass6 = metricNode0.getClass();
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        long long8 = metricNode0.getExceptionQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        java.lang.String str5 = metricNode0.getResource();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        long long7 = metricNode0.getExceptionQps();
        long long8 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getTimestamp();
        metricNode0.setResource("");
        metricNode0.setExceptionQps((long) 1);
        java.lang.String str9 = metricNode0.toThinString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0||0|0|100|1|0" + "'", str9.equals("0||0|0|100|1|0"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setSuccessQps(0L);
        long long6 = metricNode0.getRt();
        long long7 = metricNode0.getExceptionQps();
        metricNode0.setPassQps((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getExceptionQps();
        java.lang.String str2 = metricNode0.toString();
        java.lang.String str3 = metricNode0.toString();
        long long4 = metricNode0.getTimestamp();
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource=''}");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str2.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str3.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getExceptionQps();
        java.lang.String str2 = metricNode0.toString();
        java.lang.String str3 = metricNode0.toString();
        long long4 = metricNode0.getTimestamp();
        long long5 = metricNode0.getRt();
        metricNode0.setBlockQps((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str2.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str3.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getTimestamp();
        long long5 = metricNode0.getRt();
        metricNode0.setSuccessQps((long) 10);
        metricNode0.setTimestamp((long) (short) 10);
        metricNode0.setBlockQps(1L);
        long long12 = metricNode0.getBlockQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getTimestamp();
        metricNode0.setResource("");
        long long7 = metricNode0.getExceptionQps();
        java.lang.String str8 = metricNode0.toThinString();
        long long9 = metricNode0.getSuccessQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0||0|0|100|0|0" + "'", str8.equals("0||0|0|100|0|0"));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getTimestamp();
        long long5 = metricNode0.getRt();
        long long6 = metricNode0.getPassQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setResource("");
        long long7 = metricNode0.getPassQps();
        long long8 = metricNode0.getExceptionQps();
        metricNode0.setRt((long) (byte) 0);
        java.lang.String str11 = metricNode0.toFatString();
        java.lang.String str12 = metricNode0.toFatString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0|1969-12-31 16:00:00||0|0|100|0|0\n" + "'", str11.equals("0|1969-12-31 16:00:00||0|0|100|0|0\n"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0|1969-12-31 16:00:00||0|0|100|0|0\n" + "'", str12.equals("0|1969-12-31 16:00:00||0|0|100|0|0\n"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setExceptionQps(0L);
        metricNode0.setSuccessQps((long) 'a');
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource=''}");
        long long8 = metricNode0.getSuccessQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromThinString("0|1969-12-31 16:00:00|MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}|0|100|0|0|0\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        metricNode0.setTimestamp((long) 1);
        long long5 = metricNode0.getRt();
        metricNode0.setRt((long) (short) 100);
        long long8 = metricNode0.getRt();
        long long9 = metricNode0.getBlockQps();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setRt(100L);
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        metricNode0.setPassQps((long) '#');
        metricNode0.setPassQps((long) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setPassQps((long) (byte) 0);
        metricNode0.setRt((-1L));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}");
        long long5 = metricNode0.getBlockQps();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        long long4 = metricNode0.getPassQps();
        metricNode0.setTimestamp(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromFatString("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=97, exceptionQps=0, rt=0, resource='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=97, exceptionQps=0, rt=0, resource='null'}\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setResource("");
        long long7 = metricNode0.getRt();
        long long8 = metricNode0.getExceptionQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        metricNode0.setTimestamp((long) 1);
        long long5 = metricNode0.getRt();
        metricNode0.setRt((long) (short) 100);
        long long8 = metricNode0.getExceptionQps();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps(0L);
        java.lang.Class<?> wildcardClass3 = metricNode0.getClass();
        metricNode0.setBlockQps((-1L));
        metricNode0.setExceptionQps((long) (byte) 10);
        metricNode0.setBlockQps((long) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        long long6 = metricNode0.getTimestamp();
        long long7 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getExceptionQps();
        java.lang.String str2 = metricNode0.toString();
        java.lang.String str3 = metricNode0.toString();
        metricNode0.setTimestamp((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str2.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str3.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        long long4 = metricNode0.getRt();
        metricNode0.setPassQps((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        long long4 = metricNode0.getRt();
        metricNode0.setExceptionQps((long) 10);
        long long7 = metricNode0.getPassQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setResource("");
        long long7 = metricNode0.getPassQps();
        long long8 = metricNode0.getBlockQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        java.lang.String str6 = metricNode0.getResource();
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        metricNode0.setResource("");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setPassQps((long) (byte) 0);
        long long9 = metricNode0.getBlockQps();
        long long10 = metricNode0.getBlockQps();
        metricNode0.setPassQps((long) (byte) 10);
        long long13 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setPassQps((long) (byte) 0);
        long long9 = metricNode0.getBlockQps();
        long long10 = metricNode0.getBlockQps();
        long long11 = metricNode0.getRt();
        long long12 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setResource("");
        long long7 = metricNode0.getPassQps();
        metricNode0.setSuccessQps((long) '4');
        java.lang.Class<?> wildcardClass10 = metricNode0.getClass();
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=97, exceptionQps=0, rt=0, resource='null'}");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromFatString("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=100, resource='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=100, resource='null'}\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps((long) (short) 1);
        java.lang.String str3 = metricNode0.getResource();
        java.lang.String str4 = metricNode0.toString();
        long long5 = metricNode0.getPassQps();
        long long6 = metricNode0.getBlockQps();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=1, rt=0, resource='null'}" + "'", str4.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=1, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setTimestamp((long) (short) -1);
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource=''}");
        metricNode0.setResource("MetricNode{timestamp=0, passQps=-1, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}");
        metricNode0.setPassQps((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setResource("");
        long long7 = metricNode0.getPassQps();
        metricNode0.setSuccessQps((long) '4');
        long long10 = metricNode0.getRt();
        java.lang.String str11 = metricNode0.toFatString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0|1969-12-31 16:00:00||0|0|52|0|0\n" + "'", str11.equals("0|1969-12-31 16:00:00||0|0|52|0|0\n"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps(0L);
        metricNode0.setRt((long) (byte) 1);
        metricNode0.setTimestamp((long) (short) 1);
        metricNode0.setBlockQps((long) (short) 0);
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=1, rt=0, resource='null'}");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setResource("");
        long long7 = metricNode0.getRt();
        long long8 = metricNode0.getTimestamp();
        long long9 = metricNode0.getSuccessQps();
        java.lang.String str10 = metricNode0.getResource();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        java.lang.String str3 = metricNode0.toString();
        long long4 = metricNode0.getBlockQps();
        long long5 = metricNode0.getPassQps();
        java.lang.Class<?> wildcardClass6 = metricNode0.getClass();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str3.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromThinString("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getTimestamp();
        metricNode0.setResource("");
        metricNode0.setExceptionQps((long) 1);
        metricNode0.setTimestamp(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        long long7 = metricNode0.getExceptionQps();
        java.lang.String str8 = metricNode0.getResource();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromThinString("-1|MetricNode{timestamp=0, passQps=-1, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}|0|0|0|0|0");
        org.junit.Assert.assertNotNull(metricNode1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setTimestamp(1L);
        long long7 = metricNode0.getExceptionQps();
        java.lang.String str8 = metricNode0.getResource();
        long long9 = metricNode0.getBlockQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setSuccessQps(0L);
        long long6 = metricNode0.getRt();
        long long7 = metricNode0.getExceptionQps();
        long long8 = metricNode0.getRt();
        java.lang.String str9 = metricNode0.toString();
        long long10 = metricNode0.getSuccessQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str9.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getRt();
        java.lang.String str2 = metricNode0.getResource();
        long long3 = metricNode0.getSuccessQps();
        long long4 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setSuccessQps(0L);
        long long6 = metricNode0.getRt();
        long long7 = metricNode0.getExceptionQps();
        metricNode0.setRt((long) '#');
        long long10 = metricNode0.getBlockQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromThinString("0||0|0|100|0|0");
        metricNode1.setBlockQps((long) '#');
        org.junit.Assert.assertNotNull(metricNode1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setRt((long) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getTimestamp();
        long long5 = metricNode0.getRt();
        metricNode0.setSuccessQps((long) 10);
        long long8 = metricNode0.getTimestamp();
        metricNode0.setExceptionQps((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        metricNode0.setTimestamp((long) 1);
        long long5 = metricNode0.getRt();
        metricNode0.setRt((long) (short) 100);
        metricNode0.setBlockQps((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        metricNode0.setTimestamp((long) 1);
        long long5 = metricNode0.getRt();
        long long6 = metricNode0.getPassQps();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setTimestamp(0L);
        metricNode0.setBlockQps((long) ' ');
        java.lang.String str11 = metricNode0.getResource();
        java.lang.String str12 = metricNode0.getResource();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        long long7 = metricNode0.getExceptionQps();
        long long8 = metricNode0.getSuccessQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setResource("");
        long long7 = metricNode0.getRt();
        long long8 = metricNode0.getTimestamp();
        metricNode0.setSuccessQps((long) (byte) 10);
        long long11 = metricNode0.getExceptionQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}");
        metricNode0.setBlockQps((long) (byte) -1);
        long long7 = metricNode0.getSuccessQps();
        metricNode0.setSuccessQps((long) '#');
        java.lang.String str10 = metricNode0.toThinString();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0|MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}|0|-1|35|0|0" + "'", str10.equals("0|MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}|0|-1|35|0|0"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setPassQps((long) (byte) 0);
        long long9 = metricNode0.getBlockQps();
        long long10 = metricNode0.getBlockQps();
        long long11 = metricNode0.getRt();
        long long12 = metricNode0.getExceptionQps();
        long long13 = metricNode0.getExceptionQps();
        metricNode0.setBlockQps(1L);
        long long16 = metricNode0.getTimestamp();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}");
        java.lang.String str5 = metricNode0.getResource();
        metricNode0.setBlockQps(100L);
        long long8 = metricNode0.getSuccessQps();
        metricNode0.setRt(10L);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str5.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setPassQps(0L);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setPassQps((long) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setResource("");
        long long7 = metricNode0.getRt();
        java.lang.String str8 = metricNode0.toString();
        java.lang.Class<?> wildcardClass9 = metricNode0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource=''}" + "'", str8.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource=''}"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        java.lang.Class<?> wildcardClass6 = metricNode0.getClass();
        long long7 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setResource("");
        java.lang.String str7 = metricNode0.toString();
        metricNode0.setSuccessQps((long) (byte) 100);
        metricNode0.setPassQps(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource=''}" + "'", str7.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource=''}"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps((long) (short) -1);
        java.lang.String str3 = metricNode0.toString();
        java.lang.String str4 = metricNode0.getResource();
        metricNode0.setExceptionQps((long) 1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=-1, rt=0, resource='null'}" + "'", str3.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=-1, rt=0, resource='null'}"));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromThinString("0|MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}|0|-1|35|0|0");
        org.junit.Assert.assertNotNull(metricNode1);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}");
        java.lang.String str5 = metricNode0.getResource();
        metricNode0.setBlockQps(100L);
        java.lang.String str8 = metricNode0.toFatString();
        java.lang.Class<?> wildcardClass9 = metricNode0.getClass();
        java.lang.String str10 = metricNode0.toString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str5.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0|1969-12-31 16:00:00|MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}|0|100|0|0|0\n" + "'", str8.equals("0|1969-12-31 16:00:00|MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}|0|100|0|0|0\n"));
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=100, successQps=0, exceptionQps=0, rt=0, resource='MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}'}" + "'", str10.equals("MetricNode{timestamp=0, passQps=0, blockQps=100, successQps=0, exceptionQps=0, rt=0, resource='MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}'}"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setPassQps((long) (byte) 0);
        long long9 = metricNode0.getBlockQps();
        long long10 = metricNode0.getRt();
        long long11 = metricNode0.getPassQps();
        metricNode0.setRt(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        java.lang.String str6 = metricNode0.getResource();
        long long7 = metricNode0.getRt();
        long long8 = metricNode0.getTimestamp();
        long long9 = metricNode0.getPassQps();
        long long10 = metricNode0.getTimestamp();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setExceptionQps(0L);
        metricNode0.setSuccessQps((long) 'a');
        java.lang.String str6 = metricNode0.toString();
        metricNode0.setPassQps((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=97, exceptionQps=0, rt=0, resource='null'}" + "'", str6.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=97, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromFatString("0|1969-12-31 16:00:00||0|0|52|0|0\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0\n\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps((long) (short) 1);
        long long3 = metricNode0.getTimestamp();
        long long4 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        long long6 = metricNode0.getTimestamp();
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        metricNode0.setRt((long) ' ');
        metricNode0.setSuccessQps((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setTimestamp((long) (short) -1);
        metricNode0.setSuccessQps((long) 'a');
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=1, rt=0, resource='null'}");
        metricNode0.setBlockQps((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setRt(100L);
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        metricNode0.setPassQps((long) '#');
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=100, resource='null'}");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getBlockQps();
        metricNode0.setBlockQps((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setResource("");
        metricNode0.setBlockQps((long) ' ');
        java.lang.String str9 = metricNode0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=32, successQps=100, exceptionQps=0, rt=0, resource=''}" + "'", str9.equals("MetricNode{timestamp=0, passQps=0, blockQps=32, successQps=100, exceptionQps=0, rt=0, resource=''}"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getBlockQps();
        long long5 = metricNode0.getRt();
        java.lang.String str6 = metricNode0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}" + "'", str6.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setSuccessQps(0L);
        long long6 = metricNode0.getRt();
        long long7 = metricNode0.getPassQps();
        long long8 = metricNode0.getPassQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setTimestamp((long) (short) -1);
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource=''}");
        long long8 = metricNode0.getPassQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getTimestamp();
        long long5 = metricNode0.getRt();
        metricNode0.setSuccessQps((long) 10);
        metricNode0.setTimestamp((long) (short) 10);
        metricNode0.setBlockQps(1L);
        long long12 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setTimestamp((long) (byte) 1);
        long long3 = metricNode0.getExceptionQps();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        long long4 = metricNode0.getRt();
        metricNode0.setSuccessQps((long) '#');
        long long7 = metricNode0.getExceptionQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromFatString("MetricNode{timestamp=1, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"MetricNode{timestamp=1, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        metricNode0.setTimestamp((long) 1);
        long long5 = metricNode0.getRt();
        long long6 = metricNode0.getSuccessQps();
        long long7 = metricNode0.getBlockQps();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getTimestamp();
        long long5 = metricNode0.getRt();
        metricNode0.setSuccessQps((long) 10);
        metricNode0.setTimestamp((long) (short) 10);
        metricNode0.setBlockQps(1L);
        long long12 = metricNode0.getSuccessQps();
        long long13 = metricNode0.getBlockQps();
        long long14 = metricNode0.getPassQps();
        metricNode0.setExceptionQps(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        long long4 = metricNode0.getRt();
        metricNode0.setExceptionQps((long) 10);
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        long long8 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setPassQps((long) (byte) 0);
        long long9 = metricNode0.getBlockQps();
        long long10 = metricNode0.getBlockQps();
        long long11 = metricNode0.getRt();
        java.lang.String str12 = metricNode0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}" + "'", str12.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getExceptionQps();
        java.lang.String str2 = metricNode0.toString();
        java.lang.String str3 = metricNode0.toString();
        long long4 = metricNode0.getTimestamp();
        metricNode0.setExceptionQps((long) 0);
        metricNode0.setTimestamp((long) ' ');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str2.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str3.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setRt(100L);
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        java.lang.String str8 = metricNode0.toString();
        long long9 = metricNode0.getExceptionQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=100, resource='null'}" + "'", str8.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=100, resource='null'}"));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getTimestamp();
        long long5 = metricNode0.getRt();
        java.lang.String str6 = metricNode0.toString();
        metricNode0.setPassQps((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}" + "'", str6.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setRt(100L);
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        long long8 = metricNode0.getBlockQps();
        metricNode0.setTimestamp((long) (short) 0);
        java.lang.String str11 = metricNode0.toString();
        long long12 = metricNode0.getExceptionQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=100, resource='null'}" + "'", str11.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=100, resource='null'}"));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        java.lang.Class<?> wildcardClass6 = metricNode0.getClass();
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        long long8 = metricNode0.getBlockQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setResource("");
        long long7 = metricNode0.getPassQps();
        metricNode0.setSuccessQps((long) '4');
        java.lang.String str10 = metricNode0.toFatString();
        java.lang.String str11 = metricNode0.getResource();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0|1969-12-31 16:00:00||0|0|52|0|0\n" + "'", str10.equals("0|1969-12-31 16:00:00||0|0|52|0|0\n"));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setSuccessQps(0L);
        long long6 = metricNode0.getRt();
        long long7 = metricNode0.getExceptionQps();
        long long8 = metricNode0.getRt();
        long long9 = metricNode0.getTimestamp();
        java.lang.String str10 = metricNode0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str10.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        java.lang.String str3 = metricNode0.toString();
        long long4 = metricNode0.getBlockQps();
        metricNode0.setExceptionQps((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str3.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps(0L);
        java.lang.Class<?> wildcardClass3 = metricNode0.getClass();
        metricNode0.setBlockQps((-1L));
        metricNode0.setBlockQps((long) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps((long) (short) 1);
        metricNode0.setTimestamp((long) (short) -1);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setRt(100L);
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        long long8 = metricNode0.getBlockQps();
        long long9 = metricNode0.getBlockQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setPassQps((long) (byte) 0);
        long long9 = metricNode0.getRt();
        metricNode0.setRt(100L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}");
        metricNode0.setBlockQps((long) (byte) -1);
        long long7 = metricNode0.getSuccessQps();
        metricNode0.setSuccessQps((long) '#');
        long long10 = metricNode0.getTimestamp();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        long long6 = metricNode0.getTimestamp();
        metricNode0.setRt((long) (byte) 1);
        java.lang.String str9 = metricNode0.getResource();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        try {
            com.alibaba.csp.sentinel.node.metric.MetricNode metricNode1 = com.alibaba.csp.sentinel.node.metric.MetricNode.fromFatString("0|1969-12-31 16:00:00||0|0|100|0|0\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0\n\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setRt(100L);
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        long long8 = metricNode0.getBlockQps();
        metricNode0.setTimestamp((long) (short) 0);
        metricNode0.setSuccessQps((long) (short) 100);
        java.lang.String str13 = metricNode0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=100, resource='null'}" + "'", str13.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=100, resource='null'}"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setResource("");
        long long7 = metricNode0.getRt();
        java.lang.String str8 = metricNode0.toThinString();
        long long9 = metricNode0.getPassQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0||0|0|100|0|0" + "'", str8.equals("0||0|0|100|0|0"));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setResource("");
        java.lang.String str7 = metricNode0.toString();
        metricNode0.setBlockQps(97L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource=''}" + "'", str7.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource=''}"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getBlockQps();
        long long5 = metricNode0.getSuccessQps();
        java.lang.Class<?> wildcardClass6 = metricNode0.getClass();
        java.lang.String str7 = metricNode0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}" + "'", str7.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setExceptionQps(0L);
        metricNode0.setSuccessQps((long) 'a');
        metricNode0.setRt(0L);
        metricNode0.setRt((long) (byte) -1);
        long long10 = metricNode0.getPassQps();
        metricNode0.setResource("0|MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}|0|-1|35|0|0");
        long long13 = metricNode0.getSuccessQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setTimestamp((long) (byte) 1);
        long long3 = metricNode0.getRt();
        java.lang.String str4 = metricNode0.toString();
        long long5 = metricNode0.getTimestamp();
        metricNode0.setPassQps((long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MetricNode{timestamp=1, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str4.equals("MetricNode{timestamp=1, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        java.lang.String str6 = metricNode0.getResource();
        metricNode0.setSuccessQps((long) '#');
        long long9 = metricNode0.getPassQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setRt(100L);
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        long long8 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps(0L);
        metricNode0.setRt((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setRt(100L);
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        long long8 = metricNode0.getBlockQps();
        metricNode0.setTimestamp((long) (short) 0);
        java.lang.String str11 = metricNode0.toString();
        long long12 = metricNode0.getTimestamp();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=100, resource='null'}" + "'", str11.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=100, resource='null'}"));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setExceptionQps(0L);
        metricNode0.setSuccessQps((long) 'a');
        metricNode0.setRt(0L);
        metricNode0.setRt((long) (byte) -1);
        long long10 = metricNode0.getPassQps();
        metricNode0.setResource("0|MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}|0|-1|35|0|0");
        metricNode0.setPassQps((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getTimestamp();
        long long5 = metricNode0.getRt();
        metricNode0.setRt((long) (short) 0);
        java.lang.String str8 = metricNode0.getResource();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        long long4 = metricNode0.getRt();
        long long5 = metricNode0.getPassQps();
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setRt((long) 0);
        long long9 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps(0L);
        java.lang.Class<?> wildcardClass3 = metricNode0.getClass();
        java.lang.Class<?> wildcardClass4 = metricNode0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        java.lang.String str6 = metricNode0.getResource();
        long long7 = metricNode0.getRt();
        java.lang.String str8 = metricNode0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MetricNode{timestamp=0, passQps=100, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str8.equals("MetricNode{timestamp=0, passQps=100, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getTimestamp();
        long long5 = metricNode0.getRt();
        metricNode0.setSuccessQps((long) 10);
        metricNode0.setTimestamp((long) (short) 10);
        metricNode0.setBlockQps(1L);
        long long12 = metricNode0.getSuccessQps();
        long long13 = metricNode0.getBlockQps();
        metricNode0.setPassQps((long) '#');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}");
        java.lang.String str5 = metricNode0.getResource();
        metricNode0.setBlockQps(100L);
        java.lang.String str8 = metricNode0.toFatString();
        java.lang.String str9 = metricNode0.toFatString();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str5.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0|1969-12-31 16:00:00|MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}|0|100|0|0|0\n" + "'", str8.equals("0|1969-12-31 16:00:00|MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}|0|100|0|0|0\n"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0|1969-12-31 16:00:00|MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}|0|100|0|0|0\n" + "'", str9.equals("0|1969-12-31 16:00:00|MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}|0|100|0|0|0\n"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setTimestamp((long) (short) -1);
        long long6 = metricNode0.getRt();
        long long7 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setRt(100L);
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        java.lang.String str8 = metricNode0.toString();
        java.lang.Class<?> wildcardClass9 = metricNode0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=100, resource='null'}" + "'", str8.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=100, exceptionQps=0, rt=100, resource='null'}"));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setTimestamp((long) (byte) 1);
        long long3 = metricNode0.getRt();
        java.lang.String str4 = metricNode0.toString();
        metricNode0.setBlockQps(100L);
        long long7 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MetricNode{timestamp=1, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str4.equals("MetricNode{timestamp=1, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setTimestamp((long) (byte) 1);
        long long3 = metricNode0.getRt();
        long long4 = metricNode0.getBlockQps();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        metricNode0.setTimestamp((long) (-1));
        long long8 = metricNode0.getTimestamp();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        java.lang.String str6 = metricNode0.getResource();
        java.lang.Class<?> wildcardClass7 = metricNode0.getClass();
        long long8 = metricNode0.getRt();
        long long9 = metricNode0.getTimestamp();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getRt();
        java.lang.String str2 = metricNode0.getResource();
        long long3 = metricNode0.getSuccessQps();
        long long4 = metricNode0.getSuccessQps();
        java.lang.Class<?> wildcardClass5 = metricNode0.getClass();
        java.lang.String str6 = metricNode0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str6.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setResource("");
        metricNode0.setBlockQps((long) ' ');
        long long9 = metricNode0.getExceptionQps();
        metricNode0.setBlockQps((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setRt(0L);
        metricNode0.setPassQps((long) (byte) 100);
        metricNode0.setTimestamp((long) (byte) 1);
        metricNode0.setSuccessQps((long) 10);
        metricNode0.setPassQps((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setExceptionQps((long) (-1));
        long long3 = metricNode0.getRt();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getSuccessQps();
        metricNode0.setPassQps((long) (byte) 0);
        long long9 = metricNode0.getBlockQps();
        long long10 = metricNode0.getBlockQps();
        long long11 = metricNode0.getRt();
        long long12 = metricNode0.getExceptionQps();
        metricNode0.setExceptionQps((long) 1);
        long long15 = metricNode0.getExceptionQps();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        metricNode0.setPassQps((long) (-1));
        long long6 = metricNode0.getExceptionQps();
        java.lang.String str7 = metricNode0.toString();
        java.lang.String str8 = metricNode0.toString();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MetricNode{timestamp=0, passQps=-1, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}" + "'", str7.equals("MetricNode{timestamp=0, passQps=-1, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MetricNode{timestamp=0, passQps=-1, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}" + "'", str8.equals("MetricNode{timestamp=0, passQps=-1, blockQps=0, successQps=100, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        metricNode0.setBlockQps(0L);
        metricNode0.setResource("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}");
        java.lang.String str5 = metricNode0.getResource();
        java.lang.String str6 = metricNode0.getResource();
        java.lang.String str7 = metricNode0.getResource();
        java.lang.String str8 = metricNode0.getResource();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str5.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str6.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str7.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}" + "'", str8.equals("MetricNode{timestamp=0, passQps=0, blockQps=0, successQps=0, exceptionQps=0, rt=0, resource='null'}"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.alibaba.csp.sentinel.node.metric.MetricNode metricNode0 = new com.alibaba.csp.sentinel.node.metric.MetricNode();
        long long1 = metricNode0.getBlockQps();
        metricNode0.setSuccessQps((long) 100);
        long long4 = metricNode0.getExceptionQps();
        metricNode0.setResource("");
        long long7 = metricNode0.getRt();
        long long8 = metricNode0.getTimestamp();
        metricNode0.setSuccessQps((long) (byte) 10);
        java.lang.Class<?> wildcardClass11 = metricNode0.getClass();
        metricNode0.setRt(10L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
}

