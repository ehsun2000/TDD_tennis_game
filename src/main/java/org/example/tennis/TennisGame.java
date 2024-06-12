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

    private final String BAR = "-";

    private final String[] POINT_NAME_ARRAY = {"Love", "Fifteen", "Thirty", "Forty"};

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
    public String getTennisGame() {
        if (this.isWinCondition()) {
            return this.playerWithHigherScore() + " Win";
        }

        if (this.isDeuce()) {
            return "Deuce";
        }

        if (this.isAdvantage()) {
            return this.playerWithHigherScore() + " Advantage";
        }

        return currentScore();
    }

    /**
     * 是否達到勝利條件
     * @return
     * ------------------------------------------
     * @version                 1.0
     * @author                  7036 Charles.Zheng
     * @create                  2024/6/12 下午 03:17
     */
    private boolean isWinCondition() {
        return Math.abs(player1 - player2) > 1 && (player1 > 3 || player2 > 3);
    }

    /**
     * 是否為平局
     * @return
     * ------------------------------------------
     * @version                 1.0
     * @author                  7036 Charles.Zheng
     * @create                  2024/6/12 下午 03:17
     */
    private boolean isDeuce() {
        return player1 == player2 && player1 >= 3;
    }

    /**
     * 是否為優勢局
     * @return
     * ------------------------------------------
     * @version                 1.0
     * @author                  7036 Charles.Zheng
     * @create                  2024/6/12 下午 03:18
     */
    private boolean isAdvantage() {
        return Math.abs(player1 - player2) == 1 && (player1 > 3 || player2 > 3);
    }

    /**
     * 獲取分數較高的玩家
     * @return
     * ------------------------------------------
     * @version                 1.0
     * @author                  7036 Charles.Zheng
     * @create                  2024/6/12 下午 03:18
     */
    private String playerWithHigherScore() {
        return player1 > player2 ? "P1" : "P2";
    }

    /**
     * 獲取當前比分
     * @return
     * ------------------------------------------
     * @version                 1.0
     * @author                  7036 Charles.Zheng
     * @create                  2024/6/12 下午 03:18
     */
    private String currentScore() {
        if (player1 == player2) {
            return POINT_NAME_ARRAY[player1] + BAR + "All";
        }

        return POINT_NAME_ARRAY[player1] + BAR + POINT_NAME_ARRAY[player2];
    }

}
