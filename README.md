# Resumen
Este proyecto consiste en una aplicación de consola en Java diseñada para gestionar el control de acceso o asistencia a un evento. El objetivo principal de este ejercicio es utilizar la estructura de datos asociativa HashSet para garantizar de forma nativa la unicidad de los registros, identificando e informando en tiempo real si un asistente está intentando registrarse más de una vez.

## Características
Filtro Nativo de Duplicados: Saca provecho de las propiedades matemáticas de la interfaz Set, la cual rechaza de manera automática cualquier elemento idéntico que ya resida en la colección.

Inserción y Validación Atómica: Utiliza el valor de retorno booleano del método .add() para verificar el éxito de la inserción y emitir alertas sin necesidad de realizar búsquedas previas con .contains().

Criterio de Parada Insensible a Mayúsculas: Implementa el método .equalsIgnoreCase("fin") para asegurar una salida limpia del bucle interactivo sin importar cómo escriba la palabra el usuario (FIN, Fin, fin).

Liberación de Recursos del Sistema: Incorpora la buena práctica de cerrar explícitamente el flujo del teclado (scanner.close()) al finalizar la ejecución para mitigar fugas de memoria.
