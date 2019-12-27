package com.example.menmaxi.entita;

public class Piatto {

    String nome;
    String foto;
    double prezzo;
    int categoria;

    public Piatto() {
    }

    public Piatto(String nome, String foto, double prezzo, int categoria) {
        this.nome = nome;
        this.foto = foto;
        this.prezzo = prezzo;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
