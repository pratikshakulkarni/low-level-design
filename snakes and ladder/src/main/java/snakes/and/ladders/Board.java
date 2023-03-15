package snakes.and.ladders;

import lombok.Data;

import java.util.concurrent.ThreadLocalRandom;

/***
 @author: Pratiksha Kulkarni
 date: 3/15/2023
 */
@Data
public class Board {
    Cell[][] cells;

    public Board(int boardSize, int numberOfSnakes, int numberOfLadders) {
        initializeCells(boardSize);
        addSnakesAndLadders(cells, numberOfSnakes, numberOfLadders);
    }

    private void initializeCells(int boardSize) {
        cells = new Cell[boardSize][boardSize];

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                Cell obj = new Cell();
                cells[i][j] = obj;
            }
        }
    }

    private void addSnakesAndLadders(Cell[][] cells, int numberOfSnakes, int numberOfLadders) {
        while (numberOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);

            if (snakeTail >= snakeHead) continue;

            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;

            Cell cell = getCell(snakeHead);
            cell.jump = snakeObj;

            numberOfSnakes--;
        }

        while (numberOfLadders > 0){
            int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);

            if(ladderStart >= ladderEnd) continue;

            Jump ladderObj = new Jump();
            ladderObj.start = ladderStart;
            ladderObj.end = ladderEnd;

            Cell cell = getCell(ladderStart);
            cell.jump=ladderObj;

            numberOfLadders--;
        }
    }

    Cell getCell(int playerPosition) {
        int row = playerPosition / cells.length;
        int col = (playerPosition % cells.length);
        return cells[row][col];
    }


}
