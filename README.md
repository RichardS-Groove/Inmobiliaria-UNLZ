Inmobiliaria - Uiversidad Lomas de Zamora - Project of Class Java
===================

En la presente versión se agrega el cambio de funcionalidades en los metodos. 



El proyecto está basado en una inmobiliaria que necesita actualizar su programaba de gestión, en el cual solo realiza acciones básicas. 
Lo que pide el usuario es poder usar el programa con un sistema de cálculos de comisiones para los consultores y poder llenar en el programa los precios y descuentos de los inmuebles. 
Así mismo poder almacenar datos de los clientes y que tipos de inmuebles son los que más consultan.

> **Update - version 1.0:**

> - Constructores para todas las clases acordes a la solución pedida.
> - Métodos equals y hashcode para cliente e inmueble.
> - BeneficioEsperado por cada inmueble calcular sumatoria de inmuebles: precio * comisión. No incluir a los inmuebles vendidos.
> - BeneficioObtenido por cada inmueble calcular sumatoria de inmuebles: precio * comisión.
    En caso de ser InmuebleTechado y tener piscina se le sumará el 5% de lo calculado.
    En caso de ser InmuebleTechado y tener cochera se le sumará el 6% de lo calculado.
> - Crear una interfaces Imprimible que tenga método imprimirDatos() : void y sea implementada por todas las clases de este diagrama. Cuando se llame imprimirDatos de Inmobiliaria se espera que imprima sus datos, a su vez si imprima cada inmueble en particular y que cada inmueble imprima que cliente pertenece y sus datos correspondientes.
> - Clase test de prueba con main.
> - Contemplar los posibles NULL que puedan existir.


> **Update - version 2.0:**

> - Se pide reemplazar el Array de inmuebles a alguna implementación de la collection Set<Inmueble>..
> - Como la inmobiliaria piensa en un futuro tener muchos diferentes tipos de inmuebles el comportamiento beneficioObtenido debe ser polimórfico.
> - Modificar agregar inmueble para valide con el método de collection constains de que si existe el inmueble, no lo agregue y devuelva una exception creada por nosotros llamada YaExisteInmuebleException.

