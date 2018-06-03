public class Persona{

    private String nome;
    private String sobreNome;
    private Integer idade;

    public Persona(String nome, String sobreNome, Integer idade){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSobreNome(String sobreNome){
        this.sobreNome = sobreNome;
    }

    public String getSobreNome(){
        return sobreNome;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public Integer getIdade(){
        return idade;
    }
}