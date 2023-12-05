package enums;

public enum Prices {
    UNKNOWN("Неизвестная цена"),
    FREE("Бесплатно"),
    PROFITABLE("Выгодно"),
    CHEAP("Дешего"),
    MEDIUM("Позволительно"),
    EXPENSIVE("Дорого"),
    LUXURIOUS("Роскошно");
    private final String price;
    Prices(String price) {
        this.price = price;
    }
    public String getPrices() {
        return price;
    }
}
