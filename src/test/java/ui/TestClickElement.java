package ui;

import org.example.InItDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestClickElement {
    HomePage homepage = new HomePage(new InItDriver(new ChromeDriver()));


    @Test
    public void clickTest() {

        homepage.clickOnElements();

    }

}
