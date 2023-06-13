package com.demoblaze.main.steps;

import com.demoblaze.main.pages.PrincipalPage;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertTrue;

public class NavegacionSteps {
    @ManagedPages
    PrincipalPage principalPage;

    @Step
    public void abrirPagina() {
        principalPage.open();
    }

    @Step
    public void validarVisualizacionInicio() {

        assertThat("Conoce nuestro menú y elige tu favorito", equalTo(principalPage.obtenerTextoPagina()));
    }

    @Step
    public void clickNavegacion(String option) {
        switch (option) {
            case "Menú":
                principalPage.clickMenu();
                break;
            case "Ubicaciones":
                principalPage.clickUbicaciones();
                break;
            case "Promociones & Apps":
                principalPage.clickPromocionesApps();
                break;
            case "Cajita Feliz":
                principalPage.clickCajitaFeliz();
                break;
            case "Servicio al cliente":
                principalPage.clickServicioAlCliente();
                break;
            default:
                System.out.print("Opcion no válida");
        }
    }

    @Step
    public void validarVentana(String textoUrl) {
        principalPage.ObtenerTextoUrlMenu(textoUrl);
    }

    @Step
    public void ventanaEmergente() {
        principalPage.cerrarVentanaEmergente();
    }

    @Step
    public void clickLogoMacdonals() {
        principalPage.IrPaginaInicio();
    }

    public void clickCategoriaMenu(String category) {
        switch (category) {
            case "Desayunos":
                principalPage.clickCategoriaDesayunos();
                break;
            case "Almuerzos y cenas":
                principalPage.clickCategoriaAlmuerzosYCenas();
                break;
            case "Postres":
                principalPage.clickCategoriaPostres();
                break;
            case "McCafé":
                principalPage.clickCategoriaMcCafe();
                break;
            case "Bebidas":
                principalPage.clickCategoriaBebidas();
                break;
            case "Antojos":
                principalPage.clickCategoriaAntojos();
                break;
            case "Cajita Feliz™":
                principalPage.clickCategoriaCajitaFeliz();
                break;

            default:
                System.out.println("Categioria Inválida");

        }
    }

    public void validarVentanaMenu(String ventana, String textoEsperado) {
        String textoActual = null;
        textoActual = principalPage.obtenerTextoMenu(ventana);
        assertThat(textoActual, equalTo(textoEsperado));
    }
}
