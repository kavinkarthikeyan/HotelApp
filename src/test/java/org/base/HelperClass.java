package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HelperClass {
	public static WebDriver driver;

	public WebDriver BrowserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kavin\\My Workspace\\AdactinHotel\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		return driver;
	}

	public void Launchurl(String url) {
		driver.get(url);
	}

	public void setText(WebElement e, String value) {

		e.sendKeys(value);

	}

	public void buttonClick(WebElement e) {
		e.click();
	}

	public void time() { // testcase run time
		Date d = new Date();
		System.out.println(d);
	}

	public String excelRead(int rownum, int cellnum) throws IOException {

		String value = null;
		File loc = new File("C:\\Users\\Kavin\\My Workspace\\HotelApp\\Excel\\Registration Details.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rownum);
		Cell c = r.getCell(cellnum);
		int type = c.getCellType();

		if (type == 1) {
			value = c.getStringCellValue();
		} else if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yyy");
				value = sim.format(dateCellValue);
			}

			else {
				double numericCellValue = c.getNumericCellValue();
				long l = (long) numericCellValue;
				value = String.valueOf(l);

			}

		}

		return value;

	}

	public void excelWrite(int rownum, int cellnum, String value) throws IOException {

		File loc = new File("C:\\Users\\Kavin\\My Workspace\\HotelApp\\Excel\\Registration Details.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rownum);
		Cell c = r.createCell(cellnum);
		c.setCellValue(value);
		FileOutputStream o = new FileOutputStream(loc);
		w.write(o);

	}

	public void sbvt(WebElement e, String text) { // selectByVisibleText
		Select s = new Select(e);
		s.selectByVisibleText(text);

	}

	public void printText(String text) {
		System.out.println(text);
	}

	public void sbv(WebElement e, String text) { // selectByValue
		Select s = new Select(e);
		s.selectByValue(text);
	}

	public void sbi(WebElement e, int index) { // selectByIndex
		Select s = new Select(e);
		s.selectByIndex(index);
	}

	public String getTextByAttribute(WebElement e) { // getAttribute
		String text = e.getAttribute("value");
		return text;

	}

	public void robot(String value) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_A);

	}

	public void msc(WebElement e) { // mosueover
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	public void dd(WebElement src, WebElement desc) { // drag and drop
		Actions a = new Actions(driver);
		a.dragAndDrop(src, desc).perform();
	}

	public void rc(WebElement e) { // right click
		Actions a = new Actions(driver);
		a.contextClick(e).perform();
	}

	public void dc(WebElement e) { // doubleclick
		Actions a = new Actions(driver);
		a.doubleClick(e);

	}
}
