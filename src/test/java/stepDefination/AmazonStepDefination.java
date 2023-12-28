package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefination {
    AmazonPage amazonPage=new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.GetDriver().get(ConfigReader.getProperty("amazonURL"));
        amazonPage.cookies.click();

    }
    @When("kullanici Iphone aratir")
    public void kullanici_ıphone_aratir() {
        amazonPage.searchBox.sendKeys("Iphone", Keys.ENTER);

    }
    @Then("kullanici sonuclarin Iphone icerdigini test eder")
    public void kullanici_sonuclarin_ıphone_icerdigini_test_eder() {
        Assert.assertTrue(amazonPage.countIphone.isDisplayed());

    }
    @Then("Istifadeci sehifeni baglar")
    public void ıstifadeci_sehifeni_baglar() {
        Driver.quitDriver();

    }

}
