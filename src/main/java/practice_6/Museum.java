package practice_6;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void showExhibit() {
        exhibit.describe();
        exhibit.preserve();
    }
}
