package practice_7.hw_edditional_tasks;

import java.util.HashSet;

public class PageMonitor {
    private HashSet<String> urls;
    private int totalCount = 0;

    public PageMonitor() {
        this.urls = new HashSet<>();
    }

    public void addUrl(String url) {
        urls.add(url);
        totalCount += 1;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getUniqueCount() {
        return urls.size();
    }

    public static void main(String[] args) {
        PageMonitor pageMonitor = new PageMonitor();
        pageMonitor.addUrl("first");
        pageMonitor.addUrl("second");
        pageMonitor.addUrl("third");
        pageMonitor.addUrl("fourth");
        pageMonitor.addUrl("fourth");
        pageMonitor.addUrl("fourth");
        System.out.println(pageMonitor.getTotalCount());
        System.out.println(pageMonitor.getUniqueCount());
    }
}
