package co.com.choucair.certification.reserva.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Planning {

    public static final Target BUTTON_COOKIES = Target.the("Aceptar los cookies").
            located(By.xpath("//*[@id=\"59066\"]/div/div/div/div[2]/div/div/form/div/div[1]/div/div[2]/span"));
    public static final Target SUBMIT_BUTTONN = Target.the("Desplazar hacia abajo").
            located(By.xpath("//*[@id=\"59066\"]/div/div/div/div[1]/div"));
    public static final Target INPUT_CITY = Target.the("Introduccir la ciudad").
            located(By.xpath("//*[@id=\"book-hotel-suggest-field\"]"));
    public static final Target found_CITY = Target.the("Introduccir la ciudad").
            located(By.xpath("//div[@id='book-hotel-suggest-field']/div/button/span/b/span"));
   // public static final Target found_CITY = Target.the("Introduccir la ciudad").
           // located(By.id("modal-root"));
    public static final Target INPUT_CHECKIN = Target.the("seleccionar fecha inicial").
            located(By.id("bookingStartDate"));
    public static final Target INPUT_DATE = Target.the("Fecha de ingreso").
            located(By.xpath("//*[@id=\"59066\"]/div/div/div/div[2]/div/div/form/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[6]/a"));
    public static final Target INPUT_CHECKOUT = Target.the("seleccionar fecha fin").
            located(By.xpath("//*[@id=\"59066\"]/div/div/div/div[2]/div/div/form/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[3]/a"));
    public static final Target PUSH_CONTINUE = Target.the("Presionar el botón de continuar").
            located(By.xpath("//*[@id=\"59066\"]/div/div/div/div[2]/div/div/form/div/button"));
    public static final Target VERIF = Target.the("Verificaion").
            located(By.xpath("//*[@id=\"59066\"]/div/div/div/div[2]/div/div/div[2]/div[1]/h2"));
}
