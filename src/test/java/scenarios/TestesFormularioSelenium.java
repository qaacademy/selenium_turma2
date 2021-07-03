package scenarios;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.FormularioPage;

public class TestesFormularioSelenium {
	static ChromeDriver driver = new ChromeDriver(); // Criando um chrome driver
	FormularioPage formularioPage = new FormularioPage();

	@BeforeClass
	public static void beforeClass() {
		driver.get("http://demo.automationtesting.in/Register.html");// Abrindo uma pagina

	}

	@Test
	public void exercicio01Selenium() throws InterruptedException {

		formularioPage.escreverNome(driver);
		formularioPage.escreverSobreNome(driver);
		formularioPage.preencheEndereco(driver);
		formularioPage.preencheEmail(driver);
		formularioPage.preencheTelefone(driver);
		formularioPage.clicaGenero(driver);
		formularioPage.clicaGenero(driver);

		formularioPage.selecionaLanguages(driver);
		formularioPage.selecionaSkills(driver);
		formularioPage.selecionaCountries(driver);
		formularioPage.preenchePaisLI(driver);
		formularioPage.preencheDataAniversario(driver);
		formularioPage.preencheSenha(driver);
		formularioPage.clicaEmSubmeter(driver);

	}
	
	@AfterClass
	public static void AfterClass() {
		
		driver.quit();
	}
}
