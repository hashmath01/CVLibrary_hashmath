package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CVHomePage {

    WebDriver driver;

    public CVHomePage(WebDriver driver){
        this.driver = driver;
    }

    private static final By JOB_TITLE_XPATH = By.xpath("//input[@id='keywords']");
    private static final By FIND_JOB_XPATH = By.xpath("//input[@type='submit']");
    private static final By RESULT_JOB_TITLE_XPATH = By.xpath("//ol[@id='searchResults']//li[1]/article//h2");
    private static final By JOB_LOCATION_XPATH = By.xpath("//input[@id='location']");
    private static final By RESULT_JOB_LOCATION_XPATH = By.xpath("//ol[@id='searchResults']//li[1]/article//dl/dd[2]/span");
    private static final By GET_MORE_OPTIONS_XPATH = By.xpath("//button[@id='toggle-hp-search']");
    private static final By JOB_TYPE_XPATH = By.xpath("//select[@id='tempperm']");
    private static final By RESULT_JOB_TYPE_XPATH = By.xpath("//ol[@id='searchResults']//li[1]/article//dl//dd[3]");

    public void fillJobTitle(String jobTitle){
        driver.findElement(JOB_TITLE_XPATH).sendKeys(jobTitle);

    }

    public void ClickOnFindJobs(){
        driver.findElement(FIND_JOB_XPATH).click();
    }

    public String GetJobTitle() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(RESULT_JOB_TITLE_XPATH).getText();
    }

    public void fillJobLocation(String jobLocation){
        driver.findElement(JOB_LOCATION_XPATH).sendKeys(jobLocation);

    }

    public String getJobLocation() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(RESULT_JOB_LOCATION_XPATH).getText();
    }

    public void ClickOnMoreOptions(){
        driver.findElement(GET_MORE_OPTIONS_XPATH).click();
    }

    public void selectJobType(String JobType){
        Select jobType = new Select(driver.findElement(JOB_TYPE_XPATH));
        jobType.selectByVisibleText(JobType);
        ClickOnFindJobs();

    }

    public String getJobType() throws InterruptedException {
        Thread.sleep(3000);
        return driver.findElement(RESULT_JOB_TYPE_XPATH).getText();
    }


}
