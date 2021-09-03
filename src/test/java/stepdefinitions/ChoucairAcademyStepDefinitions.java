package stepdefinitions;

import cucumber.api.java.en.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AcademyChoucairData;
import net.serenitbdd.screenplay.actors.OnlineCast;
import net.serenitbdd.screenplay.actors.OnStage;
import net.serenitbdd.screenplay.GivenWhenthen;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.Search;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsTOLearnAutomationAtTheAcademyChoucair(list<AcademyChoucairData> AcademyChoucairData)
            throws Exception {
        OnStage.theActorCalled("Andres").wasAbleTo(OpenUp.thePage(), (Login.
                onThePage(AcademyChoucairData.get(0).getStrUser(), AcademyChoucairData.get(0).getStrPassword())));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(list<AcademyChoucairData> AcademyChoucairData)
            throws Exception  {
        OnStage.theActorInTheSpotLigth().attemptsTo(Search.the(AcademyChoucairData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(list<AcademyChoucairData> AcademyChoucairData)
            throws Exception  {
        OnStage.theActorInTheSpotLigth().should(GivenWhenThen.seeThat(Answer.tothe(AcademyChoucairData.get(0).getStrCourse())));
    }
}
