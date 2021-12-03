package uk.epl.player;

public class Forward extends Player{
    private int ACCELERATION_POINT = 10;

    public Forward(String name, int jerseyNumber, int speed, int stamina, int passing){
        super(name, jerseyNumber, speed, stamina, passing);
    }
    @Override
    protected float getSpeed(){
        return super.getSpeed() + ACCELERATION_POINT;
    }
    @Override
    public String toString(){
        return String.format("Player name='%s, JerseyNumber=%d Position (%d , %d) %s SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f",getName(), getJerseyNumber(), position.x, position.y, this.getClass().getSimpleName(), getSpeed(), getStamina(), getPassing());
    }
    @Override
    public void start() {
        position.x = 34;
        position.y = 25;
    }
    @Override
    public void stop(){
        position.x = 0;
        position.y = 0;
    }
}
