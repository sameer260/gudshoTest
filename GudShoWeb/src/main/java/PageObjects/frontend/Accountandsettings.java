package PageObjects.frontend;

import java.util.List;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Resources.Base_setup;



public class Accountandsettings extends Base_setup
{
	public static Logger log=Logger.getLogger(Accountandsettings.class.getName());
	public static By mousehoveronprofile=By.xpath("//div[@class='user-details ng-star-inserted']");
	public static By accountandsettingslink=By.linkText("Account & Settings");
	public static By myprofiletab=By.xpath("//*[contains(text(),'My Profile')]");
	public static By firstname=By.xpath("//input[@id='profile-firstname']");
	public static By emailid=By.id("profile-email");
	public static By DOBfield=By.xpath("//*[@placeholder='DD-MM-YYYY']");
	public static By gender=By.xpath("//mat-radio-group[@role='radiogroup']/mat-radio-button//label/div[2]");
	public static By genderradio=By.xpath("//mat-radio-group[@role='radiogroup']/mat-radio-button//label/div[1]");
	public static By savebutton=By.xpath("//div[@class='form-submit']/button");
	public static By changepasswordlink=By.xpath("//div[text()='Change Password']");
	public static By oldpassword=By.id("oldpassword");
	public static By newpassword=By.id("password");
	public static By confirmpassword=By.id("confirmpassword");
	public static By errormessage=By.xpath("//div[@class='error ng-star-inserted']");
	public static By signout=By.xpath("//div[@class='dropdown']/ul/li/ul/li[4]");
	public static By helppagelink=By.linkText("Help");
	public static By submitbutton=By.id("submit-btn");
	public static By emailidfield=By.id("profile-email");
	public static By calendericon=By.xpath("//button[@class='mat-icon-button mat-button-base']");
	public static By yearbutton=By.xpath("//button[@class='mat-calendar-period-button mat-button mat-button-base']");
	public static By commonselect=By.xpath("//table[@class='mat-calendar-table']/tbody/tr//td/div");
	public static By prevoiusbutton=By.xpath("//button[@class='mat-calendar-previous-button mat-icon-button mat-button-base']");
	public static By nextbutton=By.xpath("//button[@class='mat-calendar-next-button mat-icon-button mat-button-base']");
	public static By uploadphotoicon=By.xpath("//span[@class='upload-link cursor']");
	public static By uploadsubmit=By.xpath("//div[@class='image-submit']/button[2]");
	public static By placeholdersinchangepassword=By.xpath("//div[@class='form-input']/label");
	public static By eyeiconslistinchnagepassword=By.xpath("//div[@class='form-container']/form/div/div");
	public static By uploadcancel=By.xpath("//div[@class='image-submit']/button[1]");
	
	//Payments Tab(For success and Failed Payments)
	public static By Paymentstab=By.xpath("//*[contains(text(),'Payments')]");
	public static By tablehead=By.xpath("//thead[@role='rowgroup']/tr/th");
	public static By allrowscountperpage=By.xpath("//tbody[@role='rowgroup']/tr");
	public static By rows=By.xpath("//tbody[@role='rowgroup']/tr/td");
	public static By paginatortext=By.xpath("//div[@class='mat-paginator-container']/div[1]/div");
	public static By paginatornumberindropdown=By.xpath("//mat-option[@role='option']");
	public static By paginatordropdown=By.xpath("//div[@class='mat-paginator-container']/div/mat-form-field");
	public static By paginationnumbers=By.xpath("//div[@class='mat-paginator-container']/div[2]/div");
	public static By nextandpreviousarrows=By.xpath("//div[@class='mat-paginator-container']/div[2]/button");
	public static By paginationdropdown=By.xpath("//div[@class='mat-paginator-container']/div[1]/mat-form-field");
	public static By shoorseriesnames=By.xpath("//div[@class='payment-history-sho-name flex']/span[1]");
	public static By shoorseriesnamelabel=By.xpath("//div[@class='payment-history-sho-name flex']/span[2]");
	public static By successtext=By.xpath("//tbody[@role='rowgroup']/tr/td[8]");
	
