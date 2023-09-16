package co.com.choucair.certification.utest.userinterface.register;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DiligenciamientoRegistro extends PageObject {

    public static final Target CLICK_NAME = Target.the("CLICK_NAME ").located(By.xpath("//input[@id='firstName']"));
    public static final Target TXT_NAME = Target.the("TXT_NAME ").located(By.xpath("//input[@id='firstName']"));

    public static final Target CLICK_LASTNAME = Target.the("CLICK_LASTNAME ").located(By.xpath("//input[@id='lastName']"));
    public static final Target TXT_LASTNAME = Target.the("TXT_LASTNAME ").located(By.xpath("//input[@id='lastName']"));

    public static final Target CLICK_EMAIL = Target.the("CLICK_EMAIL ").located(By.xpath("//input[@id='email']"));
    public static final Target TXT_EMAIL = Target.the("TXT_EMAIL ").located(By.xpath("//input[@id='email']"));

    public static final Target CLICK_MONTH = Target.the("CLICK_MONTH ").located(By.xpath("//select[@id='birthMonth']"));
    public static final Target TXT_MONTH = Target.the("TXT_MONTH ").located(By.xpath("//*[@label='September']"));

    public static final Target CLICK_DAY = Target.the("CLICK_DAY ").located(By.xpath("//*[@id=\"birthDay\"]/option[2]"));
    public static final Target TXT_DAY = Target.the("TXT_DAY ").located(By.xpath("//select[@id='birthDay']"));

    public static final Target CLICK_YEAR = Target.the("CLICK_YEAR ").located(By.xpath("//*[@id=\"birthYear\"]/option[2]"));
    public static final Target TXT_YEAR = Target.the("TXT_YEAR ").located(By.xpath("//select[@id='birthYear']"));

    public static final Target CLICK_LANGUAGES = Target.the("CLICK_LANGUAGES ").located(By.xpath("//div[@id='languages']/div/input"));
    public static final Target TXT_LANGUAGES = Target.the("TXT_LANGUAGES ").located(By.xpath("//div[@id='languages']/div/input"));


    public static final Target CLICK_BUTTON_NEXTLOCATION = Target.the("CLICK_BUTTON_NEXTLOCATION ").located(By.xpath("//span[contains(.,'Next: Location')]"));





    public static final Target CLICK_MAP = Target.the("CLICK_COUNTRY ").located(By.xpath("//div[@id='map']/div/div/div[8]/button"));
    public static final Target CLICK_BUTTON_NEXTDEVICES = Target.the("CLICK_BUTTON_NEXTDEVICES ").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div"));




    public static final Target CLICK_BUTTON_NEXTLASTSTEP = Target.the("CLICK_BUTTON_NEXTLASTSTEP ").located(By.xpath("//span[contains(.,'Next: Last Step')]"));





    public static final Target CLICK_NEWPASSWORD = Target.the("CLICK_NEWPASSWORD ").located(By.xpath("//input[@id='password']"));
    public static final Target TXT_NEWPASSWORD = Target.the("TXT_NEWPASSWORD ").located(By.xpath("//input[@id='password']"));

    public static final Target CLICK_CONFIRMPASSWORD = Target.the("CLICK_CONFIRMPASSWORD ").located(By.xpath("//input[@id='confirmPassword']"));
    public static final Target TXT_CONFIRMPASSWORD = Target.the("TXT_CONFIRMPASSWORD ").located(By.xpath("//input[@id='confirmPassword']"));

    public static final Target CLICK_CHECK_OPTIONAL = Target.the("CLICK_CHECK_OPTIONAL ").located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CLICK_CHECK_TERMS = Target.the("CLICK_CHECK_TERMS ").located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span"));
    public static final Target CLICK_CHECK_PRIVACY = Target.the("CLICK_CHECK_PRIVACY ").located(By.xpath("//section[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span"));

    public static final Target CLICK_BUTTON_COMPLETESETUP = Target.the("CLICK_BUTTON_COMPLETESETUP ").located(By.xpath("//a[@id='laddaBtn']"));


    public static final Target VALIDATE_REGISTER = Target.the("VALIDATE_REGISTER ").located(By.xpath("//div[@id='mainContent']/div/div/div/div/h1"));

}
