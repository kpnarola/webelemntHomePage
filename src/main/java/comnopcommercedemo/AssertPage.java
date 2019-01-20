package comnopcommercedemo;

import org.openqa.selenium.By;

public class AssertPage extends Utils{

    public void toVerifyApparealPage(){
        assertByGetText("Apparel", By.xpath("//div[@class='page-title']"),"User is not on ApparelPage");
    }
    public void toVerifyBookPage(){
        assertByGetText("Books",By.xpath("//div[@class='page-title']"),"User is not on book page");
    }
}
