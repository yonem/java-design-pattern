package jp.ne.yonem.pattern.Strategy.A1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Strategy")
    void test1() {
//            Usage: java Main randomSeed1 randomSeed2
//            Example: java Main 314 15
        var seed1 = 223;
        var seed2 = 43;
        var player1 = new Player("Taro", new ProbStrategy(seed1));
        var player2 = new Player("Hana", new RandomStrategy(seed2));

        for (var i = 0; i < 10_000; i++) {
            var nextHand1 = player1.nextHand();
            var nextHand2 = player2.nextHand();

            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();

            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();

            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player1);
        System.out.println(player2);
    }
}