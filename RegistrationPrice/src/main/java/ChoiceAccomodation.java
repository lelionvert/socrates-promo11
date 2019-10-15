public enum ChoiceAccomodation {
    TRIPLE(410), NO_ACCOMODATION(240);

    private final int price;

    ChoiceAccomodation(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
