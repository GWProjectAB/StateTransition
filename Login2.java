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


public class Login2 {
	public static void main(String... args){
		
		/**
         * <p>最初に必要な情報を入力してください</p>
         */
		
		String loginId;// 管理画面ユーザーID
    	loginId = "online02";

    	String loginPassward;// 管理画面パスワード
    	loginPassward="online03";

    	String eMail;// 自分のメールアドレス
    	eMail="Mikai-K@mail.dnp.co.jp";

    	String dId;// 所属ID
    	dId="sk080802";

    	String sId=null;// 店舗ID
    	sId="store0810";
    	
    	String tId=null;// 端末ID。対面の場合は13桁
    	tId="tanmatu080809";
    	
    	String IP=null;// 自席のIP
    	IP="10.210.93.104";
    	
    	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\d766551\\Documents\\selenium\\chromedriver.exe");// Chromeドライバーのパス
		
		
		/**
         * <p>以下から登録をスタート</p>
         */
		
		
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://st-mng-gw.dmps.jp/pssgw-admin6/sys/login/Login.action");
	
//	管理画面にログインする
	
	WebElement userId = driver.findElement(By.name("userId"));
	userId.sendKeys(loginId);
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys(loginPassward);

	Actions builder =new Actions(driver);
	WebElement Button = driver.findElement(By.className("btnBig"));
	builder.click(Button);
	builder.build().perform();
	
	
//	契約企業の切替
	
	Select selector = new Select(driver.findElement(By.name("clientCompanyUid")));
	selector.selectByVisibleText("NES00001：日信電子サービス株式会社");
	WebElement Submit = driver.findElement(By.tagName("input"));
	Submit.click();

////////	所属一覧⇒登録にアクセス
//	Actions builder2 =new Actions(driver);
//	WebElement mouseTarget2 = driver.findElement(By.name("top"));
//	builder2.moveToElement(mouseTarget2).moveByOffset(0,50).click();
//	builder2.build().perform();
//	
//	Actions builder3 =new Actions(driver);
//	WebElement mouseTarget3 = driver.findElement(By.linkText("所属一覧"));
//	builder3.moveToElement(mouseTarget3).click();
//	builder3.build().perform();
//	
//	Actions builder4 =new Actions(driver);
//	WebElement mouseTarget4 = driver.findElement(By.linkText("登録"));
//	builder4.moveToElement(mouseTarget4).click();
//	builder4.build().perform();
//	
//////	所属を新規登録
//	
//	WebElement departmentId = driver.findElement(By.name("departmentId"));
//	departmentId.sendKeys(dId);
//	
//	WebElement departmentName = driver.findElement(By.name("departmentName"));
//	departmentName.sendKeys("所属名");
//	
//	WebElement departmentNameKana = driver.findElement(By.name("departmentNameKana"));
//	departmentNameKana.sendKeys("ショゾクメイカナ");
//	
//	WebElement postalCd = driver.findElement(By.name("postalCd"));
//	postalCd.sendKeys("1234567");
//	
//	Select formSelectMiddle = new Select(driver.findElement(By.className("formSelectMiddle")));
//	formSelectMiddle.selectByVisibleText("北海道");
//	
//	WebElement addressMunicipality = driver.findElement(By.name("addressMunicipality"));
//	addressMunicipality.sendKeys("市区町村");
//	
//	WebElement addressHouseNo = driver.findElement(By.name("addressHouseNo"));
//	addressHouseNo.sendKeys("番地");
//	
//	WebElement addressBuilding = driver.findElement(By.name("addressBuilding"));
//	addressBuilding.sendKeys("建物");
//	
//	WebElement phoneNo = driver.findElement(By.name("phoneNo"));
//	phoneNo.sendKeys("0312345678");
//	
//	WebElement faxNo = driver.findElement(By.name("faxNo"));
//	faxNo.sendKeys("0312345678");
//	
//	WebElement Confirm = driver.findElement(By.className("btnBig"));
//	Confirm.click();
//	
//
//	WebElement Complete = driver.findElement(By.className("btnBig"));
//	Complete.click();
//	
//////	店舗⇒登録にアクセス
//	
//	Actions builder5 =new Actions(driver);
//	WebElement mouseTarget5 = driver.findElement(By.name("top"));
//	builder5.moveToElement(mouseTarget5).moveByOffset(0,50).moveByOffset(200,0);
//	builder5.build().perform();
//
//	Actions builder6 =new Actions(driver);
//	WebElement mouseTarget6 = driver.findElement(By.linkText("店舗一覧"));
//	builder6.moveToElement(mouseTarget6).click();
//	builder6.build().perform();
//	
//	Actions builder7 =new Actions(driver);
//	WebElement mouseTarget7 = driver.findElement(By.linkText("登録"));
//	builder7.moveToElement(mouseTarget7).click();
//	builder7.build().perform();
//	
//	
//////	店舗を新規登録
//	
//	Select department = new Select(driver.findElement(By.name("department")));
//	department.selectByVisibleText(dId+"：所属名");
//
//	WebElement storeId = driver.findElement(By.name("storeId"));
//	storeId.sendKeys(sId);
//	
//	WebElement storeName = driver.findElement(By.name("storeName"));
//	storeName.sendKeys("店舗名");
//	
//	WebElement storeNameKana = driver.findElement(By.name("storeNameKana"));
//	storeNameKana.sendKeys("テンポメイカナ");
//	
//	WebElement storeNameEnglish = driver.findElement(By.name("storeNameEnglish"));
//	storeNameEnglish.sendKeys("storeNameEnglish");
//	
//	WebElement memberStoreName = driver.findElement(By.name("memberStoreName"));
//	memberStoreName.sendKeys("加盟店名");
//	
//	WebElement memberStoreNameKana = driver.findElement(By.name("memberStoreNameKana"));
//	memberStoreNameKana.sendKeys("ｶﾒｲﾃﾝｶﾅ");
//	
//	WebElement memberStoreNameEnglish = driver.findElement(By.name("memberStoreNameEnglish"));
//	memberStoreNameEnglish.sendKeys("memberStoreNameEnglish");
//	
//	WebElement contactMailAddress = driver.findElement(By.name("contactMailAddress"));
//	contactMailAddress.sendKeys(eMail);
//	
//	WebElement postalCd2 = driver.findElement(By.name("postalCd"));
//	postalCd2.sendKeys("1234567");
//	
//	Select formSelectMiddle2 = new Select(driver.findElement(By.name("prefectures")));
//	formSelectMiddle2.selectByVisibleText("北海道");
//	
//	WebElement addressMunicipality2 = driver.findElement(By.name("addressMunicipality"));
//	addressMunicipality2.sendKeys("市区町村");
//	
//	WebElement addressHouseNo2 = driver.findElement(By.name("addressHouseNo"));
//	addressHouseNo2.sendKeys("番地");
//	
//	WebElement addressBuilding2 = driver.findElement(By.name("addressBuilding"));
//	addressBuilding2.sendKeys("建物");
//	
//	WebElement addressEnglish = driver.findElement(By.name("addressEnglish"));
//	addressEnglish.sendKeys("addressEnglish");
//	
//	WebElement phoneNo2 = driver.findElement(By.name("phoneNo"));
//	phoneNo2.sendKeys("0312345678");
//	
//	WebElement faxNo2 = driver.findElement(By.name("faxNo"));
//	faxNo2.sendKeys("0312345678");
//	
//	WebElement memberStoreCategoryCd = driver.findElement(By.name("memberStoreCategoryCd"));
//	memberStoreCategoryCd.sendKeys("1234");
//	
//	WebElement memberStoreCompanyCd = driver.findElement(By.name("memberStoreCompanyCd"));
//	memberStoreCompanyCd.sendKeys("12345678901");
//	
//	WebElement CREDIT = driver.findElement(By.className("CREDIT")) ;
//	CREDIT.click();
//	
//	WebElement Confirm2 = driver.findElement(By.className("btnBig"));
//	Confirm2.click();
//	
//	WebElement Complete2 = driver.findElement(By.className("btnBig"));
//	Complete2.click();
	
//	端末の新規登録
	
	Actions builder8 =new Actions(driver);
	WebElement mouseTarget8 = driver.findElement(By.name("top"));
	builder8.moveToElement(mouseTarget8).moveByOffset(0,50).moveByOffset(300,0);
	builder8.build().perform();
	
	Actions builder9 =new Actions(driver);
	WebElement mouseTarget9 = driver.findElement(By.linkText("端末登録"));
	builder9.moveToElement(mouseTarget9).click();
	builder9.build().perform();
	
	
	Select departmentUid = new Select(driver.findElement(By.name("departmentUid")));
	departmentUid.selectByVisibleText(dId+":所属名");
	
	Select storeUid = new Select(driver.findElement(By.name("storeUid")));
	storeUid.selectByVisibleText(sId+":店舗名");
	
	WebElement terminalId = driver.findElement(By.name("terminalId"));
	terminalId.sendKeys(tId);
	
	Select terminalCategoryUid = new Select(driver.findElement(By.name("terminalCategoryUid")));
	terminalCategoryUid.selectByVisibleText("DLL(POS)端末");
	
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
	maintenanceCoInfo.sendKeys("保守管理会社情報");
	
	WebElement settingStatus = driver.findElement(By.name("settingStatus"));
	settingStatus.sendKeys("設置状態（メモ）");
	
	WebElement CREDIT2 = driver.findElement(By.className("CREDIT")) ;
	CREDIT2.click();
	
	WebElement creditCompanyTerminalId = driver.findElement(By.name("creditCompanyTerminalId"));
	creditCompanyTerminalId.sendKeys("1001111");
	
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
	
////	ログアウト
//	Actions builderend =new Actions(driver);
//	WebElement Logout = driver.findElement(By.className("headerBtnLogout"));
//	builderend.click(Logout);
//	builderend.build().perform();
		
	}
}

	
	

