# Aspect Oriented Programming

Una alternativa para modularizar las incumbencias transversales (cross-cutting concerns).

- Dentro del módulo `aop`:
    - `mvn clean compile` y luego,
    - `mvn exec:java`

Dos conceptos fundamentales que introduce la nueva disciplina son las nociones de
joinpoints: puntos en la ejecución de un programa, definidos en función de elementos sintácticos.
pointcuts: conjuntos de joinpoints que permitirán luego especificar dónde corresponde aplicar un determinado aspecto.

Fuente: Ejemplo obtenido de la tesis de licenciatura de Altman y Cyment llamada: "SetPoint - Un enfoque semántico para
la resolución de pointcuts".