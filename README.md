Examen 

📚El Aeropuerto Internacional Astor Piazolla de nuestra ciudad nos pide un sistema para
administrar su flota de aviones que diariamente presta operaciones.
De nuestro aeropuerto nos interesa conocer obviamente su nombre, su código
internacional, dirección y capacidad de operación (cantidad de aviones que pueden transitar
por sus pistas). El aeropuerto tiene diferentes hangares para administrar de manera
eficiente los diferentes tipos de avión y cada uno tiene diferentes restricciones explicadas
más adelante.
Todos los tipos de avión tiene un nombre de modelo, una marca, capacidad de combustible,
tipo de motor, cantidad de asientos (de Carga = 0)
Los tipos de avión pueden ser:
● Comercial -> tiene cantidad de azafatas
● Privado -> tiene un indicador para saber si tiene o no jacuzzi y un string con la clave
de wifi
● De Carga -> cantidad de kilos que puede administrar 
● Militar -> tiene un sistema de armas (aire-aire o aire-tierra) y cantidad de balas
Todos los aviones -> despegan, aterrizan y vuelan
Comercial y Privado -> sirven comida y dan mantas para el frio
Solo en los privados se puede ver el mundial (verdadero/falso)
Los del tipo Militar y de De Carga tiene un método para ingresar (no hay que desarrollar
más que un método que devuelva verdadero-falso)
De Carga -> descargan contenido

👉Como nuestro aeropuerto tiene una capacidad de operación (cantidad de aviones), cada
vez que agregamos un avión debemos tener en cuenta este límite. Si es superado, el avión
no podrá ingresar y lanzaremos un mensaje
👉Diseñe un método que haga despegar a todos los aviones de un determinado hangar
enviado por parámetro.


Nota: Decidi utilizar un hashMap para tener una busqueda mas eficiente . 
