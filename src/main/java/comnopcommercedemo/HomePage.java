package comnopcommercedemo;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    //click on Appareal category
    public void clickOnAppareal(){
        clickOnElement(By.linkText("Apparel"));
    }
    public void clickOnBookCategory(){
        clickOnElement(By.linkText("Books"));
    }


}
