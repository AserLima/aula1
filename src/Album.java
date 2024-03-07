public class Album {
    private String genero, ano, nome, artistas, musicas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }


    public String getAno() {
        return ano;
    }

    public String getArtistas() {
        return artistas;
    }

    public void setArtistas(String artistas) {
        this.artistas = artistas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getMusicas() {
        return musicas;
    }

    public void setMusicas(String musicas) {
        this.musicas = musicas;
    }
    public void mostrarTodosOsDados(){
        System.out.println("nome: "+nome);
        System.out.println("genero: "+genero);
        System.out.println("ano: "+ano);
        System.out.println("artistas: "+artistas);
        System.out.println("nome"+nome);
    }
}
