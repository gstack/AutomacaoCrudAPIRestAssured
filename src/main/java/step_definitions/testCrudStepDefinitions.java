//package step_definitions;
//
//import io.cucumber.java.pt.Dado;
//import io.cucumber.java.pt.Então;
//import io.cucumber.java.pt.Quando;
//import service.testCrudService;
//
//import java.io.IOException;
//
//public class testCrudStepDefinitions {
//
//    static String responseCrudApi;
//    @Dado("que envio request")
//    public void que_envio_request() {}
//    @Quando("envio request Get all elements")
//    public String envio_request_get_all_elements() {
//        responseCrudApi = testCrudService.get_All_Filmes();
//        return responseCrudApi;
//    }
//    @Então("verifico se recebo a lista dos filmes")
//    public void verifico_se_recebo_a_lista_dos_filmes() {
//        testCrudService.ValidarRetornoListaFilmes();
//    }
//
//    @Quando("envio request para determinado filme via Get_Id")
//    public String envio_request_para_determinado_filme_via_get_id() {
//        responseCrudApi = testCrudService.get_Id_Filmes();
//        return responseCrudApi;
//    }
//
//    @Então("verifico se recebo as informações desse filme")
//    public void verifico_se_recebo_as_informações_desse_filme() throws IOException {
//        testCrudService.ValidarRetornoFilmeEspecifico();
//    }
//
//    @Quando("envio post request para criar novo filme")
//    public String envio_post_request_para_criar_novo_filme() {
//        responseCrudApi = testCrudService.post_Filmes();
//        return responseCrudApi;
//    }
//    @Então("verifico se o filme foi criado")
//    public void verifico_se_o_filme_foi_criado() throws IOException {
//        testCrudService.ValidarRetornoFilmecriado();
//    }
//
//    @Quando("envio delete request para criar novo filme")
//    public String envio_delete_request_para_criar_novo_filme() {
//        responseCrudApi = testCrudService.delete_filme();
//        return responseCrudApi;
//    }
//    @Então("verifico se o filme foi deletado")
//    public void verifico_se_o_filme_foi_deletado() {
//    testCrudService.ValidarStatusCodeFilmeDeletado();
//    }
//
//    @Quando("envio patch request para atualizar o novo filme")
//    public String envio_patch_request_para_atualizar_o_novo_filme() {
//        responseCrudApi = testCrudService.patch_Filme();
//        return responseCrudApi;
//    }
//
//    @Então("verifico se o filme foi atualizado")
//    public void verifico_se_o_filme_foi_atualizado() {
//        testCrudService.ValidarRetornoFilmePAtch();
//    }
//
//    @Quando("envio put request para atualizar o novo filme")
//    public String envio_put_request_para_atualizar_o_novo_filme() {
//        responseCrudApi = testCrudService.put_filmes();
//        return responseCrudApi;
//    }
//    @Então("verifico se o filme foi totalmente atualizado")
//    public void verifico_se_o_filme_foi_totalmente_atualizado() {
//        testCrudService.ValidarFilmeAtualizadoPut();
//    }
//
//}
