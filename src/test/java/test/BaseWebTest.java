package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.DriverUtils;

public class BaseWebTest {
    @BeforeSuite
    public void openBrowser(){
        DriverUtils.openBrowser();
        DriverUtils.browserConfiguration();
    }

    @AfterSuite
    public void closeBrowser(){
        DriverUtils.closeBrowser();
    }
}
