public enum ChoiceAccomodation {
    TRIPLE(410);

    private final int price;

    ChoiceAccomodation(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
