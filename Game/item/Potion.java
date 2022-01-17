package item;

public enum Potion {
    HEALTHPOTION("Health potion", "Recovers 10 health", 5),
    SUPERPOTION("Super potion", "Recovers 20 health", 10),
    ULTRAPOTION("Ultra potion", "Fully recovers your health", 9999999);

    private final String name;
    private final String effect;
    private final int amount;


    Potion(final String name, final String effect, final int amount) {
        this.name = name;
        this.effect = effect;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getEffect() {
        return effect;
    }

    public int getAmount() {
        return amount;
    }
}
