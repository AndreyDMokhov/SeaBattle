package com.example.andrey.myapplication.entity.desk;

public class Cell {

    private int numberCell;
    private char charCell;

    private boolean isChecked;

    public Cell(char charCell, int numberCell) {
        this.numberCell = numberCell;
        this.charCell = charCell;
    }

    @Override
    public String toString() {

        return "Cell{" + charCell +
                "," + (numberCell +1)  +
                '}';
    }
}
