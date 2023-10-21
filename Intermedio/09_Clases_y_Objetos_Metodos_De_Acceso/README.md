Objetivo de aprendizaje
Al finalizar este ejercicio, el lector tendrá la capacidad para definir métodos     de acceso para clases, atributos, constructores y métodos de un programa.

Enunciado: clase Película
Realizar un programa en Java que defina una clase Película con los siguientes atributos privados:
    > Nombre: es el nombre de la película y es de tipo String.
    > Director: representa el nombre del director de la película y es de tipo String.
    > Género: es el género de la película, un tipo enumerado con los siguientes valores: ACCIÓN, COMEDIA, DRAMA y SUSPENSO.
    > Duración: duración de la película en minutos, esta es de tipo int.
    > Año: representa el año de realización de la película.
    > Calificación: es la valoración de la película por parte de sus usuarios y es de tipo double.

Se debe definir un constructor público para la clase, que recibe como parámetros los valores de todos sus atributos. También se deben definir los siguientes métodos:
    > Métodos get y set para cada atributo y con los derechos de acceso privados para los set y públicos para los get.
    > Un método imprimir público que muestre en pantalla los valores de los atributos.
    > Un método privado boolean esPeliculaEpica(), el cual devuelve un valor verdadero si la duración de la película es mayor o igual a tres horas, en caso contrario devuelve falso.
    > Un método privado String calcularValoración(), el cual según la tabla 2.5 devuelve una valoración subjetiva.

Calificación    Valoración
[0, 2]          Muy mala 
(2, 5]          Mala 
(5, 7]          Regular
(7, 8]          Buena
(8, 10]         Excelente

    > El método privado boolean esSimilar() compara la película actual con otra película que se le pasa como parámetro. Si ambas películas son del mismo género y tienen la misma valoración, devuelve verdadero; en caso contrario, devuelve falso.