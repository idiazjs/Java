Objetivos de aprendizaje
Al finalizar este ejercicio el lector tendrá la capacidad para:
    > Definir atributos de una clase con un tipo de primitivo de dato.
    > Definir los valores iniciales de los atributos de una clase.
    > Definir atributos de tipo enumerado.

Enunciado: clase Planeta
Se requiere un programa que modele el concepto de un planeta del sistema
solar. Un planeta tiene los siguientes atributos:
    > Un nombre de tipo Sring con valor inicial de null.
    > Cantidad de satélites de tipo int con valor inicial de cero.
    > Masa en kilogramos de tipo double con valor inicial de cero.
    > Volumen en kilómetros cúbicos de tipo double con valor inicial de cero.
    > Diámetro en kilómetros de tipo int con valor inicial de cero.
    > Distancia media al Sol en millones de kilómetros, de tipo int con valor inicial de cero.
    > Tipo de planeta de acuerdo con su tamaño, de tipo enumerado con los siguientes valores posibles: GASEOSO, TERRESTRE y ENANO.
    > Observable a simple vista, de tipo booleano con valor inicial false.

La clase debe incluir los siguientes métodos:
    > La clase debe tener un constructor que inicialice los valores de sus respectivos atributos.
    > Definir un método que imprima en pantalla los valores de los atributos de un planeta.
    > Calcular la densidad un planeta, como el cociente entre su masa y volumen.
    > Determinar si un planeta del sistema solar se considera exterior.

Un planeta exterior está situado más allá del cinturón de asteroides. El cinturón de asteroides se encuentra entre 2.1 y 3.4 UA. Una
unidad astronómica (UA) es la distancia entre la Tierra y el Sol=
149597870 Km.
    > En un método main se deben crear dos planetas y mostrar los valores de sus atributos en pantalla. Además, se debe imprimir la densidad de cada planeta y si el planeta es un planeta exterior del sistema solar.