Objetivos de aprendizaje
Al finalizar este ejercicio, el lector tendrá la capacidad para:
    > Definir constructores sobrecargados.
    > Definir constructores que llamen a otros constructores.

Enunciado: clase ArtículoCientífico
Realizar un programa en Java que permita modelar un artículo científico.
Los artículos científicos contienen los siguientes metadatos: 
    nombre del artículo
    ,autor
    ,palabras claves
    ,nombre de la publicación
    ,año y 
    resumen.

Se deben definir tres constructores sobrecargados:
    	> El primero inicializa un artículo científico con solo su título y autor.
    	> El segundo constructor, un artículo científico con su nombre, autor, palabras claves, nombre de la publicación y año. Debe invocar al primer constructor.
        > El tercer constructor, un artículo científico con su nombre, autor, palabras claves, nombre de la publicación, año y resumen. Debe invocar al segundo constructor.

Se requiere un método que imprima los atributos de un artículo en
pantalla. Realizar un método main que utilice el tercer constructor para
instanciar un artículo científico e imprima los valores de sus atributos en
pantalla.