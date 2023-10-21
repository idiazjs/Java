Objetivos de aprendizaje
Al finalizar este ejercicio, el lector tendrá la capacidad para:
    > Determinar el contenido de un objeto que ha pasado por varias instrucciones de asignación y se ha cambiado su contenido o referencia a otros objetos.
    > Cambiar el estado de un objeto utilizando métodos set.

Enunciado: clase Avión
Se tiene un código que modela una clase Avión que posee dos atributos:
    > nombre del fabricante del avión (tipo String) 
    > número de motores del avión (tipo int). 
    
La clase tiene un constructor y métodos get y set para cada atributo. Además, tiene los siguientes métodos adicionales:
    > Un método denominado imprimirFabricante(), que muestra en
    pantalla el nombre del fabricante de un avión.
    > Un método denominado cambiarFabricante(Avión a), que recibe
    como parámetro un objeto de tipo Avión y le cambia el valor de su atributo fabricante a un valor predefinido “Loockhead”.
    
En el método main se crean dos aviones: a1 (fabricante “Airbus” con cuatro motores) y a2 (fabricante “Lookheed” con cuatro motores). Luego, los datos de cada avión se imprimen por pantalla. Después, se realizan llamadas a los métodos setFabricante y cambiarFabricante, los cuales cambiarán los valores de sus atributos. ¿Cuál es el resultado final de la ejecución del método main? Determinar lo que se imprime en pantalla.