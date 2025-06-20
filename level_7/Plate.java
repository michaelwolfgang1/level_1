public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public boolean removedFood(int n) {
        if(n <= 0 || food < n){
            return false;
        }
        food -= n;
        return true;

    }
    public void info() {
        System.out.println("В Тарелке : " + food);
    }
    public void addFood(int n) {
        food += n;
        System.out.println("Добавляем в тарелку еды : "+food);
        }
    }






