package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

    private List<Livro> livrosList;

    public CatalogoLivro() {
        this.livrosList = new ArrayList<Livro>();
    }
    public void adicionarLivro(String titulo, String autor, int anoDePublicacao) {
        livrosList.add(new Livro(titulo, autor, anoDePublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloDeAno(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal) {
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {

        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("Livro1","Autor1", 2020);
        catalogoLivro.adicionarLivro("Livro1","Autor2", 2021);
        catalogoLivro.adicionarLivro("Livro3","Autor2", 2022);
        catalogoLivro.adicionarLivro("Livro2","Autor3", 2023);
        catalogoLivro.adicionarLivro("Livro4","Autor4", 1994);

        System.out.println(catalogoLivro.pesquisarPorAutor("Autor4"));

        System.out.println(catalogoLivro.pesquisarPorIntervaloDeAno(2020, 2022));

        System.out.println(catalogoLivro.pesquisarPorTitulo("Livro1"));
    }
}
