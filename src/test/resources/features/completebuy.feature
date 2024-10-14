#Autor: Jorge Dominguez
#language: en

Feature: Complete buy

  Yo como usuario quiero loguearme a la web
  agregar 2 articulos al carrito
  llenar el formulario y completar la compra

  Background:
    Given "user" login to the web page

  Scenario Outline: open the web and buy items
    When add items "<product1>" and "<product2>" to cart
    And complete form
    And check the buy
    Then confirm order

    Examples:
      | product1            | product2              |
      | Sauce Labs Backpack | Sauce Labs Bike Light |