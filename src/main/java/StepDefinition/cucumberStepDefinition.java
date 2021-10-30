package StepDefinition;

import POM.CVHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.TestBase;

public class cucumberStepDefinition {
    WebDriver driver;
    TestBase sharedDriver = new TestBase();

    @Given("User open the {string} browser")
    public void user_open_the_browser(String BrowserName) {
        driver =  sharedDriver.lauchBrowser(BrowserName);
        this.driver = driver;
    }

    @Given("User visits the CV Library website")
    public void user_visits_the_cv_library_website() {
      driver.get("https://www.cv-library.co.uk/");
    }

    @When("User search for {string} role by job title")
    public void user_search_for_role_by_job_title(String jobTitle) {
        CVHomePage cvHomePage = new CVHomePage(driver);
        cvHomePage.fillJobTitle(jobTitle);
        cvHomePage.ClickOnFindJobs();

    }
    @Then("All the search result should display relevant to {string} job role")
    public void all_the_search_result_should_display_relevant_to_job_role(String jobTitle) throws InterruptedException {
        CVHomePage cvHomePage = new CVHomePage(driver);
        Assert.assertTrue(cvHomePage.GetJobTitle().contains(jobTitle));
        driver.close();

    }

    @When("User search for job roles by location {string}")
    public void user_search_for_job_roles_by_location(String location) {
        CVHomePage cvHomePage = new CVHomePage(driver);
        cvHomePage.fillJobLocation(location);
        cvHomePage.ClickOnFindJobs();
    }

    @Then("All the search result should display relevant to {string} location")
    public void all_the_search_result_should_display_relevant_to_location(String location) throws InterruptedException {
        CVHomePage cvHomePage = new CVHomePage(driver);
        Assert.assertTrue(cvHomePage.getJobLocation().contains(location));
        driver.close();
    }

    @Given("User clicks on Search more options to get more options")
    public void user_clicks_on_to_get_more_options() {
        CVHomePage cvHomePage = new CVHomePage(driver);
        cvHomePage.ClickOnMoreOptions();
    }

    @When("User selects {string} job type")
    public void user_selects_job_type(String jobType) {
        CVHomePage cvHomePage = new CVHomePage(driver);
        cvHomePage.selectJobType(jobType);
    }

    @Then("All the search result should display relevant to {string} by job type")
    public void all_the_search_result_should_display_relevant_to_by_job_type(String jobType) throws InterruptedException {
        CVHomePage cvHomePage = new CVHomePage(driver);
        Assert.assertTrue(cvHomePage.getJobType().contains(jobType));
        driver.close();
    }
}
