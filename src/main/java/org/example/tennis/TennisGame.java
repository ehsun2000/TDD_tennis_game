package org.example.tennis;

/**
 * 網球遊戲
 * ------------------------------------------
 * @version                 1.0
 * @author                  7036 Charles.Zheng
 * @create                  2024/6/12 下午 01:11 */
public class TennisGame {

    /**
     * 玩家1分數
     */
    private int player1 = 0;

    /**
     * 玩家2分數
     */
    private int player2 = 0;

    public int getPlayer1() {
        return player1;
    }

    public void setPlayer1(int player1) {
        this.player1 = player1;
    }

    public int getPlayer2() {
        return player2;
    }

    public void setPlayer2(int player2) {
        this.player2 = player2;
    }

    /**
     * 獲取當前比分
     * @return
     * ------------------------------------------
     * @version                 1.0
     * @author                  7036 Charles.Zheng
     * @create                  2024/6/12 下午 01:21
     */
    public String getPoints() {
        return "Love-Fifteen";
    }

}
