package Suites;

import Core.Driverfactory;
import Pages.InicialPage;
import Tests.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ContaTest.class,
        MovimentacaoTest.class,
        RemoverMovimentacaoContaTest.class,
        SaldoTest.class,
        ResumoTest.class
})

public class SuiteGeral {

    private static InicialPage page = new InicialPage();

    @BeforeClass

    public static void inicializa(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lcamargo\\drivers\\chromedriver.exe");
        Driverfactory.getDriver().get("https://srbarriga.herokuapp.com/login");
        page = new InicialPage();

        page.acessarTelaInicial();
        page.setEmail("leo@teste.com.br");
        page.setSenha("1234567");
        page.entrar();

    }

    @AfterClass
    public static void finaliza(){
        Driverfactory.killDriver();
    }



}

