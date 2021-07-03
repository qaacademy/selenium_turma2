package exerciciosSelenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciciosSelenium {
	
	@Test
	public void exercicio01Selenium() {
		ChromeDriver driver = new ChromeDriver(); //Criando um chrome driver
		driver.get("http://demo.automationtesting.in/Register.html");//Abrindo uma pagina
		driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys("Flávio"); //Localizando elemento e enviando um texto 
		driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys("Lelis Dias"); //Localizando elemento e enviando um texto 
		driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("Av Paulista, 509 - 18º andar SL 1"); //Localizando elemento e enviando um texto 
		driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("contato@qaacademy.com.br"); //Localizando elemento e enviando um texto 
		driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("11977413512"); //Localizando elemento e enviando um texto 

		
	}

}
