public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = false;
    }

    public void eat(Plate plate) {
        plate.removedFood(appetite);
    }

    public void isHungry(Plate plate) {
        plate.checkHungry(hungry);
    }
    public void info(){
        System.out.println(name + " \n Аппетит==>" + appetite + " \n Голодный?==>" + hungry);
    }
}
