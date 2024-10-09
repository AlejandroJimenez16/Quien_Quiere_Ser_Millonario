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

2. ElegirPregunta (Seleccionar Pregunta)
   - **Layout:** `activity_elegir_pregunta.xml`
   - Funcionalidad:
       - Permite seleccionar entre las 4 preguntas disponibles.
       - Incluye un botón para volver al menú principal.
   - Componentes:
       - `TextView`: Texto "Elegir pregunta".
       - `ImageView1`: Logo del juego.
       - `ImageView2`: Icono para seleccionar la primera pregunta.
       - `ImageView3`: Icono para seleccionar la segunda pregunta.
       - `ImageView4`: Icono para seleccionar la tercera pregunta.
       - `ImageView5`: Icono para seleccionar la cuarta pregunta.
       - `ImageView6`: Flecha para regresar al menú principal.

3. **Pregunta1 a Pregunta4** (Preguntas)
   - **Layout:** `activity_pregunta1.xml`, `activity_pregunta2.xml`, `activity_pregunta3.xml`, `activity_pregunta4.xml`
   - Funcionalidad:
       - Cada clase representa una pregunta diferente del juego.
       - Los botones de respuestas cambian de color dependiendo si la respuesta es correcta (verde) o incorrecta (rojo).
       - Incluye una opción para regresar a la pantalla de selección de preguntas.
   - Componentes comunes:
       - `ImageView`: Logo del juego.
       - `TextView`: Texto de la pregunta.
       - 4 `Button`: Para seleccionar la respuesta.
       - `ImageView`: Flecha para regresar a la pantalla de selección.
    
### Fondo Común

- Todos los layouts comparten un fondo común que se define en el archivo bg_color.xml dentro de la carpeta drawable.

## Funcionalidades Principales

- **Selección de Preguntas:** Desde la actividad `ElegirPregunta`, el jugador puede seleccionar entre 4 preguntas diferentes.
- **Validación de Respuestas:** Al seleccionar una respuesta, los botones cambian de color: verde para la correcta, rojo para las incorrectas.
- **Navegación Simple:** Incluye flechas de navegación para regresar al menú principal o elegir una nueva pregunta.
- **Orientación Horizontal:** La aplicación está diseñada para ejecutarse en modo horizontal de manera predeterminada.

## Cómo Ejecutar el Proyecto

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/AlejandroJimenez16/Quien_Quiere_Ser_Millonario.git
2. Abrir el proyecto en Android Studio.
3. Compilar y ejecutar la aplicación en un emulador o dispositivo físico en modo horizontal.

## Capturas de Pantalla
![image](https://github.com/user-attachments/assets/58b9f90d-be5b-4316-be36-9bc1ea81f905)
![image](https://github.com/user-attachments/assets/cd8bdf20-f7db-453b-8f91-0c5ad172211a)
![image](https://github.com/user-attachments/assets/4fe63bb7-dc03-431f-86de-5b687c198809)

## Futuras Mejoras

Algunas posibles mejoras para el futuro incluyen:

- Agregar más preguntas para hacer el juego más interesante.
- Incluir un sistema de puntajes o niveles.
- Implementar ayudas al estilo del programa original, como el comodín del 50:50 o llamar a un amigo.








