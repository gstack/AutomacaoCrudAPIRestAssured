# AutomacaoCrudAPIRestAssured

Este repositório contém um projeto de automação de API utilizando Rest Assured e o padrão Page Object, visando facilitar a manutenção e escalabilidade dos testes de API.

![Gstack_Integration_Tests](https://github.com/gstack/AutomacaoCrudAPIRestAssured/assets/14953996/0c2074c6-e196-4059-b040-aca852974bfa)

## Organização e Dinâmica do Projeto

O projeto é estruturado com base nos princípios SOLID, buscando ser escalável e de fácil distribuição. A seguir, apresentamos os passos sugeridos para implementar e expandir o projeto:

### Passo 1: Criar um arquivo ".feature"

- Nomeie o arquivo conforme a funcionalidade que deseja testar, por exemplo: `seuArquivo.feature`.
- Configure o idioma a ser utilizado, neste caso, Português Brasil (pt-BR).
- Utilize a sintaxe [Gherkin](https://cucumber.io/docs/gherkin/) para descrever a funcionalidade.

![SeuArquivo feature](https://github.com/gstack/AutomacaoCrudAPIRestAssured/assets/14953996/d8884d34-adf0-45e4-8d75-3612608276d8)

### Passo 2: Criar a classe Step Definitions

- Crie uma classe com o mesmo nome do arquivo `.feature`, seguido de `StepDefinitions`, por exemplo: `seuArquivoStepDefinitions.class`.
- Insira os métodos gerados ao executar o arquivo `.feature` nesta classe.

![SeuArquivoStepDefinitions class](https://github.com/gstack/AutomacaoCrudAPIRestAssured/assets/14953996/82c4656b-62bd-4bda-b751-199d559f3a75)

### Passo 3: Criar a classe de Serviço

- Crie uma classe de serviço com o mesmo nome do arquivo, por exemplo: `seuArquivoService.class`.
- Implemente os métodos de teste utilizando a classe `RestContext.class`, que fornece acesso a outras classes e enums do projeto.

![SeuArquivoService class](https://github.com/gstack/AutomacaoCrudAPIRestAssured/assets/14953996/b375083a-8843-4624-9d1e-1dbb87f6a93d)
![SeuArquivoService2 class](https://github.com/gstack/AutomacaoCrudAPIRestAssured/assets/14953996/eff2a313-d801-4843-836e-b8cb7c831096)

### Resumo

A dinâmica do projeto consiste em seguir os passos acima, criando classes auxiliares ou enums conforme necessário, mantendo o princípio de responsabilidade única por classe e aderindo à orientação a objetos.

## Contribuindo

Contribuições são sempre bem-vindas! Por favor, pode enviar seu arquivo e sugiro utilizar um arquivo noemado CONTRIBUTING.md dentro de sua branch - indico criar uma branch para submeter melhorias para o projeto.

## Licença

Este projeto é uma contribuição livre para todo e qualquer QA que deseje utiza-lo! Encorajo-os fortemente a testarem seus conhecimentos em Orientação a Objetos exemplificada no padrão de Projetos Page Object Model.
