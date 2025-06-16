//TODO 1. Создать классы Собака и Кот с наследованием от класса Животное.
class Cat extends Animal{
    private String name;
    private static int countCat=0;
    public Cat(String name) {
        super(name);
        countCat++;
    }
//TODO 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание:
// кот не умеет плавать, собака 10 м.).
    public void run(int a) {
        if (a > 200 || a <= 0) {
            System.out.println("Пёс не может пробежать столько ");
        } else {
            System.out.println(getName() + " Пробежал " + a+" м");
        }
    }
     public void swim(int a) {
            System.out.println(getName()+ " не умеет плавать!!!");

    }
    //TODO 4. * Добавить подсчет созданных котов, собак и животных.
     public static void countCat(){
        System.out.println("Кошек "+countCat);
     }
}
