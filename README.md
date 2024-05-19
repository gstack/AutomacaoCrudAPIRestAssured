# AutomacaoCrudAPIRestAssured
Repositório do projeto de Automação de API utilizando Rest Assured e Padrão Page Object
![Gstack_Integration_Tests](https://github.com/gstack/AutomacaoCrudAPIRestAssured/assets/14953996/0c2074c6-e196-4059-b040-aca852974bfa)
# Organização e dinâmica sugerida para implementar o projeto
Este projeto busca ser escalável, distribuído e utiliza princípios de SOLID. Para nortear o QA que pretende usar o arquetype, seguem-se os passos:
 * Criar um arquivo ".feature" - exemplo: seuArquivo.feature e configurar o idioma a ser utilizado. Aqui em nosso exemplo Portugues Br;
 * Escrever na feature a funcionalidade no formato [Gherkin]([url](https://cucumber.io/docs/gherkin/)), e rodar a feature que criará os nomes dos métodos conforme informados pelo usuário;
<img width="950" alt="SeuArquivo feature" src="https://github.com/gstack/AutomacaoCrudAPIRestAssured/assets/14953996/d8884d34-adf0-45e4-8d75-3612608276d8">

 * Criar uma classe com o mesmo nome do arquivo - exemplo, seuArquivoStepDefinitions.class;
 * Colar os Métodos informados ao rodar a feature e colar na classe seuArquivoStepDefinitions.class;
<img width="950" alt="SeuArquivoStepDefinitions class" src="https://github.com/gstack/AutomacaoCrudAPIRestAssured/assets/14953996/82c4656b-62bd-4bda-b751-199d559f3a75">

 * Criar uma classe com o mesmo nome do arquivo - exemplo, seuArquivoService.class;
 * Escrever os métodos com auxílio da classes RestContext.class que acessa outras classes e enums em vários pacotes, na sua classe seuArquivoService.class;
 <img width="950" alt="SeuArquivoService class" src="https://github.com/gstack/AutomacaoCrudAPIRestAssured/assets/14953996/b375083a-8843-4624-9d1e-1dbb87f6a93d">
 <img width="950" alt="SeuArquivoService2 class" src="https://github.com/gstack/AutomacaoCrudAPIRestAssured/assets/14953996/eff2a313-d801-4843-836e-b8cb7c831096">

 A dinâmica, em resumo é esta. Seguir esses passos e criar classes auxiliares ou enums se necessário, resguardando o princípio de responsabilidade única por classe, e orientação a objetos por conseguinte.
