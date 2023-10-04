package org.example.Homework1.Task2;

import org.example.Homework1.Task2.Product;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return  o1.getCost() - o2.getCost();
    }
}
