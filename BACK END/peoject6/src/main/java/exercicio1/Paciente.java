package exercicio1;

public class Paciente {
    String nome;
    String rg;
    String endereco;
    String telefone;
    String dataNascimento;
    String profissao;


    public Paciente() {
    }

    public Paciente(String nome, String rg, String endereco, String telefone, String dataNascimento, String profissao){
         this.setNome(nome);
         this.setRg(rg);
         this.setEndereco(endereco);
         this.setTelefone(telefone);
         this.setDataNascimento(dataNascimento);
         this.setProfissao(profissao);
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void imprimirDados(){
        System.out.println("Nome : " + this.nome);
        System.out.println("RG : " + this.rg);
        System.out.println("Endereço : " + this.endereco);
        System.out.println("Telefone : " + this.telefone);
        System.out.println("Nascimento : " + this.dataNascimento);
        System.out.println("Profissão : " + this.profissao);


    }
}
