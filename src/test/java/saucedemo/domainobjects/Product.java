package saucedemo.domainobjects;

public class Product {
    public String getName() {
        return name.replace("\"", "");
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Product(String name) {
        this.name = name;
    }
}
