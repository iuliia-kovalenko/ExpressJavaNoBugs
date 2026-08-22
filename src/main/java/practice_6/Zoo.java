package practice_6;

public class Zoo {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void showAnimalBehavior() {
        animal.move();
        animal.makeSound();
    }
}
