//TODO 1. Создать классы Собака и Кот с наследованием от класса Животное.
class Animal {
    private String name;
    static int countAnimal=0;
    public Animal(String name) {
    this.name = name;
    countAnimal++;
}
    public String getName() {
        return name;
    }

    //TODO 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
    // Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
    public void run(int a){
        System.out.println(name+" Пробежал "+a);
    }
    public void swim(int a){
        System.out.println(name+" Проплыл "+a);
    }
    //TODO 4. * Добавить подсчет созданных котов, собак и животных.
    public static void allFieldAnimal(){
        System.out.println("Животных " +countAnimal);
    }
    }

