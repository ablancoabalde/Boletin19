
package com.alberto.libreria;
// Cada libro de levar : título , autor , ISBN (String ) , prezo , e numero de unidades.
public class Libro {
    private String titulo,autor,ISBN;
    private float prezo;
    private int nUnidades;

    public Libro(String titulo, String autor, String ISBN, float prezo, int nUnidades) {
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
        this.prezo=prezo;
        this.nUnidades=nUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo=titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor=autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN=ISBN;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo=prezo;
    }

    public int getnUnidades() {
        return nUnidades;
    }

    public void setnUnidades(int nUnidades) {
        this.nUnidades=nUnidades;
    }

    @Override
    public String toString() {
        return "Libro{"+"titulo="+titulo+", autor="+autor+", ISBN="+ISBN+", prezo="+prezo+", nUnidades="+nUnidades+'}';
    }
    
    
    
    
}
