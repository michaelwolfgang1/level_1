public class Wall {
    private final int height;

    public Wall(int height) {
        this.height = height;
    }
    public boolean overcome(Participant participant){
        if(participant.canJump(height)){
            participant.jump(height);
            System.out.println(participant.getName() + " преодолел стену!");
            return true;
        }
        System.out.println(participant.getName() + " не смог перепрыгнуть!");
        return false;
}
}
