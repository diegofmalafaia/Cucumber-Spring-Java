package stepDefinition;

import br.com.concrete.cielostar.CsbatchApplication;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import config.Config;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import pageObjects.CieloStarPage;
import work.assisjrs.seleniumtestcase.SeleniumTestCase;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

/**
 * Created by Diego Malafaia on 21/03/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = DEFINED_PORT)
@ContextConfiguration(classes = Config.class)
@DatabaseSetup("datasets/CieloStarStep.xml")
@SeleniumTestCase(url = "http://www.google.com",
        pageObject = CieloStarPage.class)
public class CieloStarStep {
    @Autowired
    private CieloStarPage page;

    //@Autowired
    //private WebDriver driver;

    @Dado("^que eu saiba o saldo de um cliente$")
    public void queEuSaibaOSaldoDeUmCliente() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(500);
    }

    @Quando("^eu incluo uma venda para este cliente$")
    public void euIncluoUmaVendaParaEsteCliente() throws Throwable {
            CsbatchApplication.main(null);
            Thread.sleep(10000);

    }

    @Então("^eu verifico que o saldo deste cliente foi acrescido do valor da venda$")
    public void euVerificoQueOSaldoDesteClienteFoiAcrescidoDoValorDaVenda() throws Throwable {
        Thread.sleep(500);
    }

}