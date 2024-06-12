package org.example.tennis;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * [ ] TennisGame
 * - [*] P2 得分  Love-Fifteen
 * - [*] P1 得分  Fifteen-Love
 * - [*] P1 得分 P2 得分  Fifteen-All
 * <p>
 * - [*] 4:0  P1 Win
 * - [*] 0:4  P2 Win
 * <p>
 * - [*] 4:4  Deuce
 * - [*] 5:4  P1 Advantage
 * - [*] 4:5  P2 Advantage
 * <p>
 * - [] 5:3  P1 Win
 * - [] 3:5  P2 Win
 * ------------------------------------------
 *
 * @author 7036 Charles.Zheng
 * @version 1.0
 * @create 2024/5/7 下午 04:23
 */
public class TennisGameTest {

    @Test
    public void test_show_point_0_vs_1() {
        // Arrange
        TennisGame game = new TennisGame();
        game.setPlayer2(1);
        String expected = "Love-Fifteen";

        // Act
        String actual = game.getPoints();

        // Assert
        assertThat(actual).isEqualTo(expected);
    }


    @Test
    public void test_show_point_1_vs_0() {
        // Arrange
        TennisGame game = new TennisGame();
        game.setPlayer1(1);
        game.setPlayer2(0);
        String expected = "Fifteen-Love";

        // Act
        String actual = game.getPoints();

        // Assert
        assertThat(actual).isEqualTo(expected);
    }


    @Test
    public void test_show_point_1_vs_1() {
        // Arrange
        TennisGame game = new TennisGame();
        game.setPlayer1(1);
        game.setPlayer2(1);
        String expected = "Fifteen-All";

        // Act
        String actual = game.getPoints();

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void p1_win_4_vs_0() {
        // Arrange
        TennisGame game = new TennisGame();
        game.setPlayer1(4);
        game.setPlayer2(0);
        String expected = "P1 Win";

        // Act
        String actual = game.getPoints();

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void p1_win_0_vs_4() {
        // Arrange
        TennisGame game = new TennisGame();
        game.setPlayer1(0);
        game.setPlayer2(4);
        String expected = "P2 Win";

        // Act
        String actual = game.getPoints();

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void deuce_4_vs_4() {
        // Arrange
        TennisGame game = new TennisGame();
        game.setPlayer1(4);
        game.setPlayer2(4);
        String expected = "Deuce";

        // Act
        String actual = game.getPoints();

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void p1_advantage_5_vs_4() {
        // Arrange
        TennisGame game = new TennisGame();
        game.setPlayer1(5);
        game.setPlayer2(4);
        String expected = "P1 Advantage";

        // Act
        String actual = game.getPoints();

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void p1_advantage_4_vs_5() {
        // Arrange
        TennisGame game = new TennisGame();
        game.setPlayer1(4);
        game.setPlayer2(5);
        String expected = "P2 Advantage";

        // Act
        String actual = game.getPoints();

        // Assert
        assertThat(actual).isEqualTo(expected);
    }

}
