package home;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.ArrayList;

import java.awt.*;
import java.util.ArrayList;

public class SearchPage {
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchInputField;

    public WebElement getSearchInputField() {
        return searchInputField;
    }
    public void setSearchInputField(WebElement searchInputField) {
        this.searchInputField = searchInputField;
    }
    public void searchItem() {
        List<String> itemList = getItemValues();
        for (String st : itemList) {
            getSearchInputField().sendKeys(st, Keys.ENTER);
            getSearchInputField().clear();
        }
    }
    public List<String> getItemValues(){
        List<String> itemList = new ArrayList<String>();
        itemList.add("Apple Watch");
        itemList.add("Apple iPad");
        itemList.add("IPhone");
    return itemList;
    }

}
