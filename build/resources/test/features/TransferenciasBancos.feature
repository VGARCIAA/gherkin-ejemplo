Feature: Transferencias interbancarias a bancos especificos

  @RutaCritica @Regresion
  Scenario Outline: 02 - Transferencia interbancaria exitosa a banco
    Given un usuario requiere realizar una transferencia interbancaria
    And la cuenta destino es del "<banco>"
    When realiza la transferencia antes de las 2 pm
    Then la transferencia es exitosa
    Examples:
      |banco              |
      |BBVA               |
      |Davivienda         |
      |Banco Pichincha    |

  @SmokeTest
  Scenario: 03 - Transferencia interbancaria fallida
    Given un usuario requiere realizar una transferencia interbancaria
    When realiza la transferencia despues de las 2 pm
    Then la transferencia es fallida