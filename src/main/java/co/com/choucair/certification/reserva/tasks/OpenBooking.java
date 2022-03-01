package co.com.choucair.certification.reserva.tasks;

import co.com.choucair.certification.reserva.userinterface.BookingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBooking implements Task {
    private BookingPage bookingPage;
    public static OpenBooking Page() {
        return Tasks.instrumented(OpenBooking.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(bookingPage));
    }
}
