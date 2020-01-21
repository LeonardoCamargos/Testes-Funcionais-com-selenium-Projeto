package Core;

import Pages.InicialPage;
import Tests.ContaTest;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static Core.Driverfactory.getDriver;
import static Core.Driverfactory.killDriver;


public class BaseTest {

    private InicialPage page = new InicialPage();


    @Rule
    public TestName testName = new TestName();

    @Before

    public void inicializa(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\lcamargo\\drivers\\chromedriver.exe");
        Driverfactory.getDriver().get("https://srbarriga.herokuapp.com/login");
        page = new InicialPage();

        page.acessarTelaInicial();
        page.setEmail("leo@teste.com.br");
        page.setSenha("1234567");
        page.entrar();

    }


    @After
    public void finaliza() throws IOException {
        TakesScreenshot ss = (TakesScreenshot) getDriver();
        File arquivo = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(arquivo, new File("target"+ File.separator + "ScreenShots" +
                File.separator + testName.getMethodName()+".jpg"));

        if(Propriedades.FECHAR_BROWSER){
            killDriver();
        }
    }

}
