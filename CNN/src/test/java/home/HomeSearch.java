package home;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class HomeSearch extends CommonAPI{
    @Test
    public void homePageSearch()
    {
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div[2]/a[2]")).click();
    }
}
