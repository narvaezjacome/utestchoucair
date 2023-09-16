package co.com.choucair.certification.utest.interactions.waits;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Visible implements Interaction {

    Target element;

    public Visible(Target element) {
        this.element = element;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(element, isVisible()).forNoMoreThan(20).seconds());
    }
}
