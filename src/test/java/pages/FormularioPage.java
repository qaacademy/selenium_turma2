package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormularioPage {

	public final String PRIMEIRO_NOME = "//*[@ng-model='FirstName']";
	public final String SOBRE_NOME = "//*[@ng-model='LastName']";
	public final String ENDERECO = "//*[@ng-model='Adress']";
	public final String GENERO = "//*[@value='Male']";
	public final String HOBBIE = "//input[@id='checkbox2']";
	public final String EMAIL = "//*[@ng-model='EmailAdress']";
	public final String TELEFONE = "//*[@ng-model='Phone']";

	public final String CAMPO_LANGUAGES = "//div[@id='msdd']";
	public final String LIST_LANGUAGES = "//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul";
	public final String ENGLISH = "//a[contains(text(),'English')]";
	public final String LIST_SKILLS = "//select[@id='Skills']";
	public final String LIST_COUNTRIES = "//select[@id='countries']";

	public final String LIST_COUNTRIES_LI = "//span[@role='combobox']";

	public final String LIST_COUNTRIES_USA = "//li[contains(text(),'United States of America')]";

	public final String LIST_YEAR = "//select[@id='yearbox']";

	public final String LIST_MONTH = "//select[@ng-model='monthbox']";

	public final String LIST_DAY = "//select[@id='daybox']";

	public final String PASSWORD = "//input[@id='firstpassword']";
	public final String CONFIRM_PASSWORD = "//input[@id='secondpassword']";

	public final String SUBMIT = "//button[@id='submitbtn']";
	

	public void escreverNome(ChromeDriver driver) {
		driver.findElement(By.xpath(PRIMEIRO_NOME)).sendKeys("Flavio"); // Localizando
	}

	public void escreverSobreNome(ChromeDriver driver) {

		driver.findElement(By.xpath(SOBRE_NOME)).sendKeys("Lelis Dias");
	}

	public void preencheEndereco(ChromeDriver driver) {
		driver.findElement(By.xpath(ENDERECO)).sendKeys("Av Paulista, 509 - 18º andar SL 1"); // Localizando

	}

	public void preencheEmail(ChromeDriver driver) {
		driver.findElement(By.xpath(EMAIL)).sendKeys("contato@qaacademy.com.br");
	}

	public void preencheTelefone(ChromeDriver driver) {
		driver.findElement(By.xpath(TELEFONE)).sendKeys("+5511977413512");

	}

	public void clicaGenero(ChromeDriver driver) {
		driver.findElement(By.xpath(GENERO)).click();
	}

	public void selecionaHobbie(ChromeDriver driver) {
		driver.findElement(By.xpath(HOBBIE)).click();

	}

	public void selecionaLanguages(ChromeDriver driver) throws InterruptedException {
		driver.findElement(By.xpath(CAMPO_LANGUAGES)).click(); // Clique para expandir a caixa de seleção

		Thread.sleep(1000); // Espera Explicita de 1 segundo

		List<WebElement> elementsLanguages = driver.findElements(By.xpath(LIST_LANGUAGES));

		elementsLanguages.get(0).findElement(By.xpath(ENGLISH)).click();

		driver.findElement(By.xpath(CAMPO_LANGUAGES)).click();

	}

	public void selecionaSkills(ChromeDriver driver) throws InterruptedException {

		driver.findElement(By.xpath(LIST_SKILLS)).click();

		Select optionSkills = new Select(driver.findElement(By.xpath(LIST_SKILLS)));

		Thread.sleep(1000);

		optionSkills.selectByVisibleText("XHTML");
	}

	public void selecionaCountries(ChromeDriver driver) throws InterruptedException {

		driver.findElement(By.xpath(LIST_COUNTRIES)).click();
		Select optionCountry = new Select(driver.findElement(By.xpath(LIST_COUNTRIES)));
		Thread.sleep(1000);
		optionCountry.selectByVisibleText("Brazil");

	}

	public void preenchePaisLI(ChromeDriver driver) throws InterruptedException {

		Thread.sleep(1000); // Espera Explicita de 1 segundo
		driver.findElement(By.xpath(LIST_COUNTRIES_LI)).click(); // Clique para expandir a caixa de seleção
		Thread.sleep(1000); // Espera Explicita de 1 segundo
		driver.findElement(By.xpath(LIST_COUNTRIES_USA)).click();

	}

	public void preencheDataAniversario(ChromeDriver driver) throws InterruptedException {
		Thread.sleep(1000); // Espera Explicita de 1 segundo

		driver.findElement(By.xpath(LIST_YEAR)).click(); // Clique para expandir a caixa de seleção

		Select optionYear = new Select(driver.findElement(By.xpath(LIST_YEAR))); // Carrega a lista de opções para um
																					// objeto do tipo Select
		Thread.sleep(1000); // Espera Explicita de 1 segundo
		optionYear.selectByVisibleText("1988"); // Seleciona a opção Ano

		Thread.sleep(1000); // Espera Explicita de 1 segundo
		driver.findElement(By.xpath(LIST_MONTH)).click(); // Clique para expandir a caixa de seleção
		Select optionMonth = new Select(driver.findElement(By.xpath(LIST_MONTH))); // Carrega a lista de opções para um
																					// objeto do tipo Select
		Thread.sleep(1000); // Espera Explicita de 1 segundo
		optionMonth.selectByVisibleText("April"); // Seleciona a opção Ano

		Thread.sleep(1000); // Espera Explicita de 1 segundo
		driver.findElement(By.xpath(LIST_DAY)).click(); // Clique para expandir a caixa de seleção
		Select optionDay = new Select(driver.findElement(By.xpath(LIST_DAY))); // Carrega a lista de opções para um
																				// objeto do tipo Select
		Thread.sleep(1000); // Espera Explicita de 1 segundo
		optionDay.selectByVisibleText("15"); // Seleciona a opção Ano

	}

	public void preencheSenha(ChromeDriver driver) {

		driver.findElement(By.xpath(PASSWORD)).sendKeys("123456789");

		driver.findElement(By.xpath(CONFIRM_PASSWORD)).sendKeys("123456789");
	}

	public void clicaEmSubmeter(ChromeDriver driver) {
		driver.findElement(By.xpath(SUBMIT)).click();

	}

	public void languageLI(ChromeDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='msdd']")).click(); // Clique para expandir a caixa de seleção
		Thread.sleep(1000); // Espera Explicita de 1 segundo
		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();// clicar em cima do texto English

	}
}
