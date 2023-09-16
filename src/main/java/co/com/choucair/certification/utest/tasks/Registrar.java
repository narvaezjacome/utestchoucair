package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.interactions.waits.WaitElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.utest.userinterface.register.Registrar.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Registrar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CLICK_BUTTON_JOIN_TODAY));
        WaitElement.isVisible(CLICK_BUTTON_JOIN_TODAY);

    }


    public static Registrar a() {
        return instrumented(Registrar.class);
    }
}