package modelo;

public class Ronda {
    int id;
    String numero;
    
   
    public Ronda() {
    }

    public Ronda(int id, String numero) {
        this.id = id;
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    



}