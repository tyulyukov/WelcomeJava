package exercises.third;

import exercises.Exercise;

public class Exercise3 extends Exercise {
    @Override
    public void print() {
        Wallet wallet = new Wallet(new Money(100, 0));
        System.out.println(wallet);

        Product iPhone = new Product(new Money(50, 25));

        wallet.buy(iPhone);

        System.out.println(wallet);

        wallet.buy(iPhone);

        System.out.println(wallet);
    }
}
