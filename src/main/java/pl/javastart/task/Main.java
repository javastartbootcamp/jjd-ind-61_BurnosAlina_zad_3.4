package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category category1 = new Category("Slodycze", "Wszystko jest dla ludzi!");
        Category category2 = new Category("Napoje", "Cos dla spragnionych");
        Product product1 = new Product("Milka", 3.5,
                "Czekolada mleczna z orzechami", category1);
        Product product2 = new Product("Snickers", 3, "Batonik z karmelem",
                category1);
        Product product3 = new Product("Sprite", 3.99, "Napoj gazowany",
                category2);
        Product product4 = new Product("Chleb", 5.2, "Chleb zytni z ziarnami");
        SpecialOffer offer = new SpecialOffer(product4, "Kazdy chleb 20% taniej",
                "11.01.2023 - 31.01.2023", 20);
        System.out.println("Produkty w naszym sklepie:\n" + product1.name + ", " + product1.price + "zl, " +
                product1.description + ", " + product1.category.name + ", " + product1.category.description);
        System.out.println(product2.name + ", " + product2.price + "zl, " +
                product2.description + ", " + product2.category.name + ", " + product2.category.description);
        System.out.println(product3.name + ", " + product3.price + "zl, " +
                product3.description + ", " + product3.category.name + ", " + product3.category.description);
        System.out.println(product4.name + ", " + product4.price + "zl, " +
                product4.description);
        System.out.println("Oferta specjalna:\n" + offer.description + "\nCzas trwania promocji: " + offer.time +
                "\nOferta na produkt: " + offer.product.name + "\nRabat: " + offer.discount + "%");
    }
}
