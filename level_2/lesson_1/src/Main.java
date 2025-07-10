public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Иван", 2000, 2),
                new Cat("Барсик", 500, 3),
                new Robot("Робокоп", 40000, 10)
        };

        Object[] obstacles = {
                new Treadmill(800),
                new Wall(2),
                new Treadmill(1500)
        };

        for (Participant p : participants) {
            for (Object o : obstacles) {
                boolean success = false;
                if (o instanceof Treadmill t) success = t.overcome(p);
                if (o instanceof Wall w) success = w.overcome(p);
                if (!success) break;
            }
        }
    }
}