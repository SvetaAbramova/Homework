package ui;


import org.example.InItDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestHoverElement {


    ListHomePage homePage = new ListHomePage(new InItDriver(new ChromeDriver()));


    //TopAds topPage = new TopAds(new InItDriver(new ChromeDriver()));


    @Test
    public void hoverTest() {

        homePage.hover();
    }

    @Test
    public void hoverTest2() {
        homePage.hover();
        homePage.clickEl();
    }

    @Test
    public void clickTest() {


    }
}
