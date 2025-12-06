## Autor del proyecto
_**Nombre completo:** Mónica Figueroa
_**Sección:** 2
_**Analista Programador Computacional**

---

## Descripción general del proyecto

El proyecto SalmonttAppSemana7 es una aplicación desarrollada en Java que modela entidades reales de la industria salmonera chilena aplicando conceptos fundamentales de Programación Orientada a Objetos y buenas prácticas de desarrollo en Java tales como:

- Herencia simple.
- Encapsulamiento.
- Abstracción (uso de clase abstracta).
- Sobrescritura de métodos mediante @Override.
- Polimorfismo en tiempo de ejecución.
- Uso de colecciones genéricas (List<UnidadOperativa>).
- Reutilización de comportamiento mediante super.
- Organización lógica mediante paquetes (model, data y ui).
- Separación de responsabilidades.
- Documentación con Javadoc.

## Objetivos del proyecto

### Objetivo general
Implementar una jerarquía de clases en Java que represente diferentes unidades operativas de una empresa salmonera, aplicando conceptos de herencia, abstracción, polimorfismo y colecciones genéricas.

### Objetivos específicos

1. Crear una Superclase abstracta llamada UnidadOperativa.
2. Implementar en esta Superclase el método `public String mostrarInformacion()` que retorna la información base (nombre y comuna)
3. Crear dos subclases:
- `CentroCultivo`, que incorpora la producción anual en toneladas.
- `PlantaProceso`, que incorpora la capacidad anual en toneladas.
4. Sobrescribir el método `mostrarInformacion()`en cada subclase usando @Override y llamar a `super.mostrarInformacion()`.
5. **Organizar el proyecto por responsabilidad** en los paquetes solicitados:
- `model/` -> Jerarquía de clases.
- `data/`-> Creación de instancias de prueba.
- `ui/` -> Ejecución del programa.
6. Crear una colección genérica del tipo `List<UnidadOperativa>`.
7. Implementar en la clase `GestorUnidades` el método `public List<UnidadOperativa>crearUnidades()`. 
8. Instanciar y almacenar en la lista 5 unidades operativas.
9. Recorrer la lista utilizando un ciclo `for-each` y mostrar en consola la información usando polimorfismo.


## Descripción de paquetes
### `ui/`
Contiene la clase `Main`, que ejecuta el programa y muestra los resultados.
### `data/`
Incluye `GestorUnidades`, responsable de crear las instancias de prueba de cada subclase y enviarlas a consola.
### `model/`, Contiene toda la jerarquía de clases:
- `UnidadOperativa` (Superclase abstracta)
- `CentroCultivo` (subclase)
- `PlantaProceso` (subclase)

## Estructura del proyecto
```SalmonttAppSemana7
├ .idea/
├ .mvn/
├ docs/
├ src/
|  └ main/
|     ├ java/
|     |  └ org.example/
|     |     ├ data/
|     |     |  └ GestorUnidades.java
|     |     ├ model/
|     |     |  ├ CentroCultivo.java
|     |     |  ├ PlantaProceso.java
|     |     |  ├ UnidadOperativa.java
|     |     ├ ui/
|     |     |  └ Main.java
|     └ resources/
├ test/
├ target/
├ .gitignore
├ pom.xml
└ README.md
```

## Instrucciones para clonar y ejecutar el proyecto
1. Clonar el repositorio desde GitHub.
```bash
Git clone [codigo]
```
2. Abre el proyecto en IntelliJ IDEA.
3. Ejecutar la clase org.example.ui.Main.java
4. Salida por consola:
Al ejecutar la aplicación, se mostrará un listado de las unidades operativas de la empresa, que son generadas por la sobrescritura del método `mostrarInformacion()`en cada subclase.