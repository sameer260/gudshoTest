package PageObjects.frontend;


import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import Resources.Base_setup;

public class Shoorseriesdetailpage extends Base_setup
{
	 
	videoandaudioPlayer videoaudioplayer=new videoandaudioPlayer();
	public static  By studionameonshodetailpage=By.xpath("//div[@class='studio-name']/h6");
	public static By shonameinshodetailpage=By.xpath("//div[@class='sho-content']/h1");
	public static By shoorseriestag=By.xpath("//div[@class='sho-hints banner ng-star-inserted']/ul/li[1]/span");
	public static By seasonscount=By.xpath("//div[@class='sho-hints banner ng-star-inserted']/ul/li[2]/span");
	public static By defaultgenere=By.xpath("//div[@class='sho-hints banner ng-star-inserted']/ul/li[3]/span");
	public static By defaultgenerforsho=By.xpath("//div[@class='sho-hints banner ng-star-inserted']/ul/li[2]/span");
	public static By maturitytag=By.xpath("//div[@class='sho-hints banner ng-star-inserted']/ul/li[4]/span");
	public static By maturitytagforsho=By.xpath("//div[@class='sho-hints banner ng-star-inserted']/ul/li[3]/span");
	public static By languagetag=By.xpath("//div[@class='sho-hints banner ng-star-inserted']/ul/li[5]/span");
	public static By languagetagforsho=By.xpath("//div[@class='sho-hints banner ng-star-inserted']/ul/li[4]/span");
	public static By screeneddate=By.xpath("//div[@class='sho-hints banner ng-star-inserted']/ul/li[5]/span");
	public static By screeneddateforseries=By.xpath("//div[@class='sho-hints banner ng-star-inserted']/ul/li[6]/span");
	public static By shoorseriesdescription=By.xpath("//div[@class='content ng-star-inserted']/h2");
	public static By shoorseriesdescreadmorelink=By.xpath("//div[@class='content ng-star-inserted']/span");
	public static By playorbuybutton=By.xpath("//app-gud-play-button[@class='extra-size']/ul/li");
	public static By playorbuybuttonsmall=By.xpath("//ul[@class='shocial-ticket-actions fixed-btns']/app-gud-play-button/ul/li");
	
	public static By watchlistnutton=By.xpath("//div[@class='play-share']/ul/li[1]");
	public static By headerwatchlistbutton=By.xpath("//li[@class='watch-lists']");
	public static By sharebutton=By.xpath("//div[@class='play-share']/ul/li[2]");
	public static By headershare=By.xpath("//div[@class='share-play top-fixed']");
	public static By textonbutton=By.xpath("//div[@class='play-share']/ul/app-gud-play-button/ul/li/button/span[2]");
	public static By feelersheadinginshodetailpage=By.xpath("//h6[text()=' Feelers']");
	public static By feelerssmilesnames=By.xpath("//div[@class='film-user-comments']/div/app-feelers/ul/li/span[1]");
	public static By feelerspercentage=By.xpath("//div[@class='film-user-comments']/div/app-feelers/ul/li/span[3]");	
	public static By promosheading=By.xpath("//h4[@class='slider-title ng-star-inserted']");
	public static By promoorepisodenamesonshodetailpage=By.xpath("//div[@class='card-left box-promo']/h4");
	public static By promoviewsinshodetailpage=By.xpath("//div[@class='card-right box-promo ng-star-inserted']/span");
	public static By gudcountonshodetailpage=By.xpath("//span[@class='gud-count']");
	public static By promocards=By.xpath("//div[@class='mat-ripple card-img']");
	public static By promoshareicon=By.xpath("//div[@class='see-all-image cursor']/div[1]");
	public static By Musicaltrackstitle=By.xpath("//h4[@class='musical-track-title ng-star-inserted']");
	public static By musicaltrackimage=By.xpath("//div[@class='audio-list-left']/div[1]");
	public static By commonnameofalltracks=By.xpath("//div[@class='track-details']/ul/li[1]");
	public static By trackscount=By.xpath("//div[@class='track-details']/ul/li[2]");
	public static By totaltime=By.xpath("//div[@class='track-details']/ul/li[3]");
	public static By copyrightstatement =By.xpath("//div[@class='audio-list-left']/p");
	public static By playallbutton=By.xpath("//div[@class='audio-list-left']/button");
	public static By headersofplaylisttitle=By.xpath("//div[@class='card-footer']/div/h4");
	public static By headersofplaylistcomposer=By.xpath("//div[@class='card-footer']/div/p[1]");
	public static By headerofplaylistartist=By.xpath("//div[@class='card-footer']/div/p[2]");
	public static By headerofplaylistduration=By.xpath("//div[@class='card-footer']/div/span[2]");
	public static By audionamesinshodetailpage=By.xpath("//div[@class='ng-star-inserted']/div/div/h4");
	public static By composerandartistnames=By.xpath("//div[@class='ng-star-inserted']/div/div/p");
	public static By audiodurations=By.xpath("//div[@class='ng-star-inserted']/div/div/span[3]");
	//Episode Section
	public static By episodespagelink=By.xpath("//span[@class='text']");
	public static By episodecount=By.xpath("//span[@class='text']/span[1]");
	public static By seasondropdownbox=By.xpath("//div[@id='seriesInfo']/div/mat-form-field/div");
	public static By seasonsindropdown=By.xpath("//div[@class='ng-scroll-content']/mat-option");
	public static By eoisodescards=By.xpath("//div[@class='card-main promo-card-content episode-card-content']");
	public static By mousehoveronepisodecards=By.xpath("//app-gud-card[@class='swiper-wrapper episode-wrapper']/div/div/div[1]");
	public static By episodenameinshodetailpage=By.xpath("//div[@class='card-left']/h4");
	public static By episodedscriptions=By.xpath("//p[@class='episode-description text-control-three']");
	public static By nextarrow=By.xpath("//div[@class='arrow-next-prev episodes']/div[1]");
	public static By shoorseriesnameonheader=By.xpath("//div[@class='pro-ttl']/h4");
	//Episodes page
	public static By episodecardsinepisodepage=By.xpath("//div[@class='ng-scroll-content']/app-gud-card/div");
	public static By seasondropdowninepisodeage=By.xpath("//div[@class='see-filter flex']/mat-form-field");
	public static By dropdownboxinsideepisodespage=By.xpath("//div[@class='see-filter flex']/mat-form-field/div");
	public static By seriesnameinepisodepage=By.xpath("//span[@class='episodes-sho cursor ng-star-inserted']");
	public static By episodesnamesinepisodespage=By.xpath("//h2[@class='text-control']/span");
	public static By maturityratinginepisodepage=By.xpath("//div[@class='episode-details']/span[2]");
	public static By episodeduration=By.xpath("//div[@class='episode-details']/span[1]");
	public static By episodedescriptioninepisodepage=By.xpath("//p[@class='episode-description text-control-two ng-star-inserted']");
	public static By backiconfromepisodepage=By.xpath("//span[@class='back-icon cursor']");
	//Synposis,cast and crew details
	public static By linedtitles=By.xpath("//h3[@class='lined-title']/span");
	
	public static By aboutshoorseriesheading=By.xpath("//div[@class='promo-video sho-desc']/h4");
	public static By shoorseriesdescinsynposis=By.xpath("//div[@class='detailed-desc']/p");
	public static By Specifics=By.xpath("//div[@class='sho-add-details']/div/ul/li[1]");
	public static By synopsisheadingcontent=By.xpath("//div[@class='sho-add-details']/div/ul/li[2]");
	public static By castdetailsheadings=By.xpath("//div[@class='sho-detail-left']/div/div/ul/li[1]");
	public static By castdetailsheadcontent=By.xpath("//div[@class='sho-detail-left']/div/div/ul/li[2]");
	public static By crewdetailstitle=By.xpath("//div[@class='sho-detail-right']/div/h4/span");
	public static By crewdetails=By.xpath("//div[@class='sho-detail-right']/div/div/ul/li");
	
	
	
	public static WebElement studionameonshodetailpagem()
	{
		return driver.findElement(studionameonshodetailpage);
	}
	public static WebElement shonameinshodetailspage() throws InterruptedException
	{
		return  driver.findElement(shonameinshodetailpage);   
    }
	public static WebElement shoorseriestagm()
	{
		return driver.findElement(shoorseriestag);
	}
	public static WebElement seasonscountm()
	{
		return driver.findElement(seasonscount);
	}
	public static  WebElement defaultgenerenamem()
	{
		return driver.findElement(defaultgenere);
	}
	public static WebElement maturityratingm()
	{
		return driver.findElement(maturitytag);
	}
	public static WebElement languagestagm()
	{
		return driver.findElement(languagetag);
	}
	public static WebElement shoorseriesdescriptionm()
	{
		return driver.findElement(shoorseriesdescription);
	}
	public static WebElement shoorseriesdescreadmorelinkm()
	{
		return driver.findElement(shoorseriesdescreadmorelink);
	}
	public static WebElement playorbuybuttonm()
	{
		return driver.findElement(playorbuybutton);
	}
	public static WebElement textonbuttonm()
	{
		return driver.findElement(textonbutton);
	}
	public static WebElement watchlistnuttonm()
	{
		return driver.findElement(watchlistnutton);
	}
	public static WebElement sharebuttonm()
	{
		return driver.findElement(sharebutton);
	}
	public static WebElement feelersheadinginshodetailpagem()
	{
		return driver.findElement(feelersheadinginshodetailpage);
	}
	public static List<WebElement> feelerssmilesinshodetailpagem()
	{
		return driver.findElements(feelerssmilesnames);
	}
	public static List<WebElement> feelerspercentagem()
	{
		return driver.findElements(feelerspercentage);
	}
	public static WebElement promosheadingm()
	{
		return driver.findElement(promosheading);
	}
	public static int gudcountofpromoonshodetailpage;
	public static int gudcountonshodetailpagem(String promoname)
	{
		int size= driver.findElements(promoorepisodenamesonshodetailpage).size();
	       for(int i=0;i<size;i++)
	       {
	    	   String str=driver.findElements(promoorepisodenamesonshodetailpage).get(i).getText();
	    	   if(str.equalsIgnoreCase(promoname))
	    	   {
	    		   String gudscountstr=driver.findElements(gudcountonshodetailpage).get(i).getText();
	    		   String gudcountonlystr=gudscountstr.substring(0,gudscountstr.lastIndexOf(" "));
	    		   gudcountofpromoonshodetailpage=Integer.parseInt(gudcountonlystr);  
	    		   break;
	    	   }
	       }
		return gudcountofpromoonshodetailpage;   
	}
	public static int viewcountofpromoonshodetailpage;
	public static int viewcountonshodetailpagem(String promoname)
	{
		int size= driver.findElements(promoorepisodenamesonshodetailpage).size();
	       for(int i=0;i<size;i++)
	       {
	    	   String str=driver.findElements(promoorepisodenamesonshodetailpage).get(i).getText();
	    	   if(str.equalsIgnoreCase(promoname))
	    	   {
	    		   String viewscountstr=driver.findElements(promoviewsinshodetailpage).get(i).getText();
	    		   String viewcountonlystr=viewscountstr.substring(0,viewscountstr.lastIndexOf(" "));
	    		   viewcountofpromoonshodetailpage=Integer.parseInt(viewcountonlystr);  
	    		   break;
	    		  
	    	   }
	       }
		return viewcountofpromoonshodetailpage;
		 
		
	}
	public static void promoorepisodenamesonshodetailpagem(String promoname) throws InterruptedException
	{
		  Actions a=new Actions(driver);
		   int size= driver.findElements(promoorepisodenamesonshodetailpage).size();
	       for(int i=0;i<size;i++)
	       {
	    	   String str=driver.findElements(promoorepisodenamesonshodetailpage).get(i).getText();
	    	   if(str.equalsIgnoreCase(promoname))
	    	   { 
	    		   a.moveToElement(driver.findElements(promocards).get(i)).click().build().perform();
	    		   break;
	    	   }
	       }
	}
	public static void promoorepisodenamesonshare(String promoname) throws InterruptedException
	{      Actions a=new Actions(driver);
		   int size= driver.findElements(promoorepisodenamesonshodetailpage).size();
	       for(int i=0;i<size;i++)
	       {
	    	   String str=driver.findElements(promoorepisodenamesonshodetailpage).get(i).getText();
	    	   if(str.equalsIgnoreCase(promoname))
	    	   { 
	    		   a.moveToElement(driver.findElements(promoshareicon).get(i)).click().build().perform();
	    		   break;
	    	   }
	       }
	}
	public static List<WebElement> promocardsm()
	{
		return driver.findElements(promocards);
	}
	public static WebElement Musicaltrackstitlem()
	{
		return driver.findElement(Musicaltrackstitle);
	}
	public static WebElement musicaltrackimagem()
	{
		return driver.findElement(musicaltrackimage);
	}
	public static WebElement commonnameofalltracksm()
	{
		return driver.findElement(commonnameofalltracks);
	}
	public static WebElement trackscountm()
	{
		return driver.findElement(trackscount);
	}
	public static WebElement totaldurationm()
	{
		return driver.findElement(totaltime);
	}
	public static WebElement copyrightstatementm()
	{
		return driver.findElement(copyrightstatement);
	}
	public static WebElement playallbuttonm()
	{
		return driver.findElement(playallbutton);
	}
	public static WebElement headersofplaylisttitlem()
	{
		return driver.findElement(headersofplaylisttitle);
	}
	public static WebElement headersofplaylistcomposerm()
	{
		return driver.findElement(headersofplaylistcomposer);
	}
	public static WebElement headerofplaylistartistm()
	{
		return driver.findElement(headerofplaylistartist);
	}
	public static WebElement headerofplaylistdurationm()
	{
		return driver.findElement(headerofplaylistduration);
	}
	public static void audionamesinshodetailpagem(String audioname)
	{
		int size=driver.findElements(audionamesinshodetailpage).size();
		for(int i=0;i<size;i++)
		{
			String str=driver.findElements(audionamesinshodetailpage).get(i).getText();
			if(str.equalsIgnoreCase(audioname))
			{
				driver.findElements(audionamesinshodetailpage).get(i).click();
		
			}
		}
	}
	public static List<WebElement> audionamesinshodetailpagem()
	{
		return driver.findElements(audionamesinshodetailpage);
		
	}
	public static WebElement audioname()
	{
		return driver.findElement(audionamesinshodetailpage);
	}
	
	public static String audioduration;
	public static void audiodurationsm(String audioname)
	{
		int size=driver.findElements(audionamesinshodetailpage).size();
		for(int i=0;i<size;i++)
		{
			String str=driver.findElements(audionamesinshodetailpage).get(i).getText();
			if(str.equalsIgnoreCase(audioname))
			{
				audioduration=driver.findElements(audiodurations).get(i).getText();
		
			}
		}	
	}
	public static WebElement episodespagelinkm()
	{
		return driver.findElement(episodespagelink);
	}
	public static WebElement seasondropdownboxm()
	{
		return driver.findElement(seasondropdownbox);
	}
	public static List<WebElement> seasonsindropdownm()
	{
		return driver.findElements(seasonsindropdown);
	}
	
	public static List<WebElement> episodedscriptionsm()
	{
		return driver.findElements(episodedscriptions);
	}
	public static WebElement dropdownboxinsideepisodespagem()
	{
		return driver.findElement(dropdownboxinsideepisodespage);
	}
	public static List<WebElement> episodesnamesinepisodespagem()
	{
		return driver.findElements(episodesnamesinepisodespage);
	}
	public static List<WebElement> episodedurationm()
	{
		return driver.findElements(episodeduration);
	}
	public static List<WebElement> maturityratinginepisodepagem()
	{
		return driver.findElements(maturityratinginepisodepage);
	}
	public static List<WebElement> episodedescriptioninepisodepagem()
	{
		return driver.findElements(episodedescriptioninepisodepage);
	}
	public static WebElement backiconfromepisodepagem()
	{
		return driver.findElement(backiconfromepisodepage);
	}
	
