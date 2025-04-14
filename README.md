# Primeras Prácticas en Java: Gestión de Publicaciones con POO

## Descripción

Este proyecto es una introducción a la **Programación Orientada a Objetos (POO)** en Java. A través de la creación de un sistema para gestionar **publicaciones** como Libros, Revistas e Ilustraciones, se implementan conceptos fundamentales de la POO, como clases, herencia, interfaces y excepciones personalizadas. 

## Estructura de Clases

- **Publicacion**: Clase base con atributos comunes como `titulo` y `anio`.  
- **Libro**: Subclase de `Publicacion`, con atributos adicionales como `autor` y `genero`.
- **Revista**: Subclase de `Publicacion` que implementa la interfaz `Leible`.
- **Ilustracion**: Subclase de `Publicacion`, también implementando la interfaz `Leible`.
- **Leible**: Interfaz que define el comportamiento para ser leída.
- **Biblioteca**: Clase encargada de gestionar las publicaciones, con métodos para agregar, mostrar y leer publicaciones.
- **PublicacionRepetidaException**: Excepción personalizada para cuando se intenta agregar una publicación repetida.

## Funcionalidades

- **Agregar Publicaciones**: Permite agregar publicaciones a la biblioteca.
- **Mostrar Publicaciones**: Muestra todas las publicaciones agregadas.
- **Leer Publicaciones**: Permite leer publicaciones que implementen la interfaz `Leible`.

## Ejemplo de Ejecución

```java
Biblioteca b1 = new Biblioteca();

Publicacion lib1 = new Libro("Borges", Genero.FICCION, "Cielos", 19);
Publicacion rev1 = new Revista("Revista de Ciencia", 2023, 1);
Publicacion ilu1 = new Ilustracion("Manuel", 102, 104, "Ilustracion de Paisaje", 2023);

b1.agregarPublicacion(lib1);
b1.agregarPublicacion(rev1);
b1.agregarPublicacion(ilu1);

b1.mostrarPublicaciones();
b1.leerPublicaciones(rev1);
