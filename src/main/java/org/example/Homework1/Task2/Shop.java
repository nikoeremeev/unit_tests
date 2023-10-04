package org.example.Homework1.Task2;

import org.example.Homework1.Task2.Product;
import org.example.Homework1.Task2.ProductComparator;

import java.util.List;

public class Shop  {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts()
    {
        return products;
    }

    public Shop(List<Product> products) {
        this.products = products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        products.sort(new ProductComparator());
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        Product product = new Product();
        int max = 0;
        for (Product p:products) {
            if (p.getCost() > max){
                max = p.getCost();
                product = p;
            }
        }
        return product;
    }


}