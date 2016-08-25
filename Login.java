package com.packt.gw.login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.io.TemporaryFilesystem;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.Platform;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.net.URL;
import java.net.MalformedURLException;


import java.nio.channels.Selector;
import java.awt.List;


public class Login {
	public static void main(String... args){
		
		/**
         * <p>Å‰‚É•K—v‚Èî•ñ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢</p>
         */
		
		String loginId;// ŠÇ—‰æ–Êƒ†[ƒU[ID
    	loginId = "online_admin03";

    	String loginPassward;// ŠÇ—‰æ–ÊƒpƒXƒ[ƒh
    	loginPassward="1234abcd";

    	String companyNM;// Œ_–ñŠé‹ÆNo
    	companyNM="8";

    	String dId;// Š‘®ID
    	dId="sk080401";

    	String sId=null;// “X•ÜID
    	sId="store0804";
    	
    	String tId=null;// ’[––IDB‘Î–Ê‚Ìê‡‚Í13Œ…
    	tId="tanmatu080401";
    	
    	String IP=null;// ©È‚ÌIP
    	IP="10.210.93.35";
    	
    	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\d766551\\Documents\\selenium\\chromedriver.exe");// Chromeƒhƒ‰ƒCƒo[‚ÌƒpƒX
		
		
		/**
         * <p>ˆÈ‰º‚©‚ç“o˜^‚ğƒXƒ^[ƒg</p>
         */
		
		
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://st-mng-gw.dmps.jp/pssgw-admin3/sys/login/Login.action");
	
//	ŠÇ—‰æ–Ê‚ÉƒƒOƒCƒ“‚·‚é
	
	WebElement userId = driver.findElement(By.name("userId"));
	userId.sendKeys(loginId);
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys(loginPassward);

	Actions builder =new Actions(driver);
	WebElement Button = driver.findElement(By.className("btnBig"));
	builder.click(Button);
	builder.build().perform();
	
	
//	Œ_–ñŠé‹Æ‚ÌØ‘Ö
	
	Select selector = new Select(driver.findElement(By.name("clientCompanyUid")));
	selector.selectByVisibleText("DUMMY00"+companyNM+"Fƒ_ƒ~[Œ_–ñŠé‹Æ"+companyNM);
	WebElement Submit = driver.findElement(By.tagName("input"));
	Submit.click();

//	Š‘®ˆê——Ë“o˜^‚ÉƒAƒNƒZƒX
	Actions builder2 =new Actions(driver);
	WebElement mouseTarget2 = driver.findElement(By.name("top"));
	builder2.moveToElement(mouseTarget2).moveByOffset(0,50).click();
	builder2.build().perform();
	
	Actions builder3 =new Actions(driver);
	WebElement mouseTarget3 = driver.findElement(By.linkText("Š‘®ˆê——"));
	builder3.moveToElement(mouseTarget3).click();
	builder3.build().perform();
	
	Actions builder4 =new Actions(driver);
	WebElement mouseTarget4 = driver.findElement(By.linkText("“o˜^"));
	builder4.moveToElement(mouseTarget4).click();
	builder4.build().perform();
	
//	Š‘®‚ğV‹K“o˜^
	
	WebElement departmentId = driver.findElement(By.name("departmentId"));
	departmentId.sendKeys(dId);
	
	WebElement departmentName = driver.findElement(By.name("departmentName"));
	departmentName.sendKeys("Š‘®–¼");
	
	WebElement departmentNameKana = driver.findElement(By.name("departmentNameKana"));
	departmentNameKana.sendKeys("ƒVƒ‡ƒ]ƒNƒƒCƒJƒi");
	
	WebElement postalCd = driver.findElement(By.name("postalCd"));
	postalCd.sendKeys("1234567");
	
	Select formSelectMiddle = new Select(driver.findElement(By.className("formSelectMiddle")));
	formSelectMiddle.selectByVisibleText("–kŠC“¹");
	
	WebElement addressMunicipality = driver.findElement(By.name("addressMunicipality"));
	addressMunicipality.sendKeys("s‹æ’¬‘º");
	
	WebElement addressHouseNo = driver.findElement(By.name("addressHouseNo"));
	addressHouseNo.sendKeys("”Ô’n");
	
	WebElement addressBuilding = driver.findElement(By.name("addressBuilding"));
	addressBuilding.sendKeys("Œš•¨");
	
	WebElement phoneNo = driver.findElement(By.name("phoneNo"));
	phoneNo.sendKeys("0312345678");
	
	WebElement faxNo = driver.findElement(By.name("faxNo"));
	faxNo.sendKeys("0312345678");
	
	WebElement Confirm = driver.findElement(By.className("btnBig"));
	Confirm.click();
	

	WebElement Complete = driver.findElement(By.className("btnBig"));
	Complete.click();
	
//	“X•ÜË“o˜^‚ÉƒAƒNƒZƒX
	
	Actions builder5 =new Actions(driver);
	WebElement mouseTarget5 = driver.findElement(By.name("top"));
	builder5.moveToElement(mouseTarget5).moveByOffset(0,50).moveByOffset(200,0);
	builder5.build().perform();

	Actions builder6 =new Actions(driver);
	WebElement mouseTarget6 = driver.findElement(By.linkText("“X•Üˆê——"));
	builder6.moveToElement(mouseTarget6).click();
	builder6.build().perform();
	
	Actions builder7 =new Actions(driver);
	WebElement mouseTarget7 = driver.findElement(By.linkText("“o˜^"));
	builder7.moveToElement(mouseTarget7).click();
	builder7.build().perform();
	
	
//	“X•Ü‚ğV‹K“o˜^
	
	Select department = new Select(driver.findElement(By.name("department")));
	department.selectByVisibleText(dId+"FŠ‘®–¼");

	WebElement storeId = driver.findElement(By.name("storeId"));
	storeId.sendKeys(sId);
	
	WebElement storeName = driver.findElement(By.name("storeName"));
	storeName.sendKeys("“X•Ü–¼");
	
	WebElement storeNameKana = driver.findElement(By.name("storeNameKana"));
	storeNameKana.sendKeys("ƒeƒ“ƒ|ƒƒCƒJƒi");
	
	WebElement storeNameEnglish = driver.findElement(By.name("storeNameEnglish"));
	storeNameEnglish.sendKeys("storeNameEnglish");
	
	WebElement memberStoreName = driver.findElement(By.name("memberStoreName"));
	memberStoreName.sendKeys("‰Á–¿“X–¼");
	
	WebElement memberStoreNameKana = driver.findElement(By.name("memberStoreNameKana"));
	memberStoreNameKana.sendKeys("¶Ò²Ãİ¶Å");
	
	WebElement memberStoreNameEnglish = driver.findElement(By.name("memberStoreNameEnglish"));
	memberStoreNameEnglish.sendKeys("memberStoreNameEnglish");
	
	WebElement contactMailAddress = driver.findElement(By.name("contactMailAddress"));
	contactMailAddress.sendKeys("test@gmail.com");
	
	WebElement postalCd2 = driver.findElement(By.name("postalCd"));
	postalCd2.sendKeys("1234567");
	
	Select formSelectMiddle2 = new Select(driver.findElement(By.name("prefectures")));
	formSelectMiddle2.selectByVisibleText("–kŠC“¹");
	
	WebElement addressMunicipality2 = driver.findElement(By.name("addressMunicipality"));
	addressMunicipality2.sendKeys("s‹æ’¬‘º");
	
	WebElement addressHouseNo2 = driver.findElement(By.name("addressHouseNo"));
	addressHouseNo2.sendKeys("”Ô’n");
	
	WebElement addressBuilding2 = driver.findElement(By.name("addressBuilding"));
	addressBuilding2.sendKeys("Œš•¨");
	
	WebElement addressEnglish = driver.findElement(By.name("addressEnglish"));
	addressEnglish.sendKeys("addressEnglish");
	
	WebElement phoneNo2 = driver.findElement(By.name("phoneNo"));
	phoneNo2.sendKeys("0312345678");
	
	WebElement faxNo2 = driver.findElement(By.name("faxNo"));
	faxNo2.sendKeys("0312345678");
	
	WebElement memberStoreCategoryCd = driver.findElement(By.name("memberStoreCategoryCd"));
	memberStoreCategoryCd.sendKeys("1234");
	
	WebElement memberStoreCompanyCd = driver.findElement(By.name("memberStoreCompanyCd"));
	memberStoreCompanyCd.sendKeys("12345678901");
	
	WebElement CREDIT = driver.findElement(By.className("CREDIT")) ;
	CREDIT.click();
	
	WebElement Confirm2 = driver.findElement(By.className("btnBig"));
	Confirm2.click();
	
	WebElement Complete2 = driver.findElement(By.className("btnBig"));
	Complete2.click();
	
//	’[––‚ÌV‹K“o˜^
	
	Actions builder8 =new Actions(driver);
	WebElement mouseTarget8 = driver.findElement(By.name("top"));
	builder8.moveToElement(mouseTarget8).moveByOffset(0,50).moveByOffset(300,0);
	builder8.build().perform();
	
	Actions builder9 =new Actions(driver);
	WebElement mouseTarget9 = driver.findElement(By.linkText("’[––“o˜^"));
	builder9.moveToElement(mouseTarget9).click();
	builder9.build().perform();
	
	
	Select departmentUid = new Select(driver.findElement(By.name("departmentUid")));
	departmentUid.selectByVisibleText(dId+":Š‘®–¼");
	
	Select storeUid = new Select(driver.findElement(By.name("storeUid")));
	storeUid.selectByVisibleText(sId+":“X•Ü–¼");
	
	WebElement terminalId = driver.findElement(By.name("terminalId"));
	terminalId.sendKeys(tId);
	
	Select terminalCategoryUid = new Select(driver.findElement(By.name("terminalCategoryUid")));
	terminalCategoryUid.selectByVisibleText("DLL(POS)");
	
	WebElement terminalIpAddress = driver.findElement(By.name("terminalIpAddress"));
	terminalIpAddress.sendKeys(IP);
	
	Actions builder10 =new Actions(driver);
	WebElement mouseTarget10 = driver.findElement(By.name("useStartDay"));
	builder10.moveToElement(mouseTarget10).click();
	builder10.build().perform();
	
	Actions builder11 =new Actions(driver);
	WebElement mouseTarget11 = driver.findElement(By.linkText("1"));
	builder11.moveToElement(mouseTarget11).click();
	builder11.build().perform();
	
	Actions builder12 =new Actions(driver);
	WebElement mouseTarget12 = driver.findElement(By.name("useEndDay"));
	builder12.moveToElement(mouseTarget12).click();
	builder12.build().perform();
	
	Actions builder13 =new Actions(driver);
	WebElement mouseTarget13 = driver.findElement(By.linkText("30"));
	builder13.moveToElement(mouseTarget13).click();
	builder13.build().perform();
	
	WebElement maintenanceCoInfo = driver.findElement(By.name("maintenanceCoInfo"));
	maintenanceCoInfo.sendKeys("•ÛçŠÇ—‰ïĞî•ñ");
	
	WebElement settingStatus = driver.findElement(By.name("settingStatus"));
	settingStatus.sendKeys("İ’uó‘Ôiƒƒ‚j");
	
	WebElement CREDIT2 = driver.findElement(By.className("CREDIT")) ;
	CREDIT2.click();
	
	WebElement creditCompanyTerminalId = driver.findElement(By.name("creditCompanyTerminalId"));
	creditCompanyTerminalId.sendKeys("12345678");
	
	Actions builder14 =new Actions(driver);
	WebElement mouseTarget14 = driver.findElement(By.name("useCreditStartDay"));
	builder14.moveToElement(mouseTarget14).click();
	builder14.build().perform();
	
	Actions builder15 =new Actions(driver);
	WebElement mouseTarget15 = driver.findElement(By.linkText("1"));
	builder15.moveToElement(mouseTarget15).click();
	builder15.build().perform();
	
	Actions builder16 =new Actions(driver);
	WebElement mouseTarget16 = driver.findElement(By.name("useCreditEndDay"));
	builder16.moveToElement(mouseTarget16).click();
	builder16.build().perform();
	
	Actions builder17 =new Actions(driver);
	WebElement mouseTarget17 = driver.findElement(By.linkText("30"));
	builder17.moveToElement(mouseTarget17).click();
	builder17.build().perform();
	
	WebElement businessSubCd = driver.findElement(By.name("businessSubCd"));
	businessSubCd.sendKeys("123");
	
	WebElement creditCardMs = driver.findElement(By.name("creditCardMs"));
	creditCardMs.sendKeys("0");
	
	WebElement defaultItemCd = driver.findElement(By.name("defaultItemCd"));
	defaultItemCd.sendKeys("1234");
	
	WebElement Confirm3 = driver.findElement(By.className("btnBig"));
	Confirm3.click();
	
	WebElement Complete4 = driver.findElement(By.className("btnBig"));
	Complete4.click();
	
////	ƒƒOƒAƒEƒg
//	Actions builderend =new Actions(driver);
//	WebElement Logout = driver.findElement(By.className("headerBtnLogout"));
//	builderend.click(Logout);
//	builderend.build().perform();
		
	}
}

	
	

