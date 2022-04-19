package com.bridgelabz.GamblingSimulator;

public class GamblingSimulator {

    /**
     * As a Gambler Would Start with a Stake
     * of $100 Every Day and Bet
     * $1 Every Game .
     *
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

        /**Initializing random Variable
         * Using random method
         */

        int random = (int)Math.floor(Math.random()*10) % 2;

        /**
         * Here I am Taking if Statement to
         * Decision-Making
         *
         * if random equals(bet=1)- "Win"
         * or " Loose "
         */

        if (random==bet){

            System.out.println("You Win.");
        }
        else{

            System.out.println("You Loose.");
        }


        }
    }




