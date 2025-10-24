package model;


public class Usuario extends Pessoa implements Seguranca, Imprimivel {
    private String nomeusuario;
    private String senha;

    public Usuario(String nomecompleto, int idade, String nomeusuario, String senha) {
        super(nomecompleto, idade);
        this.nomeusuario = nomeusuario;
        this.senha = senha;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    @Override
    public String formatoString() {
         return "Usuario: " + nomeusuario + nlin +
                "Nome Completo : " + nomecompleto + nlin +
                "Idade : " + idade + nlin;
    }

    @Override
    public void formatoSystemOut() {
        System.out.println(formatoString());
    }

    @Override
    public boolean Validar() {
        return nomeusuario != null && !nomeusuario.isEmpty()
                && senha != null && senha.length() >= 4;
    }
}
