Objetivo de aprendizaje
Al finalizar este ejercicio, el lector tendrá la capacidad para definir y utilizar
atributos y métodos estáticos en una clase.

Enunciado: clase Atleta
Realizar un programa en Java que permita modelar un atleta, el cual tiene
los siguientes atributos de instancia:
    > Identificador del atleta de tipo int.
    > Nombre del atleta de tipo String.
    > Tiempo en realizar una prueba de 400 metros por relevos, de tipo double.

Además, se tienen los siguientes atributos estáticos:
    > Un contador con la cantidad de atletas creados, el cual servirá como identificador de un atleta.
    > Un atributo estático denominado selección de tipo String con el valor “Colombia”.
    > Un atributo estático denominado tiempoEquipo que sume los valores de tiempo obtenidos por un equipo de atletas.

Es necesario crear un constructor para la clase con los parámetros:
    nombre y 
    tiempo de cada atleta. 
En el constructor se debe inicializar el identificador del atleta con base en el contador estático.

También se deben implementar los siguientes métodos:
    > Correr 400 metros: este método actualiza el tiempo total de carrera del equipo sumando el tiempo de carrera de cada atleta.
    > Un método estático que imprima el nombre de la selección de atletismo, el cual es un atributo estático.
    > Un método estático que imprima el tiempo total obtenido por el equipo de atletismo.
    > Un método main que debe crear cuatro atletas que conforman el equipo de relevos de 400 metros, con los valores de la tabla 3.1.

Objeto      Nombre                  Tiempo (segundos)
atleta1     Alejandro Perlaza        9.55
atleta2     Anthony Zambrano         9.28
atleta3     Diego Palomeque          9.53
atleta4     Gilmar Herrera           9.29