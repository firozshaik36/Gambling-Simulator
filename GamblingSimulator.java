package com.bridgelabz.GamblingSimulator;

import java.util.Random;

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
        int day = 1;
        int UnluckyDay = 1;
        int LuckyDay = 1;
        int UnluckyMonth= 1;
        int LuckyMonth = 1;
        int LuckyDayMoney = EveryDayStake;
        int UnluckyDayMoney = EveryDayStake;

        while (month<=12) {
            day = 1;
            while(day<=30) {
                Stake = EveryDayStake;
                Random rand = new Random();
                int dailyGamePlayed = rand.nextInt(10);

                for (int i = 0; i < dailyGamePlayed; i++) {

                    int randcheck = (int)Math.floor(Math.random()*10) % 2;//Initializing random Variable & Using random method

                    /**
                     * Here I am Taking if Statement to
                     * Decision-Making
                     *
                     * if random equals(bet=1)- "Win"
                     * or " Loose "
                     */

                    if (randcheck==bet) {
                        Stake = Stake + 1;
                        System.out.println("You Win.");
                    }
                    else {
                        Stake = Stake - 1;
                        System.out.println("You Loose.");
                    }
                }
                /**
                 * if Statement to Decision-Making
                 *
                 */

                if(LuckyDayMoney<Stake){
                    LuckyDay = day;
                    LuckyMonth = month;
                    LuckyDayMoney = Stake;
                }

                if(UnluckyDayMoney>Stake) {
                    UnluckyDay = day;
                    UnluckyMonth = month;
                    UnluckyDayMoney = Stake;
                }
                day++;
            }
            month++;
        }
        System.out.println("Lucky Day "+LuckyDay+" in the month "+LuckyMonth+" Maximum money won is "+(LuckyDayMoney - Stake)+" rupees ");
        System.out.println("Unlucky Day "+UnluckyDay+" in the month "+UnluckyMonth+" Maximum  money lost is " +(Stake - UnluckyDayMoney)+" rupees ");
    }
}

