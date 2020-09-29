# new feature
# Tags: optional


Feature: Como usuario deseo poder logear a Google

  @loginGoogle
  Scenario Outline: Logearse desde Google.com.pe
    Given Usuario enter page Google
    And click en continuar
    And enter "<correo>"
    And enter password "<password>"
    When click boton continuar
    Then validate login sucessfull

    Examples:
    | correo                  | password |
    |automation2809@gmail.com | Lima2020  |

  @LoginDrive
  Scenario Outline: Logearse desde GoogleDrive
    Given Usuario enter page Google
    And enter opcion Drive
    And enter "<correo>" drive
    And enter password "<password>"
    When click boton continuar
    Then validate login sucessfull drive

    Examples:
      | correo                  | password |
      |automation2809@gmail.com | Lima2020  |