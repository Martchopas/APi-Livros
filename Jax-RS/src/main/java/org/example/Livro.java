package org.example;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class Livro {
    @NotNull(message = "O campo 'id' não pode ser nulo")
    private String id;
    @NotNull(message = "O campo 'titulo' não pode ser nulo")
    private String titulo;
    @NotNull(message = "O campo 'autor' não pode ser nulo")
    private String autor;
    public Livro() {
    }

    public Livro(String id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
