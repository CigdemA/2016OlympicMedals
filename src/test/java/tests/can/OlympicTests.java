package tests.can;

import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.*;
import utilities.TestBase;

import java.util.List;

    public class OlympicTests extends TestBase {

        OlympicTablePage olympic;
        MedalsPage medalsPage;
        Countries countries;
        Index index;
        Sum sum;
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
            medalsPage.getMostBronzeMedalCountry();
            medalsPage.getMostGoldMedalCountry();
            medalsPage.getMostSilverMedalCountry();
            medalsPage.getMostMedalCountry();

        }

        @Test
        public void country(){
            countries = new Countries(driver);
            countries.silverCountries();
        }

        @Test
        public void getIndex(){
            index = new Index(driver);
            index.getCell("United States");
        }

        @Test
        public void getSum() {
            sum = new Sum(driver);
            sum.sumMedals();
        }
}
