package comnopcommercedemo;

import org.openqa.selenium.By;

public class AssertPage extends Utils{

    public void toVerifyApparealPage(){
        assertByGetText("Apparel", By.xpath("//div[@class='page-title']"),"User is not on ApparelPage");
    }
    public void toVerifyBookPage(){
        assertByGetText("Books",By.xpath("//div[@class='page-title']"),"User is not on book page");
    }
    public void toVerifyComputerPage(){
        assertByGetText("Computers",By.xpath("//div[@class='page-title']"),"User is not on computer page");
    }
    public void toVerifyDigitalDownloadsPage(){
        assertByGetText("Digital downloads",By.xpath("//div[@class='page-title']"),
                "User is not on Digital Downloads Page ");
    }
    public void toVerifyElectronicsPage(){
        assertByGetText("Electronics",By.xpath("//div[@class='page-title']"),
                "User is not on Electronics Page ");
    }
    public void toVerifyGiftCardsPage(){
        assertByGetText("Gift Cards" ,By.xpath("//div[@class='page-title']"),
                "User is not on Gift Cards Page ");
    }
    public void toVerifyJewelryPage(){
        assertByGetText("Jewelry",By.xpath("//div[@class='page-title']"),
                "User is not on Jewelry Page ");
    }
}
