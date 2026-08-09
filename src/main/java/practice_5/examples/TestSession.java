package practice_5.examples;

public class TestSession {
    private String name;
    private SessionConfig config;
    private SessionStats stats;
    private SessionResult result;

    public TestSession(String name) {
        this.name = name;
        this.config = new SessionConfig();
        this.stats = new SessionStats();
       this.result = new SessionResult();
    }
}
class SessionConfig{
    private  String name;
}
class SessionStats {
    private  String name;
}

class SessionResult{
    private  String name;
}
