package test;

import com.google.inject.Inject;
import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import page.OnlinerLoginPage;
import page.OnlinerPage;
import utils.WaitUtils;

import static org.hamcrest.MatcherAssert.assertThat;

@Guice
public class OnlinerTest extends BaseWebTest{

    @Inject
    public OnlinerPage onlinerPage;
    @Inject
    public OnlinerLoginPage onlinerLoginPage;

    @BeforeClass
    public void openAndLogin(){
        onlinerPage.navigate();
        onlinerPage.clickEnterButton();
        onlinerLoginPage.fillPasswordField("1234");
        onlinerLoginPage.fillEmailField("23424");
        onlinerLoginPage.clickSubmitButton();
    }

    @Test
    public void checkSomething(){
        WaitUtils.sleepSeconds(1);
        assertThat("bla,bla","123", Matchers.equalTo("123"));

    }
}
