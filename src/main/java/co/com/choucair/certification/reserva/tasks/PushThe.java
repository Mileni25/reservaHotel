package co.com.choucair.certification.reserva.tasks;

import co.com.choucair.certification.reserva.userinterface.SelectHotel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.choucair.certification.reserva.userinterface.SelectHotel.*;

public class PushThe implements Task {
    private SelectHotel selectHotel;
    public static PushThe button() {
        return Tasks.instrumented(PushThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SelectHotel.BUTTON_ACEPTAR),
                Scroll.to(SUBMIT_BUTTON),
                Click.on(SelectHotel.BUTTON_HOTEL));

    }
}
