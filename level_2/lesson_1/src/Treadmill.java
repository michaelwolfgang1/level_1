public class Treadmill {
    private final int length;

    public Treadmill(int length) {
        this.length = length;
    }
    public boolean overcome(Participant participant){
        if(participant.canRun(length)){
            participant.run(length);
            System.out.println(participant.getName() + " преодолел дорожку!");
            return true;
        }
        System.out.println(participant.getName() + " не смог пробежать!");
        return false;
    }
}
