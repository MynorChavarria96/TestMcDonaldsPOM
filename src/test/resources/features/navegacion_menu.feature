#Pagina Macdonals Guatemala
# https://mcdonalds.com.gt/
Feature: Navegacion y menu de productos del sitio web

  Background: Usuario visita la pagina de Inicio
    Given que un usuario visita la pagina de Inicio
    When la ventana emergente aparece


  Scenario: Navegar a traves de las paginas principales

    Then el usuario puede ver el texto "Conoce nuestro menú"
    When el usuario hace clic en "Menú"
    Then el usuario es redirigido y la url contiene la palabra "menu"
    And da clic en "Logo McDonald's"
    Then el usuario puede ver el texto "Conoce nuestro menú"
    When el usuario hace clic en "Ubicaciones"
    Then el usuario es redirigido y la url contiene la palabra "restaurantes"
    And da clic en "Logo McDonald's"
    Then el usuario puede ver el texto "Conoce nuestro menú"
    When el usuario hace clic en "Promociones & Apps"
    Then el usuario es redirigido y la url contiene la palabra "promociones-y-apps"
    And da clic en "Logo McDonald's"
    When el usuario hace clic en "Cajita Feliz"
    Then el usuario es redirigido y la url contiene la palabra "cajita-feliz"
    And da clic en "Logo McDonald's"
    Then el usuario puede ver el texto "Conoce nuestro menú"
    When el usuario hace clic en "Servicio al cliente"
    Then el usuario es redirigido y la url contiene la palabra "servicio-al-cliente"
    And da clic en "Logo McDonald's"
    Then el usuario puede ver el texto "Conoce nuestro menú"

  Scenario Outline: Verificar productos del menu
    When el usuario hace clic en "Menú"
    Then el usuario es redirigido y la url contiene la palabra "menu"
    When el usuario hace clic en la categoria "<category>"
    Then el usuario es redirigido a la ventana de "<category>" y ve el texto de "<category>"
    When el usuario hace clic en "Menú"
    Then el usuario es redirigido y la url contiene la palabra "menu"
#
    Examples:
      | category          |
      | Desayunos         |
      | Almuerzos y cenas |
      | Postres           |
      | McCafé            |
      | Bebidas           |
      | Antojos           |
      | Cajita Feliz™     |

