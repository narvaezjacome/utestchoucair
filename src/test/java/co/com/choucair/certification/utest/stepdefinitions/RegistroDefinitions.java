package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.model.registro.RegistroUser;
import co.com.choucair.certification.utest.questions.ValidarRegistro;
import co.com.choucair.certification.utest.tasks.DiligenciamientoRegistro;
import co.com.choucair.certification.utest.tasks.Navegar;
import co.com.choucair.certification.utest.tasks.Registrar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static co.com.choucair.certification.utest.userinterface.register.DiligenciamientoRegistro.VALIDATE_REGISTER;
import static co.com.choucair.certification.utest.util.Utilities.getRandomDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager;
import static org.hamcrest.core.IsEqual.equalTo;

public class RegistroDefinitions {

    WebDriver driver = getWebdriverManager().getWebdriver(getRandomDriver());

    @Before
    public void setStage() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));

    }

    @Dado("^que (.*) esta en la página de Utest.com")
    public void abrirUrl(String nombreActor) {
        theActorCalled(nombreActor).wasAbleTo(Navegar.a());
    }

    @Cuando("^hago clic en la opción de registro JOIN TODAY")
    public void clickRegistrar() {
        theActorInTheSpotlight().attemptsTo(Registrar.a());
    }

    @Y("^diligencio el formulario para crear un nuevo usuario")
    public void diligencioFormularioRegistro(List<RegistroUser> registroUsers) {
        theActorInTheSpotlight().attemptsTo(DiligenciamientoRegistro.diligenciamientoRegistro(registroUsers.get(0)));
    }

    @Entonces("^valido mi registro con el siguiente mensaje (.*)$")
    public void validarRegistro(String usuario){
        theActorInTheSpotlight().should(seeThat(ValidarRegistro.validarRegistro(VALIDATE_REGISTER),equalTo(usuario)));
    }


}

