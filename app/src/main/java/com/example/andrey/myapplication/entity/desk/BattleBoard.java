package com.example.andrey.myapplication.entity.desk;

import com.example.andrey.myapplication.entity.ships.Ship;

import java.util.ArrayList;

public class BattleBoard {

    private static final int QUANTITY_SINGLE_DECK_SHIPS = 4;
    private static final int QUANTITY_DOUBLE_DECK_SHIP = 3;
    private static final int QUANTITY_THREE_DECK_SHIP = 2;
    private static final int QUANTITY_FOUR_DECK_SHIP = 1;

    private static final int DEFAULT_SIZE_BOARD = 10;
    private static String CHARS_OF_CELLS = "ABCDEFGHIJ";
    private Cell[][] battleboard;
    private ArrayList<Ship> singleDeckShips;
    private ArrayList<Ship> doubleDeckShips;
    private ArrayList<Ship> threeDeckShips;
    private ArrayList<Ship> fourDeckShips;

    public BattleBoard() {
        battleboard = new Cell[DEFAULT_SIZE_BOARD][DEFAULT_SIZE_BOARD];
        initBoard(DEFAULT_SIZE_BOARD);
    }

    private void initBoard(int size) {
        for(int i = 0; i < size; i++){
            for(int j= 0; j < size; j++) {
                this.battleboard[i][j] = new Cell(CHARS_OF_CELLS.charAt(i), j);
            }
        }
    }

    public Cell[][] getBattleboard() {
        return battleboard;
    }

    public void addSingleDeckShip(Ship singleDeckShips) {
        if(this.singleDeckShips.size() < QUANTITY_SINGLE_DECK_SHIPS) {
            this.singleDeckShips.add(singleDeckShips);
        }
    }

    public void addDoubleDeckShips(Ship[] doubleDeckShips) {
        this.doubleDeckShips = doubleDeckShips;
    }

    public void setThreeDeckShips(Ship[] threeDeckShips) {
        this.threeDeckShips = threeDeckShips;
    }

    public void setFrourDeckShips(Ship[] frourDeckShips) {
        this.fourDeckShips = frourDeckShips;
    }

    public Ship[] getSingleDeckShips() {
        return singleDeckShips;
    }

    public Ship[] getDoubleDeckShips() {
        return doubleDeckShips;
    }

    public Ship[] getThreeDeckShips() {
        return threeDeckShips;
    }

    public Ship[] getFrourDeckShips() {
        return frourDeckShips;
    }


}
