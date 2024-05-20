package support.enums;

import support.utils.GetProperties;

public enum ApiBaseUri {
    API_LIVROS(GetProperties.getProp("baseurl")),
    API_CAT(GetProperties.getProp("baseurl")),
    API_CAT_MOCK(GetProperties.getProp("baseurlmock"));
    private String path;
    ApiBaseUri(String path){
        this.path=path;
    }
    public String getPath(){
        return path;
    }
}
