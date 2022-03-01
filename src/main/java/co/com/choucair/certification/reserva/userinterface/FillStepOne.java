package co.com.choucair.certification.reserva.userinterface;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillStepOne {

    public static final Target INPUT_DESTINATION = Target.the("Ingresar destino").
            located(By.id("ss"));
    public static final Target INPUT_IN = Target.the("Elegir el dia de llegada").
            located(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[1]/div[2]/div/div/div/div/span"));
    public static final Target IN = Target.the("Dia 9 de febrero ").
            located(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[2]/td[4]"));
    public static final Target OUT = Target.the("Dia 15 de febrero").
            located(By.xpath("//*[@id=\"frm\"]/div[1]/div[2]/div[2]/div/div/div[3]/div[2]/table/tbody/tr[3]/td[4]"));
    public static final Target INPUT_CHECK = Target.the("Dar click para hacer el checkin").
            located(By.xpath("//*[@id=\"xp__guests__toggle\"]/span[2]"));
    public static final Target INPUT_ADULT = Target.the("Elegir cantidad de adultos").
            located(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[1]/div/div[2]/button[2]"));
    public static final Target INPUT_KIDS = Target.the("Elegir cantidad de niños").
            located(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[2]/div/div[2]/button[2]"));
    public static final Target INPUT_AGE = Target.the("Dar click para seleccionar la edad").
            located(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[3]/select"));
    public static final Target AGE = Target.the("Edad del niño").
            located(By.xpath("//*[@id=\"xp__guests__inputs-container\"]/div/div/div[3]/select/option[9]"));
    public static final Target BUTTON = Target.the("Boton para continuar").
            located(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]"));

}
