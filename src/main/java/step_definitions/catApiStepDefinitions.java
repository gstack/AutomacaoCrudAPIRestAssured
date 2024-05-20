package step_definitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import service.catApiService;

public class catApiStepDefinitions {
    private static String Response;

    @Dado("que envio request")
    public void que_envio_request() {}

    @Quando("envio post catApi")
    public static String envio_post_cat_api() {
        catApiService.enviarPostCat();
        return Response;
    }

    @Então("verifico se gato foi criado")
    public void verifico_se_gato_foi_criado() {
        catApiService.validarResponseCatApi();
    }

    @Quando("envio get catApi")
    public static String envio_get_cat_api() {
        catApiService.enviarGetAllCats();
        return Response;
    }

    @Então("verifico se retornou a lista de gatos")
    public void verifico_se_retornou_a_lista_de_gatos() {
        catApiService.validarResponseCatGetAllApi();
    }

    @Quando("envio get por id especifico na catApi")
    public static String envio_get_por_id_especifico_na_cat_api() {
        Response = catApiService.enviarGetIdCats();
        return Response;
    }

    @Então("verifico se retornou a lista com o id do registro especifico de gatos")
    public static void verifico_se_retornou_a_lista_com_o_id_do_registro_especifico_de_gatos() {
        catApiService.validarRetornoCatEspecifico();
    }

    @Quando("envio delete por id especifico na catApi")
    public static String envio_delete_por_id_especifico_na_cat_api() {
        catApiService.enviardelete();
        return Response;
    }

    @Então("verifico se o registro foi deletado conforme esperado")
    public static void verifico_se_o_registro_foi_deletado_conforme_esperado() {
        catApiService.validarDeleteCatApi();

    }

    @Quando("envio put por id especifico na catApi")
    public static String envio_put_por_id_especifico_na_cat_api() {
        catApiService.enviarPut();
        return Response;
    }

    @Então("verifico se o registro foi atualizado conforme esperado")
    public void verifico_se_o_registro_foi_atualizado_conforme_esperado() {
        catApiService.validarResponseCatPutApi();

    }

}
