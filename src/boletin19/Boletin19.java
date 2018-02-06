package boletin19;

import com.alberto.libreria.*;
import javax.swing.JOptionPane;

public class Boletin19 {

    public static void main(String[] args) {
        boolean exit=true;
        Metodos obx=new Metodos();
        obx.cargar();

        int opcion=6;

        // Bucle para trabajar con la app
        do {
            /*
            Try para que no deje de funcionar cuando pulse cancelar en el JOptionPane y cierre la app
             */
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("Opciones:\n "
                        +"1) Engadir libros\n "
                        +"2) Vender libros\n"
                        +"3) Amosar os libros\n"
                        +"4) Dar de baixa un libro\n"
                        +"5) Consulta libro\n"
                        +"6) Salir"));

                switch (opcion) {
                    case 1:
                        obx.engadirLibro(new Libro(
                        JOptionPane.showInputDialog("Titulos"),
                        JOptionPane.showInputDialog("Autor"),
                        JOptionPane.showInputDialog("ISBN"),
                        Float.parseFloat(JOptionPane.showInputDialog("Prezo")),
                        Integer.parseInt(JOptionPane.showInputDialog("Unidades"))
                        ));
                        break;
                    case 2:
                        obx.venderLibro(JOptionPane.showInputDialog("Introduzca referencia"));
                        break;
                    case 3:
                        obx.amosar();
                        break;

                    case 4:
                        obx.darBaixa();
                        break;
                    case 5:
                        System.out.println(obx.consultaLibro(JOptionPane.showInputDialog("Referencia del libro")));
                          break;
                    case 6:

                        exit=false;
                        break;

                }
            } catch (NumberFormatException excepcion) {
                System.out.println("Aplicación cerrada");
                exit=false;
            }

        } while (exit==true);
    }
}


