package co.com.choucair.certification.reserva.stepdefinitions;

import co.com.choucair.certification.reserva.model.pruebaTecnicaData;
import co.com.choucair.certification.reserva.questions.Answer;
import co.com.choucair.certification.reserva.tasks.CheckIn;
import co.com.choucair.certification.reserva.tasks.OpenUp;
import co.com.choucair.certification.reserva.tasks.PushThe;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class RetoReservaStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the user wants to reserve a hotel$")
    public void thatTheUserWantsToReserveAHotel(){
        OnStage.theActorCalled("Diana").wasAbleTo(OpenUp.thePage(), PushThe.button());
    }

    @When("^user fill out the form$")
    public void userFillOutTheForm(List<pruebaTecnicaData> data) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(CheckIn.toDestination(data));
    }

    @Then("^user successfully reserve$")
    public void userSuccessfullyReserve(List<pruebaTecnicaData> data) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(data.get(0).getStrVerif())));
    }
}