	public static WebElement Paymentstab()
	{
		return driver.findElement(Paymentstab);
	}
	public static List<WebElement> tablehead()
	{
		return driver.findElements(tablehead);
	}
	public static List<WebElement> rows()
	{
		return driver.findElements(rows);
	}
	public static WebElement paginatordropdown()
	{
		return driver.findElement(paginatordropdown);
	}
	public static WebElement paginationnumbers()
	{
		return driver.findElement(paginationnumbers);
	}
	public static List<WebElement> shoorseriesnames()
	{
		return driver.findElements(shoorseriesnames);
	}
	public static List<WebElement> shoorseriesnamelabel()
	{
		return driver.findElements(shoorseriesnamelabel);
	}
	public static WebElement paginatortext()
	{
		return driver.findElement(paginatortext);
	}
	public static List<WebElement> paginatornumberindropdown()
	{
		return driver.findElements(paginatornumberindropdown);
	}
	public static List<WebElement> allrowscountperpage()
	{
		return driver.findElements(allrowscountperpage);
	}
    
	
	
	
    public static WebElement mousehoveronprofilem()
    {
    	return driver.findElement(mousehoveronprofile);
    }
    public static WebElement accountandsettingslinkm()
    {
    	return driver.findElement(accountandsettingslink);
    }
    public static WebElement myprofiletabm()
    {
    	return driver.findElement(myprofiletab);
    }
    public static WebElement firstnamem()
    {
    	return driver.findElement(firstname);
    }
    public static WebElement DOBfieldm()
    {
    	return driver.findElement(DOBfield);
    }
    public static List<WebElement> genderm()
    {
    	return driver.findElements(gender);
    }
    public static List<WebElement> genderradiom()
    {
    	return driver.findElements(genderradio);
    }
    public static WebElement savebuttonm()
    {
    	return driver.findElement(savebutton);
    }
    public static WebElement changepasswordtabm()
    {
    	return driver.findElement(changepasswordlink);
    }
    public static WebElement oldpasswordm()
    {
    	return driver.findElement(oldpassword);
    }
    public static WebElement newpasswordm()
    {
    	return driver.findElement(newpassword);
    }
    public static WebElement confirmpasswordm()
    {
    	return driver.findElement(confirmpassword);
    }
    public static WebElement errormessagem()
    {
    	return driver.findElement(errormessage);
    }
    public static WebElement emailidm()
    {
    	return driver.findElement(emailid);
    }
    public static WebElement calendericonm()
    {
    	return driver.findElement(calendericon);
    }
    public static WebElement yearbuttonm()
    {
    	return driver.findElement(yearbutton);
    }
    public static WebElement prevoiusbuttonm()
    {
    	return driver.findElement(prevoiusbutton);
    }
    public static WebElement submitbuttonm()
    {
    	return driver.findElement(submitbutton);
    }
    public static void selectcalenderm(int year,String month,int date) throws InterruptedException
    {
    	List<WebElement> ele=driver.findElements(commonselect);
    	int a=ele.size();
    	for(int i=0;i<a;i++)
    	{
    		String str=driver.findElements(commonselect).get(i).getText();
    		int b = Integer.parseInt(str);
    		if(b==year)
    		{
    			driver.findElements(commonselect).get(i).click();
    			break;
    		}
    	}	
       List<WebElement> ele1=driver.findElements(commonselect);
    	int b=ele1.size();
    	for(int i=0;i<b;i++)
    	{
    		Thread.sleep(2000);
    		String str1=driver.findElements(commonselect).get(i).getText();
    		  if(str1.equalsIgnoreCase(month))
    		  {
    			  driver.findElements(commonselect).get(i).click();
    			  break;
    		  }
    	}	 
    	Thread.sleep(2000);
    	List<WebElement> ele2=driver.findElements(commonselect);
     	int c=ele2.size();
     	for(int i=0;i<c;i++)
    	{
    		  
    		   String str2=driver.findElements(commonselect).get(i).getText();
      		   int d = Integer.parseInt(str2);
    		  if(d==date)
    		  {
    			  driver.findElements(commonselect).get(i).click();
    			  break;
    		  }
    	}
    
    }
    public static WebElement uploadphotoiconm()
    {
    	return driver.findElement(uploadphotoicon);
    }
    public static WebElement uploadsubmitm()
    {
    	return driver.findElement(uploadsubmit);
    }
    public static List<WebElement> placeholdersinchangepassword()
    {
    	return driver.findElements(placeholdersinchangepassword);
    }
    public static WebElement uploadcancel()
    {
    	return driver.findElement(uploadcancel);
    }
    public static WebElement successtext()
    {
    	return driver.findElement(successtext);
    }
    
    
   
}
