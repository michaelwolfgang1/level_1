public class Plate {
    private String plate;
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void removedFood(int n) {
        if(n>food){}
        else{
            food -= n;
        }
    }
    public void info(){
        System.out.println("В Тарелке : " + food);
    }
    public void checkHungry(boolean n){
        if(food>0) {
            n = true;
        }else {
            n = false;
        }
    }
}