	public static WebElement shoorseriesdescinsynposism()
	{
		return driver.findElement(shoorseriesdescinsynposis);
	}
	public static List<WebElement> Specificsm()
	{
		return driver.findElements(Specifics);
	}
	public static List<WebElement> synopsisheadingcontentm()
	{
		return driver.findElements(synopsisheadingcontent);
	}
	public static List<WebElement> castdetailsheadingsm()
	{
		return driver.findElements(castdetailsheadings);
	}
	public static List<WebElement> castdetailsheadcontentm()
	{
		return driver.findElements(castdetailsheadcontent);
	}
	public static WebElement crewdetailstitlem()
	{
		return driver.findElement(crewdetailstitle);
	}
	public static List<WebElement> crewdetailsm()
	{
		return driver.findElements(crewdetails);
	}
	public static List<WebElement> episodescardsm()
	{
		return driver.findElements(eoisodescards);
	}
	public static WebElement episodecountm()
	{
		return driver.findElement(episodecount);
	}
	public static WebElement seasondropdowninepisodeagem()
	{
		return driver.findElement(seasondropdowninepisodeage);
	}
	public static List<WebElement> episodenameinshodetailpagem()
	{
		return driver.findElements(episodenameinshodetailpage);
	}
	public static WebElement nextarrowm()
	{
		return driver.findElement(nextarrow);
	}
	public static List<WebElement> episodecardsinepisodepagem()
	{
		return driver.findElements(episodecardsinepisodepage);
	}
	public static WebElement seriesnameinepisodepagem()
	{
		return driver.findElement(seriesnameinepisodepage);
	}
	public static List<WebElement> mousehoveronepisodecardsm()
	{
		return driver.findElements(mousehoveronepisodecards);
	}
	public static List<WebElement> promoviewcountm()
	{
	     return driver.findElements(promoviewsinshodetailpage);
	}
	public static WebElement promogudcount()
	{
		return driver.findElement(gudcountonshodetailpage);
	}
	public static WebElement headerwatchlistbuttonm()
	{
		return driver.findElement(headerwatchlistbutton);
	}
	public static WebElement aboutshoorseriesheadingm()
	{
		return driver.findElement(aboutshoorseriesheading);
	}
	public static WebElement headersharem()
	{
		return driver.findElement(headershare);
	}
	public static List<WebElement> linedtitlesm()
	{
		return driver.findElements(linedtitles);
	}
	public static WebElement playorbuybuttonsmallm()
	{
		return driver.findElement(playorbuybuttonsmall);
	}
	public static WebElement defaultgenerforsho()
	{
		return driver.findElement(defaultgenerforsho);
	}
	public static WebElement maturitytagforsho()
	{
		return driver.findElement(maturitytagforsho);
	}
	public static WebElement languagetagforsho()
	{
		return driver.findElement(languagetagforsho);
	}
	public static WebElement shoorseriesnameonheader()
	{
		return driver.findElement(shoorseriesnameonheader);
	}
    public static WebElement screeneddate()
    {
    	return driver.findElement(screeneddate);
    }
    public static WebElement screeneddateforseries()
    {
    	return driver.findElement(screeneddateforseries);
    }
	
	
	
}
