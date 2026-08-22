package practice_6;

public class Aquarium {
    private SeaCreature seaCreature;

    public void setCreature(SeaCreature creature) {
        this.seaCreature = creature;
    }

    public void showBehavior() {
        seaCreature.behavior();
    }
}
