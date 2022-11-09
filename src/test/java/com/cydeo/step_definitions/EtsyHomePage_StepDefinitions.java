package com.cydeo.step_definitions;


import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;






public class EtsyHomePage_StepDefinitions {


    EtsyPage etsyPage = new EtsyPage();

    @Given("user goes to Etsy homepage")
    public void user_goes_to_etsy_homepage(String expectedTitle) {
        Driver.getDriver().get("https://www.etsy.com");

    }

    @When("user able to see title")
    public void user_able_to_see_title(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }

}


//
//    @Given("user goes to Etsy homepage")
//    public void user_goes_to_etsy_homepage() {
//        // Write code here that turns the phrase above into concrete actions
//
//        Driver.getDriver().get("https://www.etsy.com");
//
//    }
//
//    @When("user able to see title")
//    public void user_able_to_see_title(String expectedTitle) {
//
//        // Write code here that turns the phrase above into concrete actions
//       String actualTitle = Driver.getDriver().getTitle();
//
//       Assert.assertEquals(expectedTitle,actualTitle);
//    }
//
//
//}
