package Base;

import TestData.SearchData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.lang.model.util.Elements;
import java.util.ArrayList;
import java.util.List;


public class MainPage {
    private WebDriver driver;
    private WebElement searchElement;


    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.searchElement = searchElement;
    }


    private By SearchField = By.cssSelector("#twotabsearchtextbox");
    private By SearchButton = By.cssSelector("#nav-search-submit-text");
    private By SearchElement = By.xpath("//span[@class=\"a-offscreen\"]");

    public MainPage typeSearchField(String searchData) {
        driver.findElement(SearchField).sendKeys(SearchData.SEARCH_DATA.getSearchdata());
        return this;
    }

    public MainPage clickSearchButton() {
        driver.findElement(SearchButton).click();
        return this;

    }
    public void sumOfPricesLower (double limit) {
        List<WebElement> prices = driver.findElements(SearchElement);
        double sum = 0;
                for (WebElement price: prices) {
                    String s = price.getAttribute("innerHTML").replaceAll("[$A-Za-z]", "");
                            //.getText().replaceAll("[$A-Za-z , ]", "");
                    double priceLower20 = Double.parseDouble(s);
                    if (priceLower20<limit){
                        sum = sum + priceLower20;
                    }
                }
        if (sum == 0) {
            System.out.println("No Such items");
        } else
            System.out.println("Price sum " + sum + " $");

    }

    }




