package test.Test1;

import static org.junit.Assert.assertTrue;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest extends Base {



	@Test(priority=1)
	public void SelectDropDown() throws InterruptedException{

System.out.println("------Select DropDown-----");
        driver.findElement(By.xpath("(//div[@class='row'])[2]")).click();
        Thread.sleep(500);
		driver.findElement(By.xpath("(//a[@class='dropdown-item'])[2]")).click();
		Thread.sleep(500);
	}
		@Test(priority=2)
	public void NameWithBlues() throws InterruptedException {

		System.out.println("------Case2 All Name with Blue Text-----");
		for(int i=1; i<=9;i++) {

			
			WebElement L= driver.findElement(By.xpath("(//div[@class='row'])[3]/div/div/table/tbody/tr["+i+"]/td[3]"));


			if(L.getText().contentEquals("Blue")) {
				String P = driver.findElement(By.xpath("(//div[@class='row'])[3]/div/div/table/tbody/tr["+i+"]/td[1]")).getText();
				System.out.println(P);
			}

			else {
				continue;
			}}}

	@Test(priority=3)
	public void NameWithBlueColor() throws InterruptedException {

		System.out.println("------Case3 All name inside Blue color -----");

		for(int i=1; i<=9;i++) {

			
			WebElement L= driver.findElement(By.xpath("(//div[@class='row'])[3]/div/div/table/tbody/tr["+i+"]/td[3]"));


			if(L.getAttribute("bgcolor").contentEquals("Blue")) {
				String P = driver.findElement(By.xpath("(//div[@class='row'])[3]/div/div/table/tbody/tr["+i+"]/td[1]")).getText();
				System.out.println(P);
			}

			else {
				continue;
			}}}


	 @Test(priority=4)
	public void NamesForIdEqualsIntegerAfterDevidedBy2() throws InterruptedException {

		System.out.println("------Case4 All name where Id is dvisible by 2 and leaves Integer -----");

		for(int i=1; i<=9;i++) {

		
			WebElement L= driver.findElement(By.xpath("(//div[@class='row'])[3]/div/div/table/tbody/tr["+i+"]/td[2]"));

			String K= L.getText();
			double I = Double.parseDouble(K);

			if((I/2)%1==0) {
				String P = driver.findElement(By.xpath("(//div[@class='row'])[3]/div/div/table/tbody/tr["+i+"]/td[1]")).getText();
				System.out.println(P);
			}

			else {
				continue;
			}}}	
	@Test(priority=5)
	public void NameWithCondition2And4() throws InterruptedException {
		System.out.println("------Combinationtion of Case 2 and 4 -----");
		for(int i=1; i<=9;i++) {

			WebElement L= driver.findElement(By.xpath("(//div[@class='row'])[3]/div/div/table/tbody/tr["+i+"]/td[3]"));
			WebElement Y= driver.findElement(By.xpath("(//div[@class='row'])[3]/div/div/table/tbody/tr["+i+"]/td[2]"));
			String K= Y.getText();
			double I = Double.parseDouble(K);	

			if((L.getText().contentEquals("Blue")) && ((I/2)%1==0)) {

				String P = driver.findElement(By.xpath("(//div[@class='row'])[3]/div/div/table/tbody/tr["+i+"]/td[1]")).getText();
				System.out.println(P);
			}


			else {
				continue;
			}}}
}

