package Projeto.Ecommerce.de.Livros.Ecommerce.de.Livros.entity;

import java.util.ArrayList;
import java.util.List;

    public class ECommerce {
        private List<Livros> livros;

        public ECommerce() {
            this.livros = new ArrayList<>();
        }

        public void adicionarLivro(Livros livro) {
            livros.add(livro);
        }

        public void listarLivros() {
            for (Livros livro : livros) {
                System.out.println(livro);
            }
        }

        public void listarLivrosDestaque() {
            for (Livros livro : livros) {
                if (livro.isDestaques()) {
                    System.out.println(livro);
                }
            }
        }

        public static void main(String[] args) {
            ECommerce ecommerce = new ECommerce();

            Livros livro1 = new Livros(1, "Machado de Assis", "Ática","O Alienista",1882, true);
            Livros livro2 = new Livros(2, "José de Alencar", "Ática", "O Guarani", 1882, false);
            Livros livro3 = new Livros(3, "Albert Camus", "Ática", " A Queda", 1882, true);

            ecommerce.adicionarLivro(livro1);
            ecommerce.adicionarLivro(livro2);
            ecommerce.adicionarLivro(livro3);

            System.out.println("Todos os livros:");
            ecommerce.listarLivros();

            System.out.println("\nLivros em destaque:");
            ecommerce.listarLivrosDestaque();
        }

}
