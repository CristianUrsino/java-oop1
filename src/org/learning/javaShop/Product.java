package org.learning.javaShop;
//imports
import java.math.BigDecimal;
import java.util.Random;
public class Product {

    //attributi
    private int productCode;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;

    //costruttori
    public Product(String name, String description, BigDecimal price, BigDecimal vat) {
        Random randomGenerator = new Random();
        productCode = randomGenerator.nextInt(99999999);
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    //getter
    public int getProductCode() {
        return productCode;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public BigDecimal getVat() {
        return vat;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    //other methods
    public BigDecimal getTotalPrice(){
        //la formula è: price * (1 + 0.21)
        return price.multiply(BigDecimal.ONE.add(vat));
    }
    public String getFullName(){
        //ritorno codice-nome, ma il codice anche se di 4 cifre appare di 8 (es. 00001234)
        return String.format("%08d",productCode) + "-" + name;
    }
}
