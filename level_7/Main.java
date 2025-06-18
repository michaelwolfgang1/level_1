
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 10);
        Plate plate = new Plate(1);
        plate.info();
        cat.info();
        cat.isHungry(plate);
    }
}