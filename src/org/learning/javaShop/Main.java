package org.learning.javaShop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //primo prodotto
        BigDecimal firstPrice = new BigDecimal("200");
        BigDecimal firstVat = new BigDecimal("0.21");
        Product cellulare = new Product("cellulare", "chiama", firstPrice, firstVat);
        System.out.println("simple price: " + cellulare.getPrice() + " - total price: " + cellulare.getTotalPrice());
        System.out.println("name product: " + cellulare.getName() + " - full name: " + cellulare.getFullName());

        //secondo prodotto
        BigDecimal secondPrice = new BigDecimal("13");
        BigDecimal secondVat = new BigDecimal("0.04");
        Product panettone = new Product("panettone", "panettone classico", secondPrice, secondVat);
        System.out.println("\nsimple price: " + panettone.getPrice() + " - total price: " + panettone.getTotalPrice());
        System.out.println("name product: " + panettone.getName() + " - full name: " + panettone.getFullName());
    }

}
