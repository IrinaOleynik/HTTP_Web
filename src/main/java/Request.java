import org.apache.http.NameValuePair;

import java.util.List;

public class Request {
    private final String method;
    private final String path;
    private final List<String> headers;
    private final String body;
    private final List<NameValuePair> queryParams;

    public Request(String method, String path,List<NameValuePair> queryParams, List<String> headers, String body) {
        this.method = method;
        this.path = path;
        this.headers = headers;
        this.body = body;
        this.queryParams = queryParams;
    }
    public String getMethod() {
        return method;
    }
    public String getPath() {
        return path;
    }
    public List<NameValuePair> getQueryParams() {
        return queryParams;
    }
    public String getQueryParam(String name){
        for (NameValuePair param : queryParams) {
            if (param.getName().equals(name)) {
                return param.getName() + ": " + param.getValue();
            }
        }
        return null;
    }
}
