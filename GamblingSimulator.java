package com.bridgelabz.GamblingSimulator;

public class GamblingSimulator {

    /**
     * As a Gambler Would Start with a Stake
     * of $100 Every Day and Bet
     * $1 Every Game .
     * <p>
     * Here I am Initializing Static Variables
     */

    public static final int EveryDayStake = 100;
    public static final int bet = 1;

    public static void main(String[] args) {

        /**
         * Added Welcome Message to Understand
         * what Program it is,
         */

        System.out.println("---Welcome To Gambling Simulator---");

        int Stake = EveryDayStake;
        int month = 1;

        while (month <= 12) {
            int day = 1;
            System.out.println("Month" + month);

            while (day <= 30) {
                Stake = EveryDayStake;

                int random = (int) Math.floor(Math.random() * 10) % 2; //Initializing random Variable & Using random method

                /**
                 * Here I am Taking if Statement to
                 * Decision-Making
                 *
                 * if random equals(bet=1)- "Win"
                 * or " Loose "
                 */

                if (random == bet) {
                    Stake = Stake + 1;
                    System.out.println("You Win.");
                } else {
                    Stake = Stake - 1;
                    System.out.println("You Loose.");
                }
                /**
                 * if Statement to Decision-Making
                 * 
                 */

                if (Stake < EveryDayStake) {
                    System.out.println("Day "+day+" lost by "+(EveryDayStake - Stake)+" rupees ");
                } else {
                    System.out.println("Day "+day+" won by " +(Stake - EveryDayStake)+" rupees ");
                }
                day++;


            }
            month++;
            System.out.println();
        }
    }
}



