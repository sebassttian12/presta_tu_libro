# PRESTA_TU_LIBRO

## 📖 Introducción

Book Exchange es un sistema de gestión e intercambio de libros entre usuarios. Su objetivo es facilitar el préstamo, solicitud y seguimiento de libros dentro de una comunidad, permitiendo una administración organizada y digital del proceso.

---

## 🌍 Contexto de la Aplicación

Muchas personas tienen libros que ya han leído y que podrían compartir con otros, pero no existe una forma estructurada y sencilla de gestionar estos intercambios dentro de pequeños círculos (amigos, universidades o comunidades locales).

Tradicionalmente, los préstamos de libros se realizan de manera informal, lo que puede generar:

- Pérdida de libros
- Falta de seguimiento
- Desorganización en las solicitudes
- Dificultad para saber quién tiene un libro

Este sistema busca digitalizar y organizar el proceso de intercambio, permitiendo registrar libros, gestionar solicitudes y llevar control de los préstamos de forma eficiente.

---

## 🏛️ Arquitectura

El sistema sigue una arquitectura basada en cliente-servidor:

- **Backend:** API REST desarrollada en Spring Boot (Java)
- **Frontend:** React + Vite (SPA)
- **Base de datos:** PostgreSQL
- **ORM:** JPA / Hibernate

---

## 🔗 API REST

La API REST proporciona endpoints para la gestión de:

- Usuarios
- Libros
- Solicitudes de intercambio
- Préstamos
- Reseñas

Incluye:

- Validaciones de datos
- Manejo de errores
- Estructura en capas (Controller, Service, Repository)

---

## 🧱 Modelo de Datos (Entidades)

El sistema se basa en las siguientes entidades principales:

- **User** → Usuarios del sistema
- **Book** → Libros disponibles para intercambio
- **ExchangeRequest** → Solicitudes de préstamo
- **Loan** → Registro de préstamos activos o finalizados
- **Review** → Reseñas de libros

---

## 📌 Source

El código del proyecto está alojado en un repositorio de GitHub, utilizando un flujo de trabajo basado en GitFlow para facilitar el desarrollo colaborativo.

---

## ⚡ Manejo de Repositorio

### 🌿 Ramas principales

- `main`: Contiene el código estable en producción
- `develop`: Rama de desarrollo donde se integran nuevas funcionalidades

---

### 🌱 Ramas de características

Formato:

```
feature/[contexto_proyecto]-[product-feature]
```

Donde:

- `modulo` → api/front
- `product-feature` → descripción corta en minúsculas separada por `-`

Ejemplo:

```
feature/front-user-authentication
```

---

### 🧩 Estándares de commits

Formato:

```
<tipo>: <descripción breve en presente>
```

Tipos:

- `feat` → Nueva funcionalidad
- `fix` → Corrección de errores
- `chore` → Tareas de mantenimiento

Ejemplos:

- `tipo + contexto + commit`

```
feat [api]: add user registration endpoint
fix [front]: correct loan return date validation
chore [api]: update dependencies
```
