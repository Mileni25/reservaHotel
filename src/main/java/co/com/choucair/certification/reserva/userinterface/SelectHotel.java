package co.com.choucair.certification.reserva.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectHotel {


    public static final Target BUTTON_ACEPTAR = Target.the("Dar click en el boton Aceptar").
            located(By.id("onetrust-accept-btn-handler"));
    public static final Target SUBMIT_BUTTON = Target.the("Desplazarse hacia abajo").
            located(By.xpath("//*[@id=\"panel0\"]/div[2]/div"));
    public static final Target BUTTON_HOTEL = Target.the("Dar click en el boton hoteles").
            located(By.xpath("//*[@id=\"maincontent\"]/div[3]/section/div[1]/ul/li[1]/a/span"));

}
