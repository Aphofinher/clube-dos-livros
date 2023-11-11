package model;

public class Categoria {
    private int id;
    private String categoria;

    public Categoria(int id, String categoria) {
        this.id = id;
        this.categoria = categoria;
    }

    public Categoria() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
