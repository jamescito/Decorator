## Decorator
El patrón Decorator responde a la necesidad de añadir dinámicamente funcionalidad a un</br>  Objeto. Esto nos permite no  tener que crear sucesivas clases que hereden de la primera</br> incorporando la nueva funcionalidad, sino otras que la implementan y se asocian a la primera.

### Acontinuación explicaremos lo que es el ejercicio</br> de la practica que teniamos que realizar.

Primero explicaremos la clase cliente, en esta clase lo que se hace es crear las variables que utilizaremos</br>de tipo privado, posteriormete lo que es un constructor lleno que se llama cliente y para terminar esta</br> clase creamos los metodos obtenedores y establecedores de cada uno.


![Imangen](image/uno.png)
![Imangen](image/dos.png)

Ahora explicaremos lo que es la interface del ejercicio ya que es primordial para este patron,</br>la interfaz lo que hace en general es crear las funciones cliente y la fecha además de las funciones</br> ingresar y retirar para que puedan ser implementada por una clase


![Imangen](image/tres.png)

La clase Decorador esta clase implementa todo de la intefaz cuenta donde le</br> damos todas las funcionalidades a cada función, en pocas palabras</br>darnos las instrucciones u órdenes de que hacer es decir lo que se va realizar.

![Imangen](image/ocho.png)

La clase CuentaCorriente esta clase hereda de la clase Docorador ya que necesimatas</br> implementar el saldo, en esta clase creamos un constructor donde instanciamos</br> la cuenta, despues creamos una función de tipo string esta nos servira para crear la cuenta,</br> posteriormente una función de tipo void para lo que es aplicar los interese a una cuenta</br> en este caso a una corriente y por ultimo una función de tipo string para que nos retorne la tarjeta.

![Imangen](image/cuatro.png)

la clase cuentaGeneral esta implementa la interfaz que es cuenta donde esta genera</br> todas las funciones de ella, ademas de que creamos un constructor lleno para saber de cuanto</br> es el saldo inicial, cliente y la fecha.

![Imangen](image/cinco.png)

![Imangen](image/seis.png)

La clase fecha en esta lo primero que hacemos es declarar las variables que utilizaremos </br> luego crearemos lo que es un constructor lleno, este nos servira para dar</br> la fecha en entero, despues otro de tipo string usando la herramienta de Stringtokenizer</br> que sirve para dividir las cade en tokens es decir en pequeño fragmento, luego le decimos</br>que los divida con "/" luego declaramos las 3 variables que utilizamos y la igualamos</br>y por ultimo la convertimos a entero, despues creamos una funcion fecha esta </br> servira para que nos de la fecha en tiempo real y por ultimo creamos todos los </br>obtenedores y establecedores.

![Imangen](image/nueve.png)
![Imangen](image/diez.png)

Por ultimo la clase PruebaPtron en esta es para probar todo el ejercio</br>lo primero que hacemos es instanciar la fecha luego cliente esto sera para el</br> primer cliente que será juan ha ambas intanciaciones le pasamos los parametro</br> requerido, esto mismo hacemos para el segundo cliente.

Despues seguimos con instanciar las cuenta una para cada cliente estás</br> seran cuenta generales, despues instanciamos la cuenta corrientes</br> y le pasamos sus parametros correspondiente y por ultimo la cuenta de plazo tambien</br> con todos sus parametros y para finalizar utilizamos la instancia de decorator y llamamos a la funcuncion</br> de aplicarIntereses para compilar ya que ahi hice la funcion y el mensaje que mostrara por pantalla.



![Imangen](image/once.png)

Ahora podemos ver el resultado:

![Imangen](image/doce.png)