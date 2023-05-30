package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.Before;
import net.onlinenotepad.Utils.Url;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.aNewActor;

public class CommonStepDefinitions {

    private static Url page = new Url();
/*
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        aNewActor().attemptsTo(
                Open.browserOn(page)
        );
    }
*/
}
