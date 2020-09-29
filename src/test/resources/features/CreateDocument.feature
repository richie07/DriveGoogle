# new feature
# Tags: optional

@create
Feature: Como Usuario deseo ver el documento de texto creado

  Background:Logearse desde GoogleDrive
    Given Usuario enter page Google
    And enter opcion Drive
    And enter "automation2809@gmail.com" drive
    And enter password "Lima2020"
    When click boton continuar
    Then validate login sucessfull drive


  Scenario: Creación de documento de texto
    Given User create one document text "E01_Richard Francisco Pinedo Calle_" with time
    When return document page principal
    Then  User should see my document create
