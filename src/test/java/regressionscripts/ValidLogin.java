package regressionscripts;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Datadriven_excelread;
import generic.Generic_Test;
import pom.OnlineShoppingSitePage;
import pom.RaymondMenSelfDesignFormalBlueShirt;

public class ValidLogin extends Generic_Test
{
	@Test
	 public void validlogin() throws InterruptedException
	   {   
		   String username = Datadriven_excelread.getData("Sheet1", 1, 0);
		   String password = Datadriven_excelread.getData("Sheet1", 1, 1);
		   OnlineShoppingSitePage lp = new OnlineShoppingSitePage(driver);
		        lp.setusername(username);
		        lp.setpassword(password);
				lp.clicklogin();
			    lp.title(driver);
				Thread.sleep(3000);
                lp.fashion(driver);
                lp.hover(driver);
                lp.Tshirt(driver);
                lp.mentopwear(driver);
			    lp.switchwindow();
			    RaymondMenSelfDesignFormalBlueShirt hp = new RaymondMenSelfDesignFormalBlueShirt(driver);
			    hp.title(driver);
			    Thread.sleep(3000);
			    hp.productsize();
			    hp.Click();
			    Thread.sleep(3000);
			    hp.removefromcart();
			    Thread.sleep(3000);
			    hp.removecartpopup();
			    hp.Myaccount();
			    hp.Logout();  
			   
			
}

}
