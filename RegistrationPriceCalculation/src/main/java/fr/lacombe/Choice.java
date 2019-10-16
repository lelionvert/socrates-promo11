package fr.lacombe;

public enum Choice {
    SINGLE(610),
    TWIN(510),
    TRIPLE(410),
    SINGLE_DOUBLE(940),
    NO_ACCOMMODATION(240);

    private int price;
    Choice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
