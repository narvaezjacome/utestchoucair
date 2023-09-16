package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.interactions.waits.WaitElement;
import co.com.choucair.certification.utest.interactions.waits.WaitFor;
import co.com.choucair.certification.utest.model.registro.RegistroUser;
import com.github.javafaker.Faker;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.utest.userinterface.register.DiligenciamientoRegistro.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DiligenciamientoRegistro implements Task {
    RegistroUser registroUser;

    public DiligenciamientoRegistro(RegistroUser registroUser) {
        this.registroUser = registroUser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CLICK_NAME));
        WaitElement.isVisible(CLICK_NAME);
        actor.attemptsTo(Click.on(TXT_NAME));
        actor.attemptsTo(Enter.theValue(registroUser.getFirstname()).into(TXT_NAME));


        actor.attemptsTo(Click.on(CLICK_LASTNAME));
        WaitElement.isVisible(CLICK_LASTNAME);
        actor.attemptsTo(Click.on(TXT_LASTNAME));
        actor.attemptsTo(Enter.theValue(registroUser.getLastname()).into(TXT_LASTNAME));

        actor.attemptsTo(Click.on(CLICK_EMAIL));
        WaitElement.isVisible(CLICK_EMAIL);
        actor.attemptsTo(Click.on(TXT_EMAIL));
        actor.attemptsTo(Enter.theValue(Faker.instance().internet().emailAddress()).into(TXT_EMAIL));

        actor.attemptsTo(Click.on(TXT_MONTH));
        WaitElement.isVisible(TXT_MONTH);


        actor.attemptsTo(Click.on(CLICK_DAY));
        WaitElement.isVisible(CLICK_DAY);


        actor.attemptsTo(Click.on(CLICK_YEAR));
        WaitElement.isVisible(CLICK_YEAR);


        actor.attemptsTo(Click.on(CLICK_LANGUAGES));
        WaitElement.isVisible(CLICK_LANGUAGES);
        actor.attemptsTo(Click.on(TXT_LANGUAGES));
        actor.attemptsTo(Enter.theValue(registroUser.getLanguages()).into(TXT_LANGUAGES));

        actor.attemptsTo(Click.on(CLICK_BUTTON_NEXTLOCATION));
        WaitElement.isVisible(CLICK_BUTTON_NEXTLOCATION);



        actor.attemptsTo(Click.on(CLICK_MAP));
        actor.attemptsTo(Click.on(CLICK_MAP));

        WaitFor.aTime(800000000);
        WaitElement.isVisible(CLICK_BUTTON_NEXTDEVICES);
        actor.attemptsTo(Click.on(CLICK_BUTTON_NEXTDEVICES));



        actor.attemptsTo(Click.on(CLICK_BUTTON_NEXTLASTSTEP));
        WaitElement.isVisible(CLICK_BUTTON_NEXTLASTSTEP);


        actor.attemptsTo(Click.on(CLICK_NEWPASSWORD));
        WaitElement.isVisible(CLICK_NEWPASSWORD);
        actor.attemptsTo(Enter.theValue(registroUser.getCreateyourutestpassword()).into(CLICK_NEWPASSWORD));


        actor.attemptsTo(Click.on(CLICK_CONFIRMPASSWORD));
        WaitElement.isVisible(CLICK_CONFIRMPASSWORD);
        actor.attemptsTo(Enter.theValue(registroUser.getConfirmpassword()).into(CLICK_CONFIRMPASSWORD));


        actor.attemptsTo(Click.on(CLICK_CHECK_OPTIONAL));
        WaitElement.isVisible(CLICK_CHECK_OPTIONAL);
        actor.attemptsTo(Click.on(CLICK_CHECK_TERMS));
        WaitElement.isVisible(CLICK_CHECK_TERMS);
        actor.attemptsTo(Click.on(CLICK_CHECK_PRIVACY));
        WaitElement.isVisible(CLICK_CHECK_PRIVACY);


        actor.attemptsTo(Click.on(CLICK_BUTTON_COMPLETESETUP));
        WaitElement.isVisible(CLICK_BUTTON_COMPLETESETUP);
    }

    public static DiligenciamientoRegistro diligenciamientoRegistro(RegistroUser registroUser) {
        return instrumented(DiligenciamientoRegistro.class, registroUser);
    }
}