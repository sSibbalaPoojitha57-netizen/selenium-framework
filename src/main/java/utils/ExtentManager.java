package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public final class ExtentManager {

    private static ExtentReports extent;
    private static final ThreadLocal<ExtentTest> TEST = new ThreadLocal<>();

    private ExtentManager() { }

    public static synchronized ExtentReports getExtentReports() {
        if (extent == null) {
            extent = createExtentReports();
        }
        return extent;
    }

    private static ExtentReports createExtentReports() {
        String reportPath = System.getProperty("user.dir") + "/target/extent-report.html";

        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        spark.config().setDocumentTitle("Automation Report");
        spark.config().setReportName("Regression Suite");

        ExtentReports e = new ExtentReports();
        e.attachReporter(spark);

        e.setSystemInfo("OS", System.getProperty("os.name"));
        e.setSystemInfo("Java Version", System.getProperty("java.version"));

        return e;
    }

    public static void createTest() {
        createTest(null);
    }

    public static void createTest(String testName) {
        ExtentTest test = getExtentReports().createTest(testName);
        TEST.set(test);
    }

    public static ExtentTest getTest() {
        return TEST.get();
    }

    public static void removeTest() {
        TEST.remove();
    }

    public static synchronized void flushReports() {
        if (extent != null) {
            extent.flush();
        }
    }
}
