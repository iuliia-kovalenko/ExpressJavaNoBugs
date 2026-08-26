package practice_7.user_monitor;

import java.util.HashSet;

public class UserMonitor {
    // store unique sessions
    // access to these sessions
    // add session

    private HashSet<String> sessions;

    public UserMonitor() {
        this.sessions = new HashSet<>();
    }

    public void addNewSession(String session) {
        sessions.add(session);
    }

    public HashSet<String> getSessions() {
        return sessions;
    }

    public void printSessions() {
        System.out.println("All sessions: ");
        sessions.forEach(System.out::println);
    }

    public static void main(String[] args) {
        UserMonitor monitor = new UserMonitor();
        monitor.addNewSession("Session_1");
        monitor.addNewSession("Session_2");
        monitor.addNewSession("Session_3");
        monitor.addNewSession("Session_4");
        monitor.addNewSession("Session_5");
        monitor.addNewSession("Session_5");
        monitor.addNewSession("Session_5");
        monitor.addNewSession("Session_5");
        monitor.printSessions();

    }
}
