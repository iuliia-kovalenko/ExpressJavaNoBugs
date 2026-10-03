package practice_10.lecture;

public class VisibilityProblem {
    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    public void run() {
        while(running) {}
        System.out.println("Thread ended");
    }
}

class VisibilityExample {
    public static void main(String[] args) throws InterruptedException {
        VisibilityProblem problem = new VisibilityProblem();
        Thread thread = new Thread(problem::run);
        thread.start();

        Thread.sleep(1000);
        problem.stop();

    }
}
