package edu.unlz.taller.programacion.tp.individual;

import java.util.Collections;

public class TestInmobiliaria {

    public static void main(String[] args) throws YaExisteInmuebleException {

        Cliente cliente = new Cliente("RichardS", "1161564480", "richardsjcb@gmail.com");
        Inmueble inmueble = new Inmueble("Emilio Castro 6012", 1250, 350, true, false, cliente); // Beneficio esperado
        InmuebleTechado inmuebleTechado = new InmuebleTechado(4, true, false, "Los angeles", 120, 856, true, true, cliente); // Beneficio obtenido
        Inmobiliaria inmobiliaria = new Inmobiliaria("Los Campos", 35, 160);

        inmueble.beneficioObtenido((double) 569); // Se agrega una comisión desde el mismo objeto

        inmobiliaria.agregarInmueble(inmueble);
        inmobiliaria.agregarInmueble(inmuebleTechado);


        inmobiliaria.imprimirDatos(); // Por primera ves se imprimen los dos objetos ingresado

        inmuebleTechado.beneficioObtenido(0.15); // Se utiliza el beneficio en el obj de inmueble techado para aumentar la comisión.
        inmueble.beneficioObtenido(0.14); // Se utilza el beneficio en el obj.

        System.out.println("\n\t*** Resultado de Beneficios ****");
        System.out.println("\nBeneficio Esperado: " + inmobiliaria.beneficioEsperado());
        System.out.println("\nBeneficio Obtenido: " + inmobiliaria.beneficioObtenido());

        inmobiliaria.eliminarInmueble(inmuebleTechado); // Se procede a eliminar un objeto


        System.out.println("\n\n**********Solo queda un objeto ------> ");
        inmobiliaria.imprimirDatos(); // Por segunda ves se imprime los objetos y solo se mostrara un objeto


        /* Se agrega un nuevo objeto */
        Cliente cliente1 = new Cliente("Emilia", "1165897445", "emilia@Outlook.com");
        Inmueble inmueble1 = new Inmueble("Jose Mariano 1658", 1548, 350, true, false, cliente1);
        Inmueble inmueble2 = new Inmueble("Jose Mariano 1658", 1548, 350, true, false, cliente1);


        /**
         * En la fila 42 y 43, tenemos dos objetos iguales donde ponemos aprueba el metodo de ecepciones.
         */
        inmobiliaria.agregarInmueble(inmueble1);
        inmobiliaria.agregarInmueble(inmueble2);
        inmobiliaria.imprimirDatos(); // Imprime los objetos y ignora el error que se crea, si se repite el objeto con todos sus atributos iguales.


        System.out.println("\n************************Se agrega nuevo inmueble");


    }

}
