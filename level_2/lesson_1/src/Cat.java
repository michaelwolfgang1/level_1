public class Cat implements Participant {
    private final String name;
    private final int limitRun;
    private final int limitJump;

    public Cat(String name, int limitRun, int limitJump) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitJump = limitJump;
    }

    @Override
    public void run(int distance) {
        System.out.println(name + " бежит " + distance + "м");
    }

    @Override
    public boolean canRun(int distance) {
        return distance <= limitRun;
    }

    @Override
    public void jump(int height) {
        System.out.println(name + " прыгает " + height + "м");
    }

    @Override
    public boolean canJump(int height) {
        return height <= limitJump;
    }

    @Override
    public String getName() {
        return name;
    }
}


