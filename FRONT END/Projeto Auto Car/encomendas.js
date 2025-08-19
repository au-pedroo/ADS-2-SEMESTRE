// Linha comentada: Exemplo de como seria feito diretamente sem validação
// document.querySelector(".total").textContent =
// document.querySelector(".qtde").textContent *
// document.querySelector(".unitario").textContent

// Captura todos os elementos com a classe "cliente", ou seja, cada linha/encomenda da tabela
var clientes = document.querySelectorAll(".cliente");

// Percorre todas as encomendas da tabela
for (var count = 0; count < clientes.length; count++) {

    // ---------------- PRIMEIRA FORMA DE FAZER ----------------
    // Código comentado: calculava diretamente o total sem validações
    /*
    clientes[count].querySelector(".total").textContent = 
        clientes[count].querySelector(".qtde").textContent *
        clientes[count].querySelector(".unitario").textContent
    */

    // ---------------- SEGUNDA FORMA DE FAZER ----------------

    // Obtém o conteúdo de texto da quantidade da encomenda atual
    var tab_qtd = clientes[count].querySelector(".qtde").textContent;

    // Obtém o conteúdo de texto do valor unitário da encomenda atual
    var tab_unitario = clientes[count].querySelector(".unitario").textContent;

    // Verifica se a quantidade é inválida (menor que 1 ou não é um número)
    if (tab_qtd < 1 || isNaN(tab_qtd)) {
        // Exibe mensagem de erro na quantidade
        clientes[count].querySelector(".qtde").textContent = "Quantidade Invalida!!";
        
        // Altera a cor do texto da quantidade para branco
        clientes[count].querySelector(".qtde").style.color = "white";
        
        // Altera a cor de fundo da linha da tabela para vermelho (indicando erro)
        clientes[count].style.backgroundColor = "red";

    // Se a quantidade for válida, verifica se o valor unitário é inválido
    } else if (tab_unitario < 1 || isNaN(tab_unitario)) {
        // Exibe mensagem de erro no valor unitário
        clientes[count].querySelector(".unitario").textContent = "Quantidade Invalida!!";
        
        // Altera a cor do texto do unitário para vermelho
        clientes[count].querySelector(".unitario").style.color = "red";
        
        // Altera a cor de fundo da linha da tabela para branco
        clientes[count].style.backgroundColor = "white";
    }

    // Se quantidade e valor unitário forem válidos...
    else {
        // Calcula o total e exibe no campo correspondente
        clientes[count].querySelector(".total").textContent = calculaTotal(tab_qtd, tab_unitario);

        //Envia Formatação Para o valor Unitario
        clientes[count].querySelector(".unitario").textContent = formatarValor((parseFloat)(tab_unitario));
    }
}

// ---------------- TERCEIRA FORMA DE FAZER (usando forEach) ----------------
// Comentado como alternativa moderna usando forEach
/*
clientes.forEach((cliente) => {
    // Converte a quantidade para número decimal
    const quantidade = parseFloat(cliente.querySelector(".qtde").textContent);
    
    // Converte o unitário para número decimal
    const unitario = parseFloat(cliente.querySelector(".unitario").textContent);
    
    // Calcula o total
    const total = quantidade * unitario;
    
    // Define o total formatado com 2 casas decimais
    cliente.querySelector(".total").textContent = total.toFixed(2);
});
*/

// ---------------- FUNÇÃO PARA CALCULAR O TOTAL ----------------
// Recebe quantidade e valor unitário e retorna o total
function calculaTotal(qtde, unitario) {
    var total = 0;

    total = qtde * unitario;

    return formatarValor(total);
}

// Função que formata os valores em R$
function formatarValor(valor){
    var valor_formatado = valor.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' });
    return valor_formatado;
}

