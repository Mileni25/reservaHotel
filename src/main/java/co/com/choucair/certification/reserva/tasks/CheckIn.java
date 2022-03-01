package co.com.choucair.certification.reserva.tasks;

import co.com.choucair.certification.reserva.model.pruebaTecnicaData;
import static co.com.choucair.certification.reserva.userinterface.Planning.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import co.com.choucair.certification.reserva.userinterface.Planning;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WithTimeout;
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckIn implements Task {

    private List<pruebaTecnicaData> data;

    public CheckIn(List<pruebaTecnicaData> data) {
        this.data = data;
    }

    public static CheckIn toDestination(List<pruebaTecnicaData> data) {
        return Tasks.instrumented(CheckIn.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(SUBMIT_BUTTONN),
                Click.on(BUTTON_COOKIES),
                Enter.theValue(data.get(0).getStrDestinationCity()).into(INPUT_CITY),
                //WaitUntil.the(found_CITY,hasValue("Bogota")).forNoMoreThan(120).seconds(),
                //WaitUntil.the(found_CITY, isVisible()).forNoMoreThan(120).seconds(),
                Hit.the(Keys.ARROW_DOWN).into(INPUT_CITY),
                Hit.the(Keys.ENTER).into(INPUT_CITY),
                Click.on(INPUT_CHECKIN),
                Click.on(INPUT_DATE),
                Click.on(INPUT_CHECKOUT),Click.on(PUSH_CONTINUE)
        );
    }
}
