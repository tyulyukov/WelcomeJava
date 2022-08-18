package exercises.third;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Money implements Comparable<Money> {
    @Getter
    private int banknotes;
    @Getter
    private int coins;

    private void setBanknotes(int amount) throws Exception {
        if (amount < 0)
            throw new Exception("Money can not be negative");

        banknotes = amount;
    }

    private void setCoins(int amount) throws Exception {
        if (amount < 0)
            throw new Exception("Money can not be negative");

        coins = amount;
    }

    @Override
    public int compareTo(Money o) {
        if (banknotes == o.banknotes && coins == o.coins)
            return 0;
        else if ((banknotes == o.banknotes && coins < o.coins) || banknotes < o.banknotes)
            return -1;
        else
            return 1;
    }

    public void spend(Money money) throws Exception {
        if (compareTo(money) < 0)
            throw new Exception("Not enough money");

        coins -= money.coins;

        if (coins < 0) {
            coins = 100 + coins;
            banknotes--;
        }

        banknotes -= money.banknotes;
    }
}

