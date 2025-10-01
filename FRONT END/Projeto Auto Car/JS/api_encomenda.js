// Seleciona o botão que vai disparar a requisição para a API
var botaoAPI = document.querySelector("#api-encomenda");

// Adiciona um evento de clique ao botão
botaoAPI.addEventListener("click", function(){

    // Cria um objeto XMLHttpRequest para fazer requisições HTTP
    var api = new XMLHttpRequest();

    // Configura a requisição: método GET e a URL da API local
    api.open("GET", "http://localhost:3000/encomendas_web");

    // Adiciona um evento para quando a resposta da API for carregada
    api.addEventListener("load", function(){

        // Converte o texto JSON da resposta em um objeto JavaScript
        var resposta = JSON.parse(api.responseText);

        // Percorre cada objeto de encomenda retornado pela API
        resposta.forEach(function(encomendaAPI) {
            
            // Para cada encomenda, chama a função que adiciona na tabela
            adicionaEncomendaTabela(encomendaAPI);
        });
    })

    // Envia a requisição para o servidor
    api.send();
})