# language:es

  Característica: Retiros de cuentas de ahorro

    Escenario: Retiro exitoso
      Dado que existe un usuario con cuenta de ahorro
      Y la cuenta de ahorro tiene saldo
      Cuando el usuario retira un monto menor al saldo
      Entonces el retiro es exitoso


