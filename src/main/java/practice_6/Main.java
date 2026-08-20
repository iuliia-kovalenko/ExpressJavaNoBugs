package practice_6;


/***
 * В зоопарке есть одно животное, но оно может быть разным: птица или слон.
 * Каждое животное издаёт уникальные звуки и передвигается по-своему.
 * Например, слон трубит и ходит, а птица чирикает и летает.
 * Нужно спроектировать систему, которая может работать с любым животным,
 * добавлять его в зоопарк и демонстрировать его поведение.
 *
 * Управление домашними питомцами
 * Условие:
 * В системе может быть один домашний питомец, у каждого вида свои особенности ухода.
 * Примеры:
 * Собака гуляет и ест сухой корм
 * Кошка играет и ест влажный корм
 * Нужно спроектировать систему, которая позволяет взаимодействовать с любым питомцем с учётом его особенностей.
 *
 * В меню ресторана добавляется блюдо.
 * У каждого блюда свои параметры отображения:
 * Горячее блюдо — с температурой
 * Напиток — с объёмом
 * Нужно спроектировать систему, в которой можно добавлять блюда и выводить их описание с учётом характеристик.
 *
 * Аквариум
 * Условие:
 * В аквариуме может находиться одно морское существо.
 * В зависимости от существа, оно ведёт себя по-разному.
 * Примеры:
 * Акула плавает быстро и агрессивно
 * Морская звезда медленно ползает
 * Нужно спроектировать систему, в которой можно добавить существо и продемонстрировать его поведение.
 *
 * На ферме содержится одно домашнее животное.
 * У каждого животного свои функции и нужды.
 * Примеры:
 * Корова даёт молоко, нуждается в выпасе
 * Курица несёт яйца, требует зерно
 * Нужно создать систему, которая позволяет управлять животным с учётом его потребностей.
 *
 * В ботаническом саду содержится одно растение.
 * У разных растений — разные требования к уходу.
 * Примеры:
 * Орхидея — высокая влажность и тень
 * Кактус — много света, редкий полив
 * Нужно спроектировать систему, в которой можно добавить растение и обеспечить нужный уход.
 */
// Entities: Plant -> Orchid, Cactus, BotanicalGarden -> Plant, setPlant(); maintainPlant();
// Actions: care()

// Entities: FarmAnimal -> Cow, Chicken, Farm -> FarmAnimal, setFarmAnimal(); serviceAnimal();
// Actions: produce(); feed(); care()

// Entities: SeaCreature -> Shark, StarFish, Aquarium -> SeaCreature, setSeaCreature(); showCreatureBehavior();
// Actions: behavior();

// Entities: Animal -> Bird, Elephant, Zoo -> Animal, setAnimal(); showAnimalBehavior();
// Actions: makeSound(); move();

// Entities: Pet -> Dog, Cat, PetManager -> Pet, handlePet(); setPet();
// Actions: feed(); interact();

// Entities: Dish -> HotDish (temperature), Beverage (volume), Menu -> Dishes, addDish(); infoMenu();
// Actions: getDescription();

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal bird = new Bird();
        zoo.setAnimal(bird);
        zoo.showAnimalBehavior();
        System.out.println("-------------");
        Animal elephant = new Elephant();
        zoo.setAnimal(elephant);
        zoo.showAnimalBehavior();

        PetManager kolya = new PetManager();
        Pet cat = new Cat();
        kolya.setPet(cat);
        kolya.handlePet();

        System.out.println("-------------");

        Pet dog = new Dog();
        kolya.setPet(dog);
        kolya.handlePet();

        Menu menu = new Menu("Summer menu");
        Dish hotdish = new HotDish("borsh", 30);
        Dish beverage = new Beverage("lemonade", 200);
        Dish beverage1 = new Beverage("milk", 200);
        menu.addDish(hotdish);
        menu.addDish(beverage);
        menu.addDish(beverage1);
        menu.infoMenu();

        Aquarium aquarium = new Aquarium();
        SeaCreature shark = new Shark();
        aquarium.setCreature(shark);
        aquarium.showBehavior();

        Farm farm = new Farm();
        FarmAnimal cow = new Cow();
        farm.setFarmAnimal(cow);
        farm.serviceAnimal();
        System.out.println("----------");
        FarmAnimal chicken = new Chicken();
        farm.setFarmAnimal(chicken);
        farm.serviceAnimal();

        BotanicalGarden botanicalGarden = new BotanicalGarden();
        Plant orchid = new Orchid();
        botanicalGarden.setPlant(orchid);
        botanicalGarden.maintainPlant();

        AmusementPark park = new AmusementPark();
        Attraction rollerCoaster = new RollerCoaster();
        park.setAttraction(rollerCoaster);
        park.operateAttraction();

        Museum museum = new Museum();
        Exhibit manuscript = new Manuscript();
        museum.setExhibit(manuscript);
        museum.showExhibit();
    }
}
