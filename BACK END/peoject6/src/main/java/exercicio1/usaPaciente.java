package exercicio1;

public class usaPaciente {
    public static void main(String[] args) {
          Paciente p1 = new Paciente();
          p1.setNome("Carolina Alves da Silva");
          p1.setRg("12.345.678-9");
          p1.setEndereco("Rua das Acácias, 142 — Apto 23, Jardim das Flores, Campinas — SP");
          p1.setTelefone("+55 (19) 99876-5432");
          p1.setDataNascimento("14/03/1990");
          p1.setProfissao("Desenvolvedora Front End");
          p1.imprimirDados();

          Paciente p2 = new Paciente("Marcelo Henrique Torres","23.456.789-0","Travessa São João, 45 — Bloco B, Bairro das Pedras, Belo Horizonte — MG","+55 (31) 99722-3344","02/11/1983","Desenvolvedor Back End");
          p2.imprimirDados();
    }
}
