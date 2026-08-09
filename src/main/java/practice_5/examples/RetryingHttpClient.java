package practice_5.examples;

public class RetryingHttpClient {
    private HttpClient httpClient;

    public RetryingHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
    }
}
