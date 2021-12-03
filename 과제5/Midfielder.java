package uk.epl.player;

public class Midfielder extends Player{
    private int PASSING_POINT = 10;

    public Midfielder(String name, int jerseyNumber, int speed, int stamina, int passing){
        super(name, jerseyNumber, speed, stamina, passing);
    }
    @Override
    protected float getPassing(){
        return super.getPassing() + PASSING_POINT;
    }
    @Override
    public String toString(){
        return String.format("Player name='%s, JerseyNumber=%d Position (%d , %d) %s SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f",getName(), getJerseyNumber(), position.x, position.y, this.getClass().getSimpleName(), getSpeed(), getStamina(), getPassing());
    }
    @Override
    public void start() {
        position.x = 34;
        position.y = 50;
    }
    @Override
    public void stop(){
        position.x = 0;
        position.y = 0;
    }
}
