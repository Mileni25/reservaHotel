package co.com.choucair.certification.reserva.tasks;

import co.com.choucair.certification.reserva.model.bookingData;
import static co.com.choucair.certification.reserva.userinterface.FillStepThree.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.List;

public class StepThree implements Task {
    private List<bookingData> datas;

    public StepThree(List<bookingData> datas) {
        this.datas = datas;
    }

    public static StepThree fillReserve(List<bookingData> datas) {
        return Tasks.instrumented(StepThree.class, datas);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_RESERVE),
               SelectFromOptions.byValue(datas.get(0).getStrBedrooms()).from(SELECT),
                //WaitUntil.the(BUTTON_RES, isVisible()).forNoMoreThan(120).seconds(),
                Scroll.to(COMPLETAR),
                Click.on(BUTTON_RES));
                //Enter.theValue(datas.get(0).getStrBedrooms()).into(SELECT),
               //Hit.the(Keys.ENTER).into(SELECT));
                //Click.on(SELECT));



    }
}
