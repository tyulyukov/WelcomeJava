package exercises.third;

public class Wallet {
    private Money money;

    public Wallet(Money money) {
        this.money = money;
    }

    public void buy(Product product) {
        try {
            money.spend(product.price);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        return money.getBanknotes() + "." + money.getCoins();
    }
}
