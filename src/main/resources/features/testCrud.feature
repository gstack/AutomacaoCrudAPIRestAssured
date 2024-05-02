#language: pt
Funcionalidade: Testar Crud de API

    @testCrud
    Cenário:
      Dado que envio request
      Quando envio request Get all elements
      Então verifico se recebo a lista dos filmes

    Cenário:
      Dado que envio request
      Quando envio request para determinado filme via Get_Id
      Então verifico se recebo as informações desse filme

    Cenário:
      Dado que envio request
      Quando envio post request para criar novo filme
      Então verifico se o filme foi criado

    Cenário:
      Dado que envio request
      Quando envio put request para atualizar o novo filme
      Então verifico se o filme foi totalmente atualizado

    Cenário:
      Dado que envio request
      Quando envio patch request para atualizar o novo filme
      Então verifico se o filme foi atualizado

    Cenário:
      Dado que envio request
      Quando envio delete request para criar novo filme
      Então verifico se o filme foi deletado

