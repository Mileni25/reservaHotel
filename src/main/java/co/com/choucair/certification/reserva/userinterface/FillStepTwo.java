package co.com.choucair.certification.reserva.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillStepTwo {

    public static final Target BUTTON_DISPONIBLE = Target.the("Ver disponibilidad").
            located(By.id("search_results_table"));
}
