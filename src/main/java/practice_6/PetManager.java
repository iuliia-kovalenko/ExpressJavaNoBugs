package practice_6;

public class PetManager {
    private Pet pet;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void handlePet() {
        pet.feed();
        pet.interact();
    }
}
