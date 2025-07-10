//TODO 1. Расширить задачу про котов и тарелки с едой.
public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        
        //TODO 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести
        // информацию о сытости котов в консоль.
       
        Cat[] cats = {
                new Cat("Барсик", 30),
                new Cat("Мурзик", 25),
                new Cat("Маркизик", 33),
                new Cat("Рыжик", 15),
                new Cat("Пушок", 40),
                new Cat("Абоба", 22)
        };
        plate.info();
        System.out.println();

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat.getName() + " сыт? " + cat.isHungry());
        }

        System.out.println("\nПосле кормления:");
        plate.info();

        plate.addFood(100);

        plate.info();

        System.out.println();
        for (Cat cat : cats) {
            if (!cat.isHungry()) {
                cat.eat(plate);
                System.out.println(cat.getName() + " сыт? " + cat.isHungry());
            }
        }
        plate.info();
    }
}