import farmacia.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Medicamento aspirina = new Medicamento("Aspirina", "Bayer", 1500.0);
        Medicamento aspirina2 = new Medicamento("Aspirineta", "Bayer", 1200.0);
        Medicamento paracetamol = new Medicamento("Paracetamol", "Reuters", 100.0);
        Medicamento ibuprofeno = new Medicamento("Ibuprofeno", "Bayer", 200.0);
        Medicamento cafeina = new Medicamento("Cafeina", "Reuters", 1400.0);

        Farmacia delCentro = new Farmacia();
        delCentro.addMedicamento(aspirina);
        delCentro.addMedicamento(aspirina2);
        delCentro.addMedicamento(paracetamol);
        delCentro.addMedicamento(ibuprofeno);
        delCentro.addMedicamento(cafeina);

        /*ArrayList<Medicamento> losDeBayer = delCentro.buscarXLaboratorio("Bayer");
        System.out.println(losDeBayer);

        System.out.println("\nLos que contienen 'ina'");
        ArrayList<Medicamento> losIna = delCentro.buscarXNombre("ina");
        System.out.println(losIna);

        System.out.println("\nLos que cuestan menos de 1000");
        ArrayList<Medicamento> menosDe1000 = delCentro.buscarXPrecio(1000.0);
        System.out.println(menosDe1000);*/


        System.out.println("\nLos de Bayer");
        ArrayList<Medicamento> losBayer = delCentro.buscar(new CondicionLaboratorio("bayer"));
        System.out.println(losBayer);

        System.out.println("\nLos que contienen 'ina'");
        ArrayList<Medicamento> losIna = delCentro.buscar(new CondicionNombre("ina"));
        System.out.println(losIna);

        System.out.println("\nLos que cuestan menos de 1000");
        Condicion menos1000 = new CondicionPrecio(1000.0);
        ArrayList<Medicamento> menosDe1000 = delCentro.buscar(menos1000);
        System.out.println(menosDe1000);

        System.out.println("\nLos de Bayer");
        ArrayList<Medicamento> resultado = delCentro.buscar(
                new CondicionAND(new CondicionNombre("ina"),
                    new CondicionNOT(
                            new CondicionLaboratorio("bayer")
                    )
                )
        );
        System.out.println(resultado);
    }
}