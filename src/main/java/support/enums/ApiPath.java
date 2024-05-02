package support.enums;

public enum ApiPath {
    PATH_FILME("/filmes"),
    PATH_FIRST_FILME("/filme/1"),
    PATH_POST_FILME("/salvar"),

    PATH_PUT_FILME("/filme/"),

    PATH_PATCH_FILME("/filme/"),

    PATH_DELETE_FILME("/filme/4");
    private String path;
    ApiPath(String path){
        this.path=path;
    }
    public String getPath(){
        return path;
    }
}
