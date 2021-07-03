package scenarios;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FormularioPage;

public class TestesFormularioSelenium {
	static ChromeDriver driver = new ChromeDriver(); // Criando um chrome driver
	FormularioPage formularioPage = new FormularioPage(driver);

	@BeforeClass
	public static void beforeClass() {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");// Abrindo uma pagina

	}

	@Test
	public void exercicio01Selenium() throws InterruptedException {

		formularioPage.escreverNome();
		formularioPage.escreverSobreNome();
		formularioPage.preencheEndereco();
		formularioPage.preencheEmail();
		formularioPage.preencheTelefone();
		formularioPage.clicaGenero();

		formularioPage.selecionaLanguages();
		formularioPage.selecionaSkills();
		formularioPage.selecionaCountries();
		formularioPage.preenchePaisLI();
		formularioPage.preencheDataAniversario();
		formularioPage.preencheSenha();
		formularioPage.clicaEmSubmeter();

	}
	
	@AfterClass
	public static void AfterClass() {
		
		driver.quit();
	}
}
