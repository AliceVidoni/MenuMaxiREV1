package com.example.menmaxi.entita;

public class Ingrediente {

    String nome;
    String categoria;
    boolean rimozione;
    boolean aggiunta;
    double sovrapprezzo;

    public Ingrediente() {
    }

    public Ingrediente(String nome, String categoria, boolean rimozione, boolean aggiunta, double sovrapprezzo) {
        this.nome = nome;
        this.categoria = categoria;
        this.rimozione = rimozione;
        this.aggiunta = aggiunta;
        this.sovrapprezzo = sovrapprezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isRimozione() {
        return rimozione;
    }

    public void setRimozione(boolean rimozione) {
        this.rimozione = rimozione;
    }

    public boolean isAggiunta() {
        return aggiunta;
    }

    public void setAggiunta(boolean aggiunta) {
        this.aggiunta = aggiunta;
    }

    public double getSovrapprezzo() {
        return sovrapprezzo;
    }

    public void setSovrapprezzo(double sovrapprezzo) {
        this.sovrapprezzo = sovrapprezzo;
    }
}
