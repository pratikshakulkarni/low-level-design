package snakes.and.ladders;

import lombok.Data;

/***
 @author: Pratiksha Kulkarni
 date: 3/15/2023
 */

@Data
public class Player {
    String id;
    int currentPosition;

    public Player(String id, int currentPosition) {
        this.currentPosition = currentPosition;
        this.id = id;
    }
}
