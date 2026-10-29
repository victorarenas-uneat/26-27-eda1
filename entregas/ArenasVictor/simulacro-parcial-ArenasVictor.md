# 1. Análisis de implementaciones

# A. 

La B. Ya que solo referencia a una persona que ya esta creado, mientras que la A siempre crea una persona nueva.

# B. 

En el caso de la implementación A.
  -Ventajas: Permite modificar el objeto despues de insertarlo en la lista sin cambiar la lista.
  -Desventajas: Es menos eficiente y en caso de que persona tenga mas atributos no los copia.

En el caso de la implementación B.
  -Ventajas: Es más eficiente.
  -Desventajas: En caso de querer modificar una persona, solo será posible modificar el nombre interno (el atributo), la lista seguira mostrando el nombre original del objeto persona.

# C. 

En el caso de implementar la opción A, la lista almacenaría sus propias copias y no es afectada por cambios externos.
En el caso de implementar la opción B, la lista comparte las personas con el resto del programa, por lo tanto los cambios externos afectan a la lista.

# 2. Gestión de referencias.

# A. 

El nombre será Juan Manuel, ya que asi lo indica el set.Nombre que modifica el atributo Nombre.

# B.

Depende del nodo, ya que con la implementación B la lista cambia a Juan Carlos ya qeu el nodo apunta al mismo objeto qeu juan y con la implementación A no cambia ya que el nodo apunta a una copia.

# 3. Referencias y constructores.


