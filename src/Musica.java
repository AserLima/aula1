public class Musica {
    private String titulo, duracao, compositor;

    public String getTitulo(){
        return titulo;
    }
    public String setTitulo(String titulo){
        this.titulo = titulo;
        return "titulo inserido";

    }
    public String setDuracao(String duracao){
        this.duracao = duracao;
        return "duracao inserida";
    }
    public String getDuracao(){
        return duracao;
    }
    public String getCompositor(){
        return compositor;
    }
    public String setCompositor(String compositor){
        this.compositor = compositor;
        return "compositor inserido";
    }
    public void tocarMusica(){
        System.out.println("Tocando a musica: "+titulo);
    }
}
