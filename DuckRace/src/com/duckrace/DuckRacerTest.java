package com.duckrace;

import static com.duckrace.Reward.*;


class DuckRacerTest {

    public static void main(String[] args) {
        DuckRacer racer5 = new DuckRacer(5,"Chris");
        System.out.println(racer5); //toString() automattically called

        racer5.win(Reward.DEBIT_CARD);
        racer5.win(Reward.PRIZES);
        racer5.win(Reward.DEBIT_CARD);
        racer5.win(Reward.DEBIT_CARD);

        System.out.println(racer5);
    }
}