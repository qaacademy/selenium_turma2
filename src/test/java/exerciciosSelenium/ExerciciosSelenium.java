package exerciciosSelenium;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExerciciosSelenium {
	static ChromeDriver driver = new ChromeDriver(); // Criando um chrome driver

	@BeforeClass
	public static void beforeClass() {
		driver.get("http://demo.automationtesting.in/Register.html");// Abrindo uma pagina

	}

	@Test
	public void exercicio01Selenium() {

		driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys("Flavio"); // Localizando
																										// elemento e
		driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys("Lelis Dias"); // Localizando elemento e
																							// enviando um texto
		driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("Av Paulista, 509 - 18º andar SL 1"); // Localizando
																												// elemento
																												// texto
		driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("contato@qaacademy.com.br"); // Localizando
																											// elemento
																											// um texto
		driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("+5511977413512"); // Localizando elemento e
																						// enviando um texto

	}

	@Test
	public void exercicio02Selenium() {
		driver.findElement(By.xpath("//*[@value='Male']")).click();
	}
	
	@Test
	public void exercicio03Selenium() {
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
	}
	
	
	
	@Test
	public void exercicio04Selenium() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='msdd']")).click(); //Clique para expandir a caixa de seleção
		Thread.sleep(1000); //Espera Explicita de 1 segundo
		List<WebElement> elementsLanguages = driver.findElements(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul"));
		elementsLanguages.get(0).findElement(By.xpath("//a[contains(text(),'English')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Languages')]")).click(); //Recolhe para expandir a caixa de seleção

		
		driver.findElement(By.xpath("//select[@id='Skills']")).click(); //Clique para expandir a caixa de seleção
		
		Select optionSkills = new Select(driver.findElement(By.xpath("//select[@id='Skills']"))); //Carrega a lista de opções para um objeto do tipo Select
		Thread.sleep(1000); //Espera Explicita de 1 segundo
		
		optionSkills.selectByVisibleText("XHTML"); //Seleciona a opção XHTML
		
		
		driver.findElement(By.xpath("//select[@id='countries']")).click(); //Clique para expandir a caixa de seleção
		Select optionCountry = new Select(driver.findElement(By.xpath("//select[@id='countries']"))); //Carrega a lista de opções para um objeto do tipo Select
		Thread.sleep(1000); //Espera Explicita de 1 segundo
		optionCountry.selectByVisibleText("Brazil"); //Seleciona a opção XHTML
		
		Thread.sleep(1000); //Espera Explicita de 1 segundo
		driver.findElement(By.xpath("//span[@role='combobox']")).click(); //Clique para expandir a caixa de seleção
		Thread.sleep(1000); //Espera Explicita de 1 segundo
		driver.findElement(By.xpath("//li[contains(text(),'United States of America')]")).click();
		
		Thread.sleep(1000); //Espera Explicita de 1 segundo
		

		driver.findElement(By.xpath("//select[@id='yearbox']")).click(); //Clique para expandir a caixa de seleção
		
		Select optionYear = new Select(driver.findElement(By.xpath("//select[@id='yearbox']"))); //Carrega a lista de opções para um objeto do tipo Select
		Thread.sleep(1000); //Espera Explicita de 1 segundo
		optionYear.selectByVisibleText("1988"); //Seleciona a opção Ano
		
		Thread.sleep(1000); //Espera Explicita de 1 segundo
		driver.findElement(By.xpath("//select[@ng-model='monthbox']")).click(); //Clique para expandir a caixa de seleção
		Select optionMonth = new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']"))); //Carrega a lista de opções para um objeto do tipo Select
		Thread.sleep(1000); //Espera Explicita de 1 segundo
		optionMonth.selectByVisibleText("April"); //Seleciona a opção Ano
		
		Thread.sleep(1000); //Espera Explicita de 1 segundo
		driver.findElement(By.xpath("//select[@id='daybox']")).click(); //Clique para expandir a caixa de seleção
		Select optionDay = new Select(driver.findElement(By.xpath("//select[@id='daybox']"))); //Carrega a lista de opções para um objeto do tipo Select
		Thread.sleep(1000); //Espera Explicita de 1 segundo
		optionDay.selectByVisibleText("15"); //Seleciona a opção Ano
		
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("123456789");
		
		
		
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("123456789");
		
		
		
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		
		
		
		
	}
	
	@Test
	public void exercicio04_2Selenium() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='msdd']")).click(); //Clique para expandir a caixa de seleção
		Thread.sleep(1000); //Espera Explicita de 1 segundo
		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();// clicar em cima do texto English
		
	}
	
	
	
	

}
