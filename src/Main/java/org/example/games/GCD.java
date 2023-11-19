package org.example.games;
import org.example.Engine;
import org.example.Utils;

public class GCD {
    public static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void initiateGCD () {

        String[][] arrayRound = new String[Engine.MAX_ROUNDS][Engine.FIELDS];
            for (int count = 0; count < Engine.MAX_ROUNDS; count++) {
                for (int i = 0; i < Engine.MAX_ROUNDS; i++) {
                    int num1 = Utils.getRandomNumber(Engine.LIMIT);
                    int num2 = Utils.getRandomNumber(Engine.LIMIT);
                    arrayRound[i][0] = num1 + " " + num2;
                    arrayRound[i][1] = Integer.toString(getGCD(num1, num2));
                }
            }
            Engine.getGameLogic(arrayRound, RULES);
        }
        public static int getGCD ( int num1, int num2) {
            if (num2 == 0) {
                return num1;
            } else {
                while (num2 != 0) {
                    int temp = num1 % num2;
                    num1 = num2;
                    num2 = temp;
                }
            }
            return num1;
        }


}