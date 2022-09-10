# Singleton Homework

Esta es una pequeña tarea que tiene como objetivo, implementar el patrón de diseño singleton.

Es un sistema de gestión de un hospital, de momento solo puede registrar usuarios genéricos
pero en un futuro quiero terminar esta aplicación que podrá gestionar pacientes, médicos,
enfermeras, Visitantes, medicamentos, y otras cosas.

El patrón se Implementa en la clase Db, que simula ser una Especia de base de datos.

Dicha clase almacena la cantidad de usuarios registrados en el sistema, de momento creo que 
cumple con los requisitos de la tarea.


# Patrones de diseño
Los patrones de diseño son una forma de hacer las cosas, tienen por objetivo solucionar problemas,
hacer que nuestro código sea legible, limpio, seguro, y escalable. Hay muchos tipos de patrones y no son exclusivos de 
algún lenguaje o alguna tecnología, cada uno tiene como objetivo solventar algún problema.

Los patrones se resumen a 3 categorías

+ Patrones creacionales
+ Patrones estructurales
+ Patrones de comportamiento

Hasta el momento, en el bootcamp solo hemos visto 3 patrones
creacionales y 3 patrones estructurales.

## Patrones Creacionales
Como su nombre lo dice, tienen por objetivo solventar los problemas que tenemos al momento de crear instancias 
de los objetos que tengamos en nuestra aplicación.

### Patron singleton
Tiene por objetivo, crear una sola instancia de un objeto esta instancia es global, y al momento de crear distintos objetos, estos siempre 
tendrán la misma instancia


### Patron builder
Este patrón, como su nombre lo dice, se implementa para crear objetos de una forma más fácil, con el estilo ```pipeline``` que 
es usado en la programación funcional, nos permite crear objetos con los parámetros que nosotros necesitemos.

### Patron Factory
Este patrón, como su nombre lo dice, es una especie de fábrica, que dependiendo del parámetro que le pasemos en el
constructor, nos **fabrica** un objeto en específico, nos proporciona una interfaz para crear objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que se crearán.

### Patron Prototype
Tiene por objetivo, crear una copia exacta de un objeto


## Patrones Estructurales

### Patron Decorator
El Objetivo de este patrón, es darle funcionalidades a un objeto sin tener que modificar el código de la clases, pasándo por constructores los objetos a los que queremos añadir funcionalidades, similar a un```if```
anidado, o una muñeca rusa.

### Patron Facade
El objetivo del Patron Facade, es crear una fachada de una parte de código muy compleja, para que podamos ejecutarla de una forma más sencilla

## Patron Adapter
El objetivo del patrón adapter, es adaptar una pieza de código externa, para que funcione con el resto de nuestro código, se usa mucho
cuando tenemos código legacy en nuestra aplicación, o código que por alguna razón no podemos modificar ni meter mano.
