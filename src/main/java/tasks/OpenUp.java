package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.performable;
import net.serenitybdd.screenplay.Task;
import userinterface.ChoucairAcademyPage;

public class OpenUp implements Task {
    private ChoucairAcademyPage choucairAcademyPage;
    public static Object thePage() {
        return Task.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T Actor){
        actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }

}
