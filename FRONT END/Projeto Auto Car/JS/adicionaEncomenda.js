// Seleciona o botão de adicionar encomenda
var botaoAdicionar = document.querySelector("#adicionar-encomenda");
// Seleciona a tabela onde as encomendas serão inseridas
var tabela = document.querySelector("#tabela-clientes");
// Seleciona a div usada para exibir mensagens de erro
var mensagemErro = document.querySelector("#mensagem-erro"); // div acima do form

// Adiciona um ouvinte de evento de clique ao botão
botaoAdicionar.addEventListener("click", function (e) {
  e.preventDefault(); // Impede o envio do formulário e o recarregamento da página

  // Captura e limpa os valores dos campos do formulário
  var nome = document.querySelector("#nome-form").value.trim();
  var quantidade = document.querySelector("#quantidade-form").value.trim();
  var servico = document.querySelector("#servico-form").value.trim();
  var valorUnitario = document.querySelector("#valor-form").value.trim();

  // Array para guardar os campos que não foram preenchidos
  var camposVazios = [];

  // Verifica cada campo e adiciona o nome do campo vazio no array
  if (!nome) camposVazios.push("Nome");
  if (!quantidade) camposVazios.push("Quantidade");
  if (!servico) camposVazios.push("Serviço");
  if (!valorUnitario) camposVazios.push("Valor Unitário");

  // Se houver campos vazios, mostra mensagem de erro e interrompe a execução
  if (camposVazios.length > 0) {
    mensagemErro.textContent =
      "Preencha os seguintes campos: " + camposVazios.join(", ");
    mensagemErro.style.display = "block"; // exibe a div de erro
    return; // sai da função, não adiciona nada na tabela
  }

  // Caso todos os campos estejam preenchidos, limpa mensagens de erro anteriores
  mensagemErro.textContent = "";
  mensagemErro.style.display = "none";

  // Calcula o valor total da encomenda
  var total = quantidade * valorUnitario;

  // Cria uma nova linha da tabela (<tr>)
  var novaLinha = document.createElement("tr");
  novaLinha.classList.add("cliente"); // adiciona a classe "cliente" à linha

  // Define as células da linha com os dados capturados e formatados
  novaLinha.innerHTML = `
    <td class="nome">${nome}</td>
    <td class="servico">${servico}</td>
    <td class="qtde">${quantidade}</td>
    <td class="unitario">${formatarValor(valorUnitario)}</td>
    <td class="total">${formatarValor(total)}</td>
  `;

  // Adiciona a nova linha no final da tabela
  tabela.appendChild(novaLinha);

  // Limpa o formulário para nova entrada
  document.querySelector("#form-encomenda").reset();
});

//Função para adicionare nova encomenda na tabela
function adicionarEncomendaTabela(dadosEncomenda){
  //Captura a tabela de encomendas
  var tabela = document.querySelector("#tabela-clientes");
  //Insere a nova encomenda na tabela
  tabela.appendChild(montaTR(dadosEncomenda));
}