package support.enums;

public enum ApiPath {
    PATH_FILME("/filmes"),
    PATH_FIRST_FILME("/filme/1"),
    PATH_POST_FILME("/salvar"),

    PATH_PUT_FILME("/filme/"),

    PATH_PATCH_FILME("/filme/"),

    PATH_DELETE_FILME("/filme/4"),
    PATH_API_CAT("/v1/votes"),
    PATH_API_CAT_GETID("/v1/votes/"),
    PATH_CAT_STUB("/catsficticios/");
    private String path;
    ApiPath(String path){
        this.path=path;
    }
    public String getPath(){
        return path;
    }
}
