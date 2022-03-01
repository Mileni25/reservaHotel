package co.com.choucair.certification.reserva.tasks;

import co.com.choucair.certification.reserva.model.bookingData;
import static co.com.choucair.certification.reserva.userinterface.FillStepTwo.*;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import java.util.List;

public class StepTwo implements Task {

    private List<bookingData> datas;

    public StepTwo(List<bookingData> datas) {

        this.datas = datas;
    }

    public static StepTwo fillAvailability(List<bookingData> datas) {

        return Tasks.instrumented(StepTwo.class, datas);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_DISPONIBLE));
        for(String winHandle : Serenity.getWebdriverManager().getWebdriver().getWindowHandles()){
            Serenity.getWebdriverManager().getWebdriver().switchTo().window(winHandle);
        }
    }
}
