//TODO 1. Создать классы Собака и Кот с наследованием от класса Животное.
class Dog extends Animal {
    private String name;
private static int countDog=0;
    public Dog(String name) {
        super(name);
        countDog++;
    }

    public void run(int a) {
        if(a>500||a<=0){System.out.println("Пёс не может пробежать столько ");}
        else{System.out.println(getName() + " Пробежал " + a+ " м");}
    }
    public void swim(int a) {
        if(a>10||a<=0){System.out.println("Пёс не может проплыть столько ");}
        else{System.out.println(getName() + " проплыл " + a+ " м ");}
    }
    //TODO 4. * Добавить подсчет созданных котов, собак и животных.
    public static void countDog(){
        System.out.println("Собак "+countDog);
    }

}