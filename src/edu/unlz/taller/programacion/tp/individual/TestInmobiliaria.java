package edu.unlz.taller.programacion.tp.individual;

import java.util.Collections;

public class TestInmobiliaria {

    public static void main(String[] args) throws YaExisteInmuebleException {

        Cliente cliente = new Cliente("RichardS", "1161564480", "richardsjcb@gmail.com");
        Inmueble inmueble = new Inmueble("Emilio Castro 6012", 1250, 350, true, false, cliente); // Beneficio esperado
        InmuebleTechado inmuebleTechado = new InmuebleTechado(4, true, false, "Los angeles", 120, 856, true, true, cliente); // Beneficio obtenido
        Inmobiliaria inmobiliaria = new Inmobiliaria("Los Campos", 35, 160);

        inmueble.beneficioObtenido((double) 569);

        inmobiliaria.agregarInmueble(inmueble);
        inmobiliaria.agregarInmueble(inmuebleTechado);


        inmobiliaria.imprimirDatos();

        System.out.println("\n\t*** Resultado de Beneficios ****");
        System.out.println("\nBeneficio Esperado: " + inmobiliaria.beneficioEsperado());
        System.out.println("\nBeneficio Obtenido: " + inmobiliaria.beneficioObtenido());

        inmobiliaria.eliminarInmueble(inmuebleTechado); // Se elimina un objeto


        System.out.println("\n\n**********Solo queda un objeto ------> ");
        inmobiliaria.imprimirDatos();


        /* Se agrega un nuevo objeto */
        Cliente cliente1 = new Cliente("Emilia", "1165897445", "emilia@Outlook.com");
        Inmueble inmueble1 = new Inmueble("Jose Mariano 1658", 1548, 350, true, false, cliente1);
        Inmueble inmueble2 = new Inmueble("Jose Mariano 1658", 1548, 350, true, false, cliente1);


        inmobiliaria.agregarInmueble(inmueble1);
        inmobiliaria.agregarInmueble(inmueble2);
        inmobiliaria.imprimirDatos();


        System.out.println("\n************************Se agrega nuevo inmueble");


    }

}
