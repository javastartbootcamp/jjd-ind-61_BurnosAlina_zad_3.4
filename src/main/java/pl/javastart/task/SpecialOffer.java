package pl.javastart.task;

public class SpecialOffer {
    Product product;
    String description;
    String time;
    int discount;

    SpecialOffer(Product product, String description, String time, int discount) {
        this.product = product;
        this.description = description;
        this.time = time;
        this.discount = discount;
    }
}
