package questions;

import userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements question<Boolean>{
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static String tothe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean AnsweredBy(Actor actor) {
        Boolean result;
        String nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if (question.equals(nameCourse)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
