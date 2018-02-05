package boletin19;

import com.alberto.libreria.*;
import java.util.ArrayList;
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

    Libreria obxLi=new Libreria();
    ArrayList<Libro> lLibros=obxLi.exporLibreria();

    public void engadirLibro(Libro l) {
        lLibros.add(l);
    }

    public void amosar() {

    }

}
