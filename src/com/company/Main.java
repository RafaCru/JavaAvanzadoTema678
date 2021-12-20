package com.company;

import java.util.Random;

/*
*
* Identifica las características principales de los patrones de diseño más conocidos,
* indica para qué valen y un caso de uso para cada uno de ellos.
* Crea una pequeña aplicación implementando el patrón Singlenton y demuestra que, efectivamente,
* no crea instancias nuevas. Puedes tomar la sesión 7 como referencia.
*
*/
public class Main {

    public static void main(String[] args) {
    ClienteSingleton clienteSingleton =ClienteSingleton.getInstance();
    clienteSingleton.setCodigo(1);
    clienteSingleton.setNombre("Juan Andres Iniesta Latorre");
    clienteSingleton.setDireccion("C/ Juan Carlos I nº 35");
    clienteSingleton.setCp(44150);
    clienteSingleton.setPoblacion("Castellejon");
    clienteSingleton.setTelefono(984235697);
        System.out.println(clienteSingleton);
    ClienteSingleton clienteSingleton2 =ClienteSingleton.getInstance();
    clienteSingleton2.setCodigo(2);
    clienteSingleton2.setNombre("Antonio Juan Dura Garcia");
    clienteSingleton2.setDireccion("C/ Campos de siembra nº 66");
    clienteSingleton2.setCp(48180);
    clienteSingleton2.setPoblacion("Tarragio");
    clienteSingleton2.setTelefono(954567697);

        System.out.println(clienteSingleton);
        System.out.println(clienteSingleton2);
    }
}
