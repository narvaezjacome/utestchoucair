package co.com.choucair.certification.utest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarRegistro implements Question<String> {

    Target element;

    public ValidarRegistro(Target element) {
        this.element = element;
    }

    public static ValidarRegistro validarRegistro(Target element) {
        return new ValidarRegistro(element);
    }

    @Override
    public String answeredBy(Actor actor) {
        String labelField = Text.of(element).viewedBy(actor).asString();
        return labelField;
    }
}