package practice_6;

public class Farm {
    private FarmAnimal farmAnimal;

    public void setFarmAnimal(FarmAnimal farmAnimal){
        this.farmAnimal = farmAnimal;
    }

    public void serviceAnimal(){
        farmAnimal.care();
        farmAnimal.feed();
        farmAnimal.produce();
    }
}
