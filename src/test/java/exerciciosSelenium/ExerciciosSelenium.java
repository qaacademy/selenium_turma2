package exerciciosSelenium;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciciosSelenium {
	static ChromeDriver driver = new ChromeDriver(); // Criando um chrome driver

	@BeforeClass
	public static void beforeClass() {
		driver.get("http://demo.automationtesting.in/Register.html");// Abrindo uma pagina

	}

	@Test
	public void exercicio01Selenium() {

		driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys("1231231321321321321321"); // Localizando
																										// elemento e
		driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys("Lelis Dias"); // Localizando elemento e
																							// enviando um texto
		driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("Av Paulista, 509 - 18º andar SL 1"); // Localizando
																												// elemento
																												// texto
		driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("contato@qaacademy.com.br"); // Localizando
																											// elemento
																											// um texto
		driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("11977413512"); // Localizando elemento e
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
		
		
	}
	
	@Test
	public void exercicio04_2Selenium() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='msdd']")).click(); //Clique para expandir a caixa de seleção
		Thread.sleep(1000); //Espera Explicita de 1 segundo
		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();// clicar em cima do texto English
		
	}
	
	

}
