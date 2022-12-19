Feature: Transferencias interbancarias

  Scenario: 01 - Transferencia interbancaria exitosa
    Given un usuario requiere realizar una transferencia interbancaria
    When realiza la transferencia antes de las 2 pm
    Then la transferencia es exitosa