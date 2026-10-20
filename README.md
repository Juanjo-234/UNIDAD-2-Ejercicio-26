Este programa está diseñado para modelar y gestionar el funcionamiento de diferentes tecnologías de impresión mediante el uso de herencia con clases abstractas, métodos abstractos y validaciones de consumibles (tóner y cartuchos) utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase abstracta Impresor: Establece la plantilla común y los atributos generales que comparten todos los dispositivos (como el modelo modelo y la resolución de impresión resolucion), además de declarar el método abstracto imprimirDocumento(String documento) que cada subclase debe implementar obligatoriamente.

Implementa clases concretas (ImpresoraLaser e ImpresoraTinta): Extienden la clase abstracta y añaden atributos específicos de su tecnología (como el nivel porcentual de tóner para la láser y el nivel de tinta de los cartuchos color para la de inyección), adaptando la lógica operativa a sus particularidades físicas.

Incorpora validaciones de consumibles: Añade controles lógicos previos a cada intento de impresión para verificar si el tóner o los cartuchos cuentan con suficiente nivel; si están agotados, la operación falla y se rechaza automáticamente para proteger el estado del equipo.

Ejecuta la prueba polimórfica (main): Instancia objetos de ambos tipos de impresoras, ejecuta operaciones sucesivas de impresión hasta agotar los consumibles de uno de los dispositivos, y muestra el estado detallado de los dispositivos por consola.
