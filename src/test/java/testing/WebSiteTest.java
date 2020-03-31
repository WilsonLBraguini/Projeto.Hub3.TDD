package testing;

import org.junit.Test;

import pageObject.CadastroTest;
import pageObject.ConsultaPorFiltroTest;
import pageObject.ConsultaTelaPrincipalTest;
import pageObject.LoginTest;

public class WebSiteTest {
	
	
//	@Test
//	public void cadastroPositivo() {
//		CadastroTest registroPositivo = new CadastroTest();
//		registroPositivo.cadastroPositivo();
//	}
//	
//	@Test 
//	public void cadastroNegativo() {
//		CadastroTest registroNegativo = new CadastroTest();
//		registroNegativo.cadastroNegativo();
//	}
	
//	@Test
//	public void loginPositivo() {
//		LoginTest conectPositivo = new LoginTest();
//		conectPositivo.loginPositivo();
//	}
//	
//	@Test
//	public void loginNegativo() {
//		LoginTest conectNegativo = new LoginTest();
//		conectNegativo.loginNegativo();
//	}
	
	@Test 
	public void consultaPorFiltroPositivo() {
		ConsultaPorFiltroTest filtroPositivo = new ConsultaPorFiltroTest();
		filtroPositivo.consultaPorFiltroPositivo();
	}
	
	@Test 
	public void consultaPorFiltroNegativo() {
		ConsultaPorFiltroTest filtroNegativo = new ConsultaPorFiltroTest();
		filtroNegativo.consultaPorFiltroNegativo();
	}
//	
//	@Test
//	public void consultaTelaPrincipalPositivo() {
//		ConsultaTelaPrincipalTest telaPositivo = new ConsultaTelaPrincipalTest();
//		telaPositivo.consultaTelaPrincipalPositivo();
//	}
//	
//	@Test
//	public void consultaTelaPrincipalNegativo() {
//		ConsultaTelaPrincipalTest telaNegativo = new ConsultaTelaPrincipalTest();
//		telaNegativo.consultaTelaPrincipalNegativo();
//	}
	
}
