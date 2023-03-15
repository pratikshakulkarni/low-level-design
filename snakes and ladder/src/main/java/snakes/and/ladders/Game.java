package snakes.and.ladders;

import java.util.Deque;
import java.util.LinkedList;

/***
 @author: Pratiksha Kulkarni
 date: 3/15/2023
 */
public class Game {
    Board board;
    Deque<Player> players = new LinkedList<>();
    Player winner;
    Dice dice;

    public Game(){
        initializeGame();
    }

    private void initializeGame() {
        board = new Board(10,5,4);
        dice = new Dice(1);
        winner=null;
        addPlayers();
    }

    private void addPlayers() {
        Player p1 = new Player("p1",0);
        Player p2 = new Player("p2",0);
        players.add(p1);
        players.add(p2);
    }

    public void startGame(){
        while (winner == null){
            Player playerTurn = findPlayerTurn();
            System.out.println("Player is : " + playerTurn.id + " current position is " + playerTurn.currentPosition);

            //roll dice
            int diceNumbers = dice.rollDice();

            //get the new Position
            int newPosition = playerTurn.currentPosition+diceNumbers;
            newPosition = jumpCheck(newPosition);
            playerTurn.currentPosition=newPosition;

            System.out.println("Player is : " + playerTurn.id + " new position is " + newPosition);

            if(newPosition >= board.cells.length * board.cells.length-1) {
                winner = playerTurn;
            }
        }
        System.out.println("WINNER IS:" + winner.id);
    }

    private int jumpCheck(int newPosition) {
        if(newPosition > board.cells.length * board.cells.length-1) return newPosition;

        Cell cell = board.getCell(newPosition);

        if(cell.jump != null && cell.jump.start == newPosition){
            String jumpBy = (cell.jump.start < cell.jump.end)? "ladder":"snake";
            System.out.println("Jump by " + jumpBy);
            return cell.jump.end;
        }
        return newPosition;
    }

    private Player findPlayerTurn() {
        Player playerTurn = players.removeFirst();
        players.addLast(playerTurn);
        return playerTurn;
    }
}
