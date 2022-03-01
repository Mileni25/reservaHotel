package co.com.choucair.certification.reserva.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillStepThree {

    public static final Target BUTTON_RESERVE = Target.the("Boton reserva ahora").
            located(By.id("hp_book_now_button"));
    public static final Target SELECT = Target.the("Selecionar cantidad de habitaciones").
            located(By.id("hprt_nos_select_41933803_195181777_3_1_0"));
    public static final Target COMPLETAR =Target.the("Completar reserva ").
            located(By.xpath("//*[@id=\"b2hotelPage\"]/header"));
    public static final Target BUTTON_RES = Target.the("Boton de reservare").
            located(By.id("hp_book_now_button"));
    public static final Target VERIF = Target.the("Texto de verificacion").
            located(By.xpath("//*[@id=\"bodyconstraint-inner\"]/div[3]/div[1]/div/div/div/ol/li[5]/strong"));

}
