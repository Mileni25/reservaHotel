package co.com.choucair.certification.reserva.stepdefinitions;

import co.com.choucair.certification.reserva.model.bookingData;
import co.com.choucair.certification.reserva.questions.Answer;
import co.com.choucair.certification.reserva.tasks.*;
import co.com.choucair.certification.reserva.userinterface.FillStepThree;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class BookingStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the user wants to reserve a hotel with his user$")
    public void thatTheUserWantsToReserveAHotelWithHisUser()  {
        OnStage.theActorCalled("Diana").wasAbleTo(OpenBooking.Page());
    }

    @When("^user log in and record the data of reservation data$")
    public void userLogInAndRecordTheDataOfReservationData(List<bookingData> datas) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(StepOne.fillDestiantion(datas),
                StepTwo.fillAvailability(datas), StepThree.fillReserve(datas));
    }

    @When("^choose the hotel with their preferences$")
    public void chooseTheHotelWithTheirPreferences() {

    }

    @Then("^user successfully$")
    public void userSuccessfully(List<bookingData> datas) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(datas.get(0).getStrVerif())));

    }


}
