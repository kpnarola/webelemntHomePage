package comnopcommercedemo;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    //click on Appareal category
    public void clickOnAppareal() {
        clickOnElement(By.linkText("Apparel"));
    }

    public void clickOnBookCategory() {
        clickOnElement(By.linkText("Books"));
    }

    public void clickOnComputerCategory() {
        clickOnElement(By.linkText("Computers"));
    }

    public void clickOnDigitalDownloadsCategory() {
        clickOnElement(By.linkText("Digital downloads"));

    }

    public void clickOnElectronicsCategory() {
        clickOnElement(By.linkText("Electronics"));

    }

    public void clickOnGiftCardsCategory() {
        clickOnElement(By.linkText("Gift Cards"));

    }
    public void clickOnJewelryCategory() {
        clickOnElement(By.linkText("Jewelry"));

    }
}
