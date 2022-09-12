
package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_page;
import generic.Reusablemethods;

public class OnlineShoppingSitePage extends Base_page
{
 public OnlineShoppingSitePage(WebDriver driver) 
{
		super(driver);
}
    @FindBy(xpath ="(//input[@type='text'])[2]")
    private WebElement uname;
    @FindBy(xpath ="//input[@type='password']")
    private WebElement pword;
    @FindBy(xpath ="(//button[@type='submit'])[2]")
    private WebElement login;
    @FindBy(xpath = "//div[@class='xtXmba']")
	private WebElement fashion;
    @FindBy(xpath = "//span[.='Men']")
    private WebElement hovermen;
    @FindBy(xpath = "//a[.='T-Shirts']")
    private WebElement tshirt;
	@FindBy(xpath = "(//div[@class='_312yBx SFzpgZ'])[2]")
	private WebElement mentopwear;
    public void setusername(String username)
    {
       uname.sendKeys(username);
     }
    public void setpassword(String password)
    {
         pword.sendKeys(password);
    }
    public void clicklogin()
    {
    	login.click();
    	
    }
   
    public void title(WebDriver driver) throws InterruptedException
    {
    	String title = "Online Shopping Site for Mobiles";
        verifyTitle(title,40);
        Thread.sleep(3000);
        
    }
    public void fashion(WebDriver driver)
	{
		verifyElement(fashion, 20);
		fashion.click();
	}
	public void hover(WebDriver driver) throws InterruptedException
	{
		verifyElement(hovermen, 10);
		Reusablemethods obj = new Reusablemethods();
		obj.mousehover(driver, hovermen);
		Thread.sleep(5000);
	}
	public void Tshirt(WebDriver driver) throws InterruptedException
	{
		verifyElement(tshirt, 20);
		Thread.sleep(3000);
		tshirt.click();
	}
	public void mentopwear(WebDriver driver)
	{
		verifyElement(mentopwear, 10);
		mentopwear.click();
	}  

	public void switchwindow()
	{
		Reusablemethods childbrowser = new Reusablemethods();
		childbrowser.windowhandler(driver);
	}
	
}
