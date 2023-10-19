Objetivos de aprendizaje
Al finalizar este ejercicio, el lector tendrá la capacidad para:
    > Definir métodos que utilizan objetos como parámetros de entrada.
    > Definir métodos que invocan a otros métodos definidos anteriormente.

Enunciado: clase CuentaBancaria
Se requiere modificar el programa de la cuenta bancaria (ejercicio 2.5) para
que realice las siguientes actividades:
    > Comparar saldos entre cuentas bancarias. La cuenta para comparar es un objeto que se envía como parámetro del método. El método devuelve un valor booleano de verdadero si la cuenta actual es mayor a la cuenta que se pasó como parámetro.
    > Transferir dinero de una cuenta bancaria a otra. El método debe recibir como parámetro la cuenta de destino y el valor a transferir. El saldo de la cuenta actual debe disminuir el valor a transferir y el saldo de la cuenta destino debe aumentar. El método debe reutilizar el método retirar para evaluar si la cantidad a transferir se encuentra en la cuenta de origen.