public class Pessoa {
    private String nome;
    private String idade;


    public String getIdade() {
        return idade;
    }
    public String setIdade(String idade){
        this.idade = idade;
        return "idade incluida";
    }
    public String getNome() {
        return nome;
    }
    public String setNome(String nome){
        this.nome = nome;
        return "nome incluido";

    }
    public String  x_Pessoa(){
        return "nome: "+nome+" idade: "+idade;

    }
}
