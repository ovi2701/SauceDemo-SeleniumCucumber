package saucedemo.customtype;

import io.cucumber.java.ParameterType;
import saucedemo.domainobjects.Product;

public class CustomParameterType {
    @ParameterType(".*")
    public Product product(String name){
        return new Product(name);
    }
}
