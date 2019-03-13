package login;

import base.CommonAPI;
import org.testng.annotations.Test;

public class LoginTest extends CommonAPI {
    @Test
    public void logIn(){
        clickByXpath("//*[@id='nav-link-accountList']/span[1]");
        typeByCss("#ap_email","This is email");
        typeByCss("#ap_password","1234567890");
        clearField("//*[@id='ap_password']");
        goBackToHomeWindow();

    }

}
