package org.example;

import java.util.ArrayList;
import java.util.List;

public class LivroStorage {
    private static List<Livro> livros = new ArrayList<>();

    public static List<Livro> getAllLivro() {
        return livros;
    }

    public static Livro getLivroById(String id) {
        for (Livro livro : livros) {
            if (livro.getId().equals(id)) {
                return livro;
            }
        }
        return null;
    }

    public static void addLivro(Livro livro) {
        livros.add(livro);
    }

    public static void updateLivro(String id, Livro updatedLivro) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getId().equals(id)) {
                livros.set(i, updatedLivro);
                return;
            }
        }
    }

    public static void deleteLivro(String id) {
        livros.removeIf(livro -> livro.getId().equals(id));
    }
    private static boolean isValidLivro(Livro livro) {
        return livro != null && livro.getTitulo() != null && !livro.getTitulo().isEmpty()
                && livro.getAutor() != null && !livro.getAutor().isEmpty();
    }
}
