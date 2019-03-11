package common;

import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;

public class APITestCase {

    public String runId = String.valueOf(System.currentTimeMillis()).substring(5, 12);


    @BeforeClass
    public void beforeClass(ITestContext context) {
        RestAssured.baseURI= context.getCurrentXmlTest().getParameter("BaseURI");
        Reporter.log("Test Started with runID= "+ runId,true);
        
    }
}
