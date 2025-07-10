public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    //TODO 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
    // (например, в миске 10 еды, а кот пытается покушать 15-20).

    //TODO 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть
    // наполовину сыт (это сделано для упрощения логики программы).

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
    //TODO 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

    public void addFood(int n) {
        food += n;
        System.out.println("Добавляем в тарелку еды : "+food);
        }
    }






