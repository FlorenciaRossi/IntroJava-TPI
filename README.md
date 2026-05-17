# Nuestro primer ejercicio en JAVA

## Preparación del ambiente

**[Primeros Pasos en Visual Studio Code](https://www.youtube.com/watch?v=gkZKDWWtOqI)**, muestra cómo realizar lo siguiente en VSCode: 
- Crear un Proyecto Java
- Abrir un Proyecto o Carpeta Existente
-  Clonar un Repositorio de GitHub
- Agregar más de un proyecto al workspace
- Crear Paquetes
- Compilar un programa java desde la terminal

**[Aprende a usar el debug de VSCode](https://www.youtube.com/watch?v=lPg5VUrOVgY)** , es un tutorial completo y sencillo para aprender a debuggear en VSCode.

**[Cómo instalar JAVA JDK en Winows 10 / 11 y configurar variables de entorno JAVA_HOME](https://www.youtube.com/watch?v=0FXl5rBwNVk)**  
Si fuera necesario configurar las variables de entorno JAVA_HOME y PATH este video explica cómo hacerlo en Windows. El video muestra cómo configurar las variables a partir del minuto 1:14.  
Para configurar las variables en otros sistemas operativos ver la [documentación de Java](https://www.java.com/es/download/help/path_es.html).


## Objetivo

Conocer el lenguaje JAVA modelando un pequeño juego donde un personaje se mueve en un mapa y recolecta objetos.


## Contexto

Existe un personaje ubicado en una posición del mapa.

El personaje puede:

- moverse en distintas direcciones
- encontrarse con objetos en el mapa
- recolectarlos
- recibir efectos según el objeto encontrado

Habrá distintos tipos de objetos recolectables, por ejemplo:

- monedas
- pociones

Cada uno debe tener un comportamiento propio.

---

## Requerimientos
 ##### 1. Movimiento del personaje
 ##### 2. Posición
 ##### 3. Objetos recolectables
 ###### Moneda
- tiene un valor
- al recolectarse suma dinero al personaje

 ###### Poción

- recupera energía del personaje


##### 4. Recolección

Cuando el personaje se encuentre en la misma posición que un objeto:

- debe recolectarlo
- debe aplicarse el efecto correspondiente



## Ejemplo de ejecución esperada

```java
Personaje personaje =
        new Personaje(new Posicion(2, 2));

List<Recolectable> objetos =
        new ArrayList<>();

objetos.add(
        new Moneda(
                new Posicion(2, 3),
                5
        )
);

objetos.add(
        new Pocion(
                new Posicion(3, 3)
        )
);

personaje.mover(Direccion.ARRIBA);
personaje.recoger(objetos);

personaje.mover(Direccion.DERECHA);
personaje.recoger(objetos);

personaje.mostrarInventario();
```