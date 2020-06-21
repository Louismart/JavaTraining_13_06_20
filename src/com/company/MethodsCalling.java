package com.company;

public class MethodsCalling {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus= 100;
             //calculateScore2(gameOver, score, levelCompleted, bonus);

             score = 10000;
        levelCompleted = 8;
        bonus= 200;
        //calculateScore2(gameOver, score, levelCompleted, bonus);
//        displayHighScorePosition("John", 1500);
//        System.out.println(calculateHighScorePosition(390));
        int highStorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highStorePosition);

        highStorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("John", highStorePosition);

        highStorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", highStorePosition);

        highStorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Percy", highStorePosition);


    }
    public static void calculateScore() {
        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 8;
        int bonus = 200;
    }
             //if we change int to void ,we can remove return expression below
    public static int calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalscore = score +(levelCompleted * bonus); //1. 10 000 + (8*200) = 11 600; 2. 800 +(5*100) = 1300
            finalscore +=2000; // 1. 11 600 + 1000 = 12 600; 2. 1300+ 1000 = 2300;
            System.out.println("Your final score was " + finalscore);
            return finalscore; //if you
            }
        return -1;


    }
    public static void displayHighScorePosition(String name, int highScorePosition ) {

        System.out.println(name + " " + "managed to get into position" + " " + highScorePosition + " " + "on the high score table");

    }
    public static int calculateHighScorePosition (int score ) {

        if (score >= 1000 ) {
            return 1;
        } else if (score >= 500 && score < 1000) {
             return 2;
        } if (score >= 100 && score < 500) {
            return 3;
        }
        return 4;
    }

    }
