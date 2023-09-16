package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.url.Url;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navegar implements Task {

    @Step("{0} navega a la url #opcion")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(Url.class));
    }

    public static Navegar a() {
        return instrumented(Navegar.class);
    }
}