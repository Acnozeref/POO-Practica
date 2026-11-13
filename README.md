# POO-Practica

Práctica de Programación Orientada a Objetos en Java: un sistema básico de gestión de biblioteca.

## Funcionalidades

- Registrar libros.
- Registrar usuarios.
- Consultar el catálogo de libros y su disponibilidad.
- Prestar libros a usuarios registrados.
- Devolver libros.

## Estructura del proyecto

```
src/Biblioteca/
├── Biblioteca.java       # Lógica de la biblioteca (registro, préstamo y devolución)
├── Libro.java            # Modelo de un libro
├── Usuario.java          # Modelo de un usuario
└── MainBiblioteca.java   # Punto de entrada con datos de ejemplo
```

## Requisitos

- JDK 17 o superior (el proyecto se desarrolló con JDK 25).

## Cómo compilar y ejecutar

Desde la raíz del proyecto:

```bash
javac -d out src/Biblioteca/*.java
java -cp out Biblioteca.MainBiblioteca
```

También puedes abrir el proyecto directamente en IntelliJ IDEA.
