package com.example.andrey.myapplication.entity.desk;

public class GameField {

    private Battleboard battleBoardVisible;
    private Battleboard battleBoardNotVisible;

    public GameField(Battleboard battleBoardPlayer_1,
                     Battleboard battleBoardPlayer_2) {
        this.battleBoardVisible = battleBoardPlayer_1;
        this.battleBoardNotVisible = battleBoardPlayer_2;
    }

    public Battleboard getBattleboardVisible() {
        return battleBoardVisible;
    }

    public Battleboard getBattleBoardNotVisible() {
        return battleBoardNotVisible;
    }
}
