package menu;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestDropDownMenu extends CommonAPI {
    @Test
    public void menu(){
        List<WebElement> menu = driver.findElements(By.cssSelector(".nav-search-dropdown.searchSelect option"));
        for (WebElement element:menu)
            System.out.println(element.getText());
    }

}
