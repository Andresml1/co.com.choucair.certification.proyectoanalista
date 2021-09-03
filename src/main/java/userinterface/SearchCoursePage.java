package userinterface;

import net.serenitybdd.core.pages.pageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends pageObject {
    public static final Target BUTTON_UC = Target.the(  "Select university choucair")
            .located(By.xpath("//div[@id='universidad']//strong"));
    public static final Target INPUT_COURSE = Target.the( "search course")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the( "click for search course")
            .located(By.id("//button[contains(@class='btn btn-secondary')]"));
    public static final Target SELECT_COURSE = Target.the( "click for search course")
            .located(By.xpath("//h4[contains(text(),'Recursos automatización Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extract course name")
            .located(By.xpath("//h1[contains(text(),'Recursos automatización Bancolombia')]"));
}
