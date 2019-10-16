public enum ChoiceAccomodation {
    TWIN(510), TRIPLE(410), NO_ACCOMMODATION(240);

    private final int price;

    ChoiceAccomodation(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
