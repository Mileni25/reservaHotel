package co.com.choucair.certification.reserva.tasks;

import co.com.choucair.certification.reserva.model.bookingData;
import static co.com.choucair.certification.reserva.userinterface.FillStepOne.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class StepOne implements Task {
    private List<bookingData> datas;

    public StepOne(List<bookingData> datas) {
        this.datas = datas;}

    public static StepOne fillDestiantion(List<bookingData> datas) {
        return Tasks.instrumented(StepOne.class, datas);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datas.get(0).getStrDestination()).into(INPUT_DESTINATION),
                Click.on(INPUT_IN),
                Click.on(IN),
                Click.on(OUT),
                Click.on(INPUT_CHECK),
                Click.on(INPUT_ADULT),
                //Click.on(INPUT_KIDS),
                //Click.on(INPUT_AGE),
                //Click.on(AGE),
                Click.on(BUTTON));



    }
}
