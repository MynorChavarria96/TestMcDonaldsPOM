package com.demoblaze.main.definitions;

import com.demoblaze.main.steps.NavegacionSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NavegationDefinitions {
    @Steps
    NavegacionSteps navegacionSteps;
    @Given("^que un usuario visita la pagina de Inicio$")
    public void queUnUsuarioVisitaLaPaginaDeInicio()  {
        navegacionSteps.abrirPagina();
    }

    @When("^la ventana emergente aparece$")
    public void laVentanaEmergenteAparece()  {
       navegacionSteps.ventanaEmergente();
    }
    @Then("^el usuario es redirigido y la url contiene la palabra \"([^\"]*)\"$")
    public void elUsuarioEsRedirigidoYLaUrlContieneLaPalabraSomething(String value1) {
        navegacionSteps.validarVentana(value1);
    }

    @And("^da clic en \"([^\"]*)\"$")
    public void daClicEnSomething(String strArg1)  {
    navegacionSteps.clickLogoMacdonals();
    }

    @Then("^el usuario puede ver el texto \"([^\"]*)\"$")
    public void elUsuarioPuedeVerElTextoSomething(String strArg1)  {
    navegacionSteps.validarVisualizacionInicio();
    }
    @When("^el usuario hace clic en \"([^\"]*)\"$")
    public void elUsuarioHaceClicEnSomething(String value)  {
    navegacionSteps.clickNavegacion(value);
    }
    @When("^el usuario hace clic en la categoria \"([^\"]*)\"$")
    public void elUsuarioHaceClicEnLaCategoriaSomething(String value)  {
    navegacionSteps.clickCategoriaMenu(value);
    }


    @Then("^el usuario es redirigido a la ventana de \"([^\"]*)\" y ve el texto de \"([^\"]*)\"$")
    public void elUsuarioEsRedirigidoALaVentanaDeSomethingYVeElTextoDeSomething(String value1, String value2) {
       navegacionSteps.validarVentanaMenu(value1, value2);
    }



}
