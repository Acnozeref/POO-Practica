# POO-Practica

> **Repositorio provisional.** La información se irá ampliando a medida que se agreguen nuevos mini-proyectos.

Colección de mini-proyectos para practicar **Programación Orientada a Objetos (POO)** en Java.

## Mini-proyectos

| Proyecto | Descripción | Conceptos de POO | Carpeta |
|---|---|---|---|
| Biblioteca | Gestión básica de libros, usuarios, préstamos y devoluciones. | Clases y objetos, encapsulamiento, constructores, composición, colecciones | [src/Biblioteca](./src/Biblioteca) |

> _(Se irán añadiendo más filas conforme se incorporen nuevos mini-proyectos.)_

## Biblioteca

Primer mini-proyecto del repositorio. Simula el funcionamiento básico de una biblioteca: registrar libros y usuarios, consultar el catálogo, prestar libros y devolverlos.

- **Carpeta:** [src/Biblioteca](./src/Biblioteca)

### Conceptos de POO aplicados

- **Clases y objetos:** se modelan las entidades del dominio con las clases `Libro`, `Usuario` y `Biblioteca`, y se crean objetos a partir de ellas.
- **Atributos y encapsulamiento:** los atributos se declaran `private` y se accede a ellos mediante métodos públicos (`getters` y `setters`), ocultando el estado interno.
- **Constructores:** cada clase inicializa sus atributos a través de su constructor.
- **Métodos:** cada clase expone su comportamiento mediante métodos (`registrarLibro`, `prestarLibro`, `devolverLibro`, etc.).
- **Abstracción:** `Biblioteca` concentra la lógica de negocio y oculta los detalles de cómo se almacenan y buscan los datos.
- **Composición:** `Biblioteca` contiene colecciones de `Libro` y de `Usuario`; los objetos se relacionan entre sí.
- **Colecciones:** se usa `ArrayList` para almacenar libros y usuarios, y se recorren con bucles `for-each`.
- **Búsqueda y validación:** se recorre la colección y se comparan valores con `equals` para localizar libros y usuarios, comprobando además la disponibilidad antes de prestar.

### Conceptos pendientes de practicar

Herencia, polimorfismo, interfaces, clases abstractas, excepciones y persistencia de datos.

### Requisitos

- JDK 17 o superior (el proyecto se desarrolló con JDK 25).

### Cómo ejecutar

Desde la raíz del proyecto:

```bash
javac -d out src/Biblioteca/*.java
java -cp out Biblioteca.MainBiblioteca
```

También puedes abrir el proyecto directamente en IntelliJ IDEA.

## Próximos pasos

- Añadir nuevos mini-proyectos y completar su información en este README.
- Documentar en cada uno los conceptos de POO trabajados.
- Ampliar la hoja de ruta de conceptos pendientes.
