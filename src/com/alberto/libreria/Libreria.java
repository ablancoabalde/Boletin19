package com.alberto.libreria;

import java.util.ArrayList;
// título , autor , ISBN (String ) , prezo , e numero de unidades.

public class Libreria {

    ArrayList<Libro> lLibros=new ArrayList<Libro>();
    Libro libro1=new Libro("El señor de los anillos", "J.R.R Tolkien", "L0001", 14.5f, 5);
    Libro libro2=new Libro("La torre oscura", "Stephen King", "L0002", 12.3f, 7);
    Libro libro3=new Libro("La Mascarada de la Muerte Roja I", "Robert Weinberg ,", "L0003", 8.67f, 4);
    Libro libro4=new Libro("El Perfume", "Patrick Süskind", "L0004", 9f, 1);
    Libro libro5=new Libro("Dracula", "Bram Stoker", "L0005", 11f, 10);
    Libro libro6=new Libro("Eldest", "Christopher Paolini", "L0006", 10.2f, 2);

    public void cargarLibros() {
        lLibros.add(libro1);
        lLibros.add(libro2);
        lLibros.add(libro3);
        lLibros.add(libro4);
        lLibros.add(libro5);
        lLibros.add(libro6);
    }
    
    public ArrayList<Libro> exporLibreria(){
        return this.lLibros;
    }
            
}
