# ¿Quién quiere ser millonario? - Android App

Este proyecto es una implementación simplificada del famoso programa de televisión "¿Quién quiere ser millonario?". Esta creado en AndroidStudio y fue una practica realizada en DAM. En esta versión, los jugadores responden a preguntas de opción múltiple, seleccionando entre cuatro posibles respuestas. La aplicación proporciona retroalimentación visual instantánea: la respuesta correcta se resalta en verde y las incorrectas en rojo.

## Descripción

La aplicación es una versión reducida del juego con las siguientes características principales:

- Se presentan preguntas de opción múltiple (4 posibles respuestas).
- Al seleccionar una respuesta, se muestra si es correcta o incorrecta.
- La aplicación incluye 6 actividades y 6 diseños (layouts).
- La interfaz está diseñada para ejecutarse en orientación horizontal.

## Estructura del Proyecto

El proyecto contiene las siguientes actividades y diseños:

### Actividades y Layouts

1. MainActivity (Inicio)
   - **Layout:** `activity_main.xml`
   - Funcionalidad:
       - Actúa como pantalla de inicio del juego.
       - Contiene un botón que permite comenzar el juego, llevando a la actividad `ElegirPregunta`.
   - Componentes:
       - `ImageView`: Logo del programa.
       - `TextView`: Mensaje de bienvenida.
       - `Button`: Para iniciar el juego.
