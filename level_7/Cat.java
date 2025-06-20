public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if(!satiety) {
            if (plate.removedFood(appetite)) {
                satiety = true;
            }
        }
    }

    public boolean isHungry() {
        return  satiety;
    }
    public void info(){
        System.out.println(name + " \n Аппетит==>" + appetite + " \n Голодный?==>" + satiety);
    }
    public String getName() {
        return name;
    }
}
