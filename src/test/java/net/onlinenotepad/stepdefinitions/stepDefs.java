package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.onlinenotepad.Utils.Url;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.aNewActor;

public class stepDefs {

    private static Url page = new Url();
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
        aNewActor().attemptsTo(
                Open.browserOn(page)
        );
    }

    @Given("Yo como usuario deseo crear una nota de texto enriquecido")
    public void yoComoUsuarioDeseoCrearUnaNotaDeTextoEnriquecido() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Yo como usuario valido la creacion exitosa de la nota de texto")
    public void yoComoUsuarioValidoLaCreacionExitosaDeLaNotaDeTexto() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Yo como usuario selecciono la un articulo y lo elimino")
    public void yoComoUsuarioSeleccionoLaUnArticuloYLoElimino() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Yo como usuario valido que se elimine correctamente la nota")
    public void yoComoUsuarioValidoQueSeElimineCorrectamenteLaNota() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Yo como usuario selecciono y muevo un articulo de la lista de {int} elementos")
    public void yoComoUsuarioSeleccionoYMuevoUnArticuloDeLaListaDeElementos(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Yo como usuario valido la nueva posicion del articulo")
    public void yoComoUsuarioValidoLaNuevaPosicionDelArticulo() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
