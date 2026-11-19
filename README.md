# POO-Practica

> **Repositorio provisional.** La información se irá ampliando a medida que se agreguen nuevos mini-proyectos.

Colección de mini-proyectos para practicar **Programación Orientada a Objetos (POO)** en Java.

## Mini-proyectos

| Proyecto | Descripción | Conceptos de POO | Carpeta |
|---|---|---|---|
| Biblioteca | Gestión básica de libros, usuarios, préstamos y devoluciones. | Clases y objetos, encapsulamiento, constructores, composición, colecciones | [src/Biblioteca](./src/Biblioteca) |
| Inventario | Gestión de productos, stock y movimientos de entrada y salida, con validación de datos y control de IDs duplicados. | Clases y objetos, encapsulamiento, constructores, composición, colecciones, validación y excepciones | [src/Inventario](./src/Inventario) |

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

- JDK 25 o superior (el proyecto está configurado con JDK 25).

### Cómo ejecutar

Desde la raíz del proyecto:

```bash
javac -d out src/Biblioteca/*.java
java -cp out Biblioteca.MainBiblioteca
```

También puedes abrir el proyecto directamente en IntelliJ IDEA.

## Inventario

Segundo mini-proyecto del repositorio. Simula el control básico de un almacén: registrar productos (rechazando nulos e IDs repetidos), consultar el catálogo, buscar por identificador, agregar y retirar existencias y registrar cada movimiento de entrada o salida.

- **Carpeta:** [src/Inventario](./src/Inventario)

### Conceptos de POO aplicados

- **Clases y objetos:** se modelan las entidades del dominio con las clases `Producto`, `Movimiento` e `Inventario`, y se crean objetos a partir de ellas.
- **Atributos y encapsulamiento:** los atributos se declaran `private` y se accede a ellos mediante métodos públicos (`getters`); el stock solo se modifica a través de `agregarStock` y `retirarStock`, aplicando las condiciones en un único lugar.
- **Constructores:** cada clase inicializa sus atributos a través de su constructor; `Inventario` crea además sus colecciones vacías.
- **Métodos:** cada clase expone su comportamiento mediante métodos (`registrarProducto`, `buscarProducto`, `agregarExistencias`, `retirarExistencias`, `consultarMovimientos`, etc.).
- **Abstracción:** `Inventario` concentra la lógica de negocio y oculta los detalles de cómo se almacenan y buscan los datos.
- **Composición:** `Inventario` contiene colecciones de `Producto` y de `Movimiento`, y cada `Movimiento` guarda una referencia al `Producto` al que pertenece; los objetos se relacionan entre sí.
- **Colecciones:** se usa `ArrayList` para almacenar productos y movimientos, y se recorren con bucles `for-each`.
- **Búsqueda y validación:** se recorre la colección con una variable centinela (`encontrado`) para localizar productos por `id` (que es `int` y se compara con `==`, frente a `equals` para las cadenas de Biblioteca), comprobando además que la cantidad sea mayor que cero y que exista stock suficiente antes de retirar.
- **Validación y excepciones:** el constructor de `Producto` lanza `IllegalArgumentException` si el `id` no es positivo, el `nombre` es `null` o está en blanco (`isBlank()`), el `precio` no es positivo o el `stock` es negativo, evitando objetos con estado inválido.
- **Retorno anticipado:** `registrarProducto` comprueba primero si el producto es `null` o si ya existe otro con el mismo `id`, y sale con `return` antes de modificar la colección.
- **Encadenación de llamadas:** en `consultarMovimientos` se accede al producto asociado directamente con `movimiento.getProducto().getId()`.

### Conceptos pendientes de practicar

Manejo de excepciones con `try/catch` (los ejemplos de `MainInventario` están comentados), herencia, polimorfismo, interfaces, clases abstractas y persistencia de datos. Como mejora concreta, el campo `tipo` de `Movimiento` podría sustituirse por un `enum` (`ENTRADA`, `SALIDA`) en lugar de un `String`.

### Requisitos

- JDK 25 o superior (el proyecto está configurado con JDK 25).

### Cómo ejecutar

Desde la raíz del proyecto:

```bash
javac -d out src/Inventario/*.java
java -cp out Inventario.MainInventario
```

Para probar el manejo de excepciones, descomenta los bloques `try/catch` de `MainInventario`.

También puedes abrir el proyecto directamente en IntelliJ IDEA.

## Próximos pasos

- Añadir nuevos mini-proyectos y completar su información en este README.
- Documentar en cada uno los conceptos de POO trabajados.
- Ampliar la hoja de ruta de conceptos pendientes.
