var botaoAdicionar = document.querySelector("#adicionar-encomenda");
var tabela = document.querySelector("#tabela-clientes");
var mensagemErro = document.querySelector("#mensagem-erro"); // div acima do form

botaoAdicionar.addEventListener("click", function (e) {
  e.preventDefault();

  var nome = document.querySelector("#nome-form").value.trim();
  var quantidade = document.querySelector("#quantidade-form").value.trim();
  var servico = document.querySelector("#servico-form").value.trim();
  var valorUnitario = document.querySelector("#valor-form").value.trim();

  var camposVazios = [];

  if (!nome) camposVazios.push("Nome");
  if (!quantidade) camposVazios.push("Quantidade");
  if (!servico) camposVazios.push("Serviço");
  if (!valorUnitario) camposVazios.push("Valor Unitário");

  if (camposVazios.length > 0) {
    mensagemErro.textContent =
      "Preencha os seguintes campos: " + camposVazios.join(", ");
    mensagemErro.style.display = "block";
    return; // não insere na tabela
  }

  // Se chegou aqui, está tudo preenchido
  mensagemErro.textContent = ""; // limpa mensagens anteriores
  mensagemErro.style.display = "none";

  var total = quantidade * valorUnitario;

  var novaLinha = document.createElement("tr");
  novaLinha.classList.add("cliente");
  novaLinha.innerHTML = `
    <td class="nome">${nome}</td>
    <td class="servico">${servico}</td>
    <td class="qtde">${quantidade}</td>
    <td class="unitario">${formatarValor(valorUnitario)}</td>
    <td class="total">${formatarValor(total)}</td>
  `;

  tabela.appendChild(novaLinha);

  document.querySelector("#form-encomenda").reset();
});
