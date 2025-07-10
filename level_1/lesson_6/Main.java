public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Тютька");
        Animal dog2 = new Dog("Бобик");
        Animal cat1 = new Cat("Murzik");
        Animal cat2 = new Cat("Барсик");

        dog1.run(333);
        dog1.swim(6);
        dog2.run(56);
        dog2.swim(6);
        cat1.run(201);
        cat1.swim(24);
        cat2.run(155);
        cat2.swim(1);
        Animal.allFieldAnimal();
        Dog.countDog();
        Cat.countCat();
    }
}