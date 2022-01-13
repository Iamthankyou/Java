package com.company;

public class TennisGame {

    private static final int ZERO = 0;
    private static final int A_POINT = 1;
    private static final int TWO_POINTS = 2;
    private static final int THREE_POINTS = 3;

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        if (player1Score == player2Score) {
            score = readTieScore(player1Score);
        }
        else if (player1Score >= 4 || player2Score >= 4) {
            if (player1Score > player2Score) {
                if (player1Score - player2Score == 1) {
                    score = "Advantage player1";
                } else {
                    score = "Win for player1";
                }
            } else {
                if (player2Score - player1Score == 1) {
                    score = "Advantage player2";
                } else {
                    score = "Win for player2";
                }
            }
        } else {
            score = readScore(player1Score) + "-" + readScore(player2Score);
        }
        return score;
    }

    private static String readTieScore(int playerScore) {
        switch (playerScore) {
            case ZERO : return "Love-All";
            case A_POINT : return "Fifteen-All";
            case TWO_POINTS : return "Thirty-All";
            case THREE_POINTS : return "Forty-All";
            default : return "Deuce";
        }

    }

    private static String readScore(int score) {
        switch (score) {
            case ZERO: return "Love";
            case A_POINT: return "Fifteen";
            case TWO_POINTS: return "Thirty";
            case THREE_POINTS: return "Forty";
            default: return "";
        }
    }
}