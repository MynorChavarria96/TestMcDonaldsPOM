package com.demoblaze.main.pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

@DefaultUrl("https://mcdonalds.com.gt")


public class PrincipalPage extends PageObject {
    @FindBy(xpath = "//a[contains(@class, 'item-nav' )and text()=' Menú ']")
    private WebElement btnMenu;
    @FindBy(xpath = "//a[contains(@class, 'item-nav' )and text()=' Ubicaciones ']")
    private WebElement btnUbicaciones;
    @FindBy(xpath = "//a[contains(@class, 'item-nav' )and text()=' Promociones & Apps ']")
    private WebElement btnPromocionesApps;
    @FindBy(xpath = "//a[contains(@class, 'item-nav' )and text()=' Cajita Feliz ']")
    private WebElement btnCajitaFeliz;
    @FindBy(xpath = "//a[contains(@class, 'item-nav' )and text()=' Servicio al cliente ']")
    private WebElement btnServicioAlCliente;
    @FindBy(xpath = "//button[@id= 'wzrk-cancel']")
    private WebElement btnCerrarVentanaEmergente;
    @FindBy(xpath = "//a[contains(@class, 'container-img') and contains(@href, 'Desayuno')]")
    private WebElement  btnMDesayunos;
    @FindBy(xpath = "//a[contains(@class, 'container-img') and contains(@href, 'almuerzos-y-cenas')]")
    private WebElement    btnMAlmuerzosYCenas;
    @FindBy(xpath = "//a[contains(@class, 'container-img') and contains(@href, 'Postres')]")
    private WebElement    btnMPostres;
    @FindBy(xpath = "//a[contains(@class, 'container-img')]/span[contains(text(), 'McCafé')]")
    private WebElement    btnMMcCafe;
    @FindBy(xpath = "//a[contains(@class, 'container-img') and contains(@href, 'Bebidas')]")
    private WebElement    btnMBebidas;
    @FindBy(xpath = "//a[contains(@class, 'container-img') and contains(@href, 'Antojos')]")
    private WebElement    btnMAntojos;
    @FindBy(xpath = "//a[contains(@class, 'container-img') and contains(@href, 'cajita-feliz')]")
    private WebElement    btnMCajitaFeliz;



    public String obtenerTextoPagina() {
        WebElement elemento = getDriver().findElement(By.xpath("//p[@class = 'mc-text-info']"));
        waitFor(elemento).isVisible();
        String text = elemento.getText();
        return text;
    }

    public void clickMenu() {
        waitFor(btnMenu).isVisible();
        btnMenu.click();
    }
    public void clickUbicaciones() {
        waitFor(btnUbicaciones).isVisible();
        btnUbicaciones.click();
    }
    public void clickPromocionesApps() {
        waitFor(btnPromocionesApps).isVisible();
        btnPromocionesApps.click();
    }
    public void clickCajitaFeliz() {
        waitFor(btnCajitaFeliz).isVisible();
        btnCajitaFeliz.click();
    }
    public void clickServicioAlCliente() {
        waitFor(btnServicioAlCliente).isVisible();
        btnServicioAlCliente.click();
    }

    public WebElement encontrarElemento(By selector) {
        try {
            return getDriver().findElement(selector);
        } catch (NoSuchElementException e) {
            return null; // Retorna null si el elemento no se encuentra
        }
    }

    public void cerrarVentanaEmergente() {
        By selector = By.xpath("//div[@id='wzrk_wrapper']");
        WebElement elemento = encontrarElemento(selector);

        if (elemento != null) {
            waitFor(btnCerrarVentanaEmergente).isVisible();
            btnCerrarVentanaEmergente.click();
        } else {
            return;
        }
    }

    public void IrPaginaInicio() {
        WebElement elemento = getDriver().findElement(By.xpath("//a[@aria-label=\"Logo McDonald's\"]"));
        waitFor(elemento).isVisible();
        elemento.click();
    }


    public void ObtenerTextoUrlMenu(String textoUrl) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains(textoUrl));
    }


    public void clickCategoriaDesayunos() {
        waitFor(btnMDesayunos).isVisible();
        btnMDesayunos.click();
    }

    public void clickCategoriaAlmuerzosYCenas() {
        waitFor(btnMAlmuerzosYCenas).isVisible();
        btnMAlmuerzosYCenas.click();
    }

    public void clickCategoriaPostres() {
        waitFor(btnMPostres).isVisible();
        btnMPostres.click();
    }

    public void clickCategoriaMcCafe() {
        waitFor(btnMMcCafe).isVisible();
        btnMMcCafe.click();
    }

    public void clickCategoriaBebidas() {
        waitFor(btnMBebidas).isVisible();
        btnMBebidas.click();
    }
    public void clickCategoriaAntojos() {
        waitFor(btnMAntojos).isVisible();
        btnMAntojos.click();
    }

    public void clickCategoriaCajitaFeliz() {
        waitFor(btnMCajitaFeliz).isVisible();
        btnMCajitaFeliz.click();
    }


    public String obtenerTextoMenu(String elem) {
        WebElement elemento = getDriver().findElement(By.xpath("//h1[contains(text(), '"+elem+"')]"));
        return  elemento.getText();
    }


}
