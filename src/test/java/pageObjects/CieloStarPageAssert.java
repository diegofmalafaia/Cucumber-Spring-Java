package pageObjects;

import org.assertj.core.api.AbstractAssert;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by assis on 17/03/17.
 */

public class CieloStarPageAssert extends AbstractAssert<CieloStarPageAssert, CieloStarPage> {
    public CieloStarPageAssert(CieloStarPage consumoCsPage) {
        super(consumoCsPage, CieloStarPageAssert.class);
    }

    public void userFound(String nome) throws Exception {
        boolean achou = isAchou(nome);

        assertThat(achou).isTrue();
    }



    public void userNotFound(String nome) throws Exception {
        boolean achou = isAchou(nome);

        assertThat(achou).isFalse();
    }


    public void valueFound(Double valor) {
        boolean achou = false;
        for (WebElement tr: actual.listaDeValores) {
            String text = tr.getText();

            if(Double.parseDouble(text) == valor)
            {
                achou = true;
                break;
            }
        }

        assertThat(achou).isTrue();
    }

    private boolean isAchou(String nome) {
        boolean achou = false;
        for (WebElement tr: actual.listaDeNomes) {
            String text = tr.getText();

            if(text.contains(nome))
            {
                achou = true;
                break;
            }
        }
        return achou;
    }
}
