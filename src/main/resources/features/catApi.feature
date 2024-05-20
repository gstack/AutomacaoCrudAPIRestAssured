#language: pt
Funcionalidade: Testar API dos Gatos

  @catApi
  Cenário:
    Dado que envio request
    Quando envio post catApi
    Então verifico se gato foi criado

  @catApi
  Cenário:
    Dado que envio request
    Quando envio get catApi
    Então verifico se retornou a lista de gatos

  @catApi
  Cenário:
    Dado que envio request
    Quando envio get por id especifico na catApi
    Então verifico se retornou a lista com o id do registro especifico de gatos

  @catApi
  Cenário:
    Dado que envio request
    Quando envio delete por id especifico na catApi
    Então verifico se o registro foi deletado conforme esperado

  @catApi
  Cenário:
    Dado que envio request
    Quando envio put por id especifico na catApi
    Então verifico se o registro foi atualizado conforme esperado

    #05/19/24 começamos aqui
#  @catApi
#  Cenário: Enviar POST sem corpo de requisição
#    Dado que envio request sem corpo
#    Quando envio post catApi sem corpo
#    Então verifico se a API retorna erro de requisição inválida
#
  @catApi
  Cenário: Enviar GET para um ID que não existe
    Dado que envio request
    Quando envio get por id inexistente na catApi
    Então verifico se a API retorna erro de ID não encontrado
#
#  @catApi
#  Cenário: Enviar DELETE sem especificar ID
#    Dado que envio request sem especificar ID
#    Quando envio delete na catApi sem ID
#    Então verifico se a API retorna erro de requisição inválida
#
#  @catApi
#  Cenário: Enviar PUT com corpo de requisição inválido
#    Dado que envio request com corpo inválido
#    Quando envio put por id especifico na catApi com corpo inválido
#    Então verifico se a API retorna erro de requisição inválida