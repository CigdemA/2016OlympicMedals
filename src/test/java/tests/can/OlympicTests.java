package tests.can;

import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.MedalsPage;
import pages.OlympicTablePage;
import utilities.TestBase;

import java.util.List;

    public class OlympicTests extends TestBase {

        OlympicTablePage olympic;
        MedalsPage medalsPage;

        @Test
        public void sort() {
            olympic = new OlympicTablePage(driver);
            olympic.order();
            olympic.noc.click();
            olympic.countryAsci();
            olympic.orderAfterRank();

        }
        @Test
        public void medal(){
            medalsPage = new MedalsPage(driver);
         //   System.out.println(medalsPage.goldMedals());
            medalsPage.getMostBronzeMedalCountry();
            medalsPage.getMostGoldMedalCountry();
            medalsPage.getMostSilverMedalCountry();
            medalsPage.getMostMedalCountry();

        }
}
