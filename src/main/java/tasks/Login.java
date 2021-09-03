package tasks;

import co.com.choucair.certification.academy.userinterface.choucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ChoucairLoginPage;

public class Login {

    private String strUser;
    private String strPassword;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static Login onThePage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class, strUser,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T Actor) {
        actor.attepmtsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
            Enter.theValue(strUser).into(ChoucairLoginPage.INPUT_USER),
            Enter.theValue(strPassword).into(ChoucairLoginPage.INPUT_PASSWORD),
            Click.on(ChoucairLoginPage.ENTER_BUTTON)
        );

    }
}
