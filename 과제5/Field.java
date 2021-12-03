package uk.epl.game;
import uk.epl.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Player> players = new ArrayList<>();

    public void add(Player player){
        players.add(player);
    }
    public void moveUp(int jerseyNumber){
        for(Player player : players){
            if(player.getJerseyNumber() == jerseyNumber){
                player.moveUp();
                return;
            }
        }
    }
    public void moveDown(int jerseyNumber){
        for(Player player : players){
            if(player.getJerseyNumber() == jerseyNumber){
                player.moveDown();
                return;
            }
        }
    }
    public void moveRight(int jerseyNumber){
        for(Player player : players){
            if(player.getJerseyNumber() == jerseyNumber){
                player.moveRight();
                return;
            }
        }
    }
    public void moveLeft(int jerseyNumber){
        for(Player player : players){
            if(player.getJerseyNumber() == jerseyNumber){
                player.moveLeft();
                return;
            }
        }
    }
    public void start(){
        for(Player player : players) {
            player.start();
        }
    }
    public void info(){
        for(Player player : players) {
            System.out.println(player);
        }
    }
    public void stop(){
        for(Player player : players) {
            player.stop();
        }
    }
}
