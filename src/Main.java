// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String pessoa,idade;
        Album album;
        album = new Album();
        Integer x;
        Pessoa pessoas;
        pessoas = new Pessoa();
        Musica musicas;
        musicas = new Musica();
        Scanner input = new Scanner(System.in);
        System.out.println("sistema de cadastrar albuns");

        System.out.println("cadastre pessoas");
        pessoa="";
            System.out.println("Digite um nome");

        pessoa = input.next();

        System.out.println("Digite uma idade");
        idade = input.next();
            pessoas.setNome(pessoa);
            pessoas.setIdade(idade);
        System.out.println(pessoas.x_Pessoa());

        System.out.println("digite uma musica");
        String musica = input.next();
        musicas.setTitulo(musica);
        System.out.println("digite a duracao da musica");
        String duracao = input.next();
        musicas.setDuracao(duracao);
        System.out.println("Compositor");
        String compositor = input.next();
        musicas.setCompositor(compositor);
        musicas.tocarMusica();

        System.out.println("digite um nome de album");
        String albums = input.next();
        album.setNome(albums);
        System.out.println("digite a musica");
        String musicass = input.next();
        album.setMusicas(musicass);
        System.out.println("genero");
        String genero = input.next();
        album.setGenero(genero);

        System.out.println("ano");
        String ano = input.next();
        album.setAno(ano);
        album.mostrarTodosOsDados();
                // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

    }
}