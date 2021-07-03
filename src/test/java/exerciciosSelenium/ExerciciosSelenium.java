package exerciciosSelenium;

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

}
