package boletin19;

import com.alberto.libreria.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*engadir libros
vender ( borrar ) libros
amosar  os libros que temos  ( Os libros deben estar ordenados polo campo titulo )
dar de baixa os libros con numero de unidades =0
consultar un libro determinado

Nos métodos vender, amosar, baixas e consultar debes comprobar que o array recibido non é null.
No caso contrario lanza una excepción.
 */
public class Metodos {

    Libreria obxLi = new Libreria();
    ArrayList<Libro> lLibros = new ArrayList<Libro>();

    public void cargar() {
        obxLi.cargarLibros();

        lLibros = obxLi.exporLibreria();
    }

    public void engadirLibro(Libro l) {
        lLibros.add(l);
    }

    public void venderLibro(String l) {
        int vendido;
        boolean encontrado = false;
        for (int i = 0; i < lLibros.size(); i++) {
            if (lLibros.get(i).getISBN().equalsIgnoreCase(l)) {
                vendido = lLibros.get(i).getnUnidades();
                lLibros.get(i).setnUnidades(vendido - 1);
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("Libro no encontrado");
        }

    }

    public void amosar(){

        Collections.sort(lLibros);
        for (Libro elemento : lLibros) {
            System.out.println(elemento.toString());
        }
        System.out.println("\n\n\n");
    }

    public void darBaixa() {

        Iterator<Libro> it = lLibros.iterator();
        while (it.hasNext()) {
            if (it.next().getnUnidades() == 0) {
                lLibros.remove(it.next());
            }
        }

    }

    public String consultaLibro(String k) {

        try {
            for(Libro elemento: lLibros){
                if(elemento.getISBN().equalsIgnoreCase(k)){
                    return elemento.toString();
                }
            }
            return "Referencia no encontrada";
        } catch (IndexOutOfBoundsException exception) {
            return "Error no encontrada la posición";

        }

    }



}
