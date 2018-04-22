package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchInput extends CommonAPI {
    @Test
    public void test1()
    {
       SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
       searchPage.searchItem();
    }
}
