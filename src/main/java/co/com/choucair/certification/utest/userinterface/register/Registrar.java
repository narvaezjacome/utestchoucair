package co.com.choucair.certification.utest.userinterface.register;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Registrar extends PageObject {

    public static final Target CLICK_BUTTON_JOIN_TODAY = Target.the("CLICK_BUTTON_JOIN_TODAY ").located(By.xpath("//li/a[contains(@class,'unauthenticated-nav-bar__sign-up')]"));

}