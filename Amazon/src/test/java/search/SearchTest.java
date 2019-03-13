package search;

import base.CommonAPI;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {

    @Test
    public void search() {
        typeOnCss("#twotabsearchtextbox", "iPhone");
        takeEnterKeys("#twotabsearchtextbox");

       // clickOnCss("input.nav-input");
        clearField("//*[@id='twotabsearchtextbox']");
        typeByXpath("//*[@id='twotabsearchtextbox']","T-shirt");
        clickOnCss("input.nav-input");
        navigateBack();

    }


}
