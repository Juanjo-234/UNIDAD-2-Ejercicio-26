Resolución del ejercicio N°26 de la unidad 2 de programación 2.
Este programa simula un sistema de control de impresión que gestiona dispositivos de salida a través de una clase abstracta con atributos compartidos, aplicando validaciones de consumibles (tóner y tinta) para evitar fallos operativos en caliente.

Clases Utilizadas
Impresor (Clase Abstracta): Define los atributos comunes de los equipos (modelo, resolucion) y el método abstracto imprimirDocumento(String documento).
ImpresoraLaser: Extiende la clase abstracta añadiendo control del nivel porcentual de tóner y tecnología láser.
ImpresoraTinta: Extiende la clase abstracta incorporando atributos de nivel de cartucho y control de inyección de tinta.
