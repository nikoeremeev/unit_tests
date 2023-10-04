package Homework1.Task2;

import org.example.Homework1.Task2.Product;
import org.example.Homework1.Task2.Shop;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */

    public static void main(String[] args) {
        Product product = new Product(50,"lemonade");
        Product product2 = new Product(100,"sugar");
        Product product3 = new Product(25,"rice");
        Product product4 = new Product(40,"porridge");
        Product product5 = new Product(250,"honey");

        List<Product> productList = new ArrayList<>();
        productList.add(product);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        // правильное количество продуктов
        assertThat(productList).hasSize(5);

        Shop shop = new Shop(productList);



        // верное содержимое корзины
        assertThat(shop.getProducts())
                .extracting(Product::getTitle)
                .contains("sugar","lemonade","porridge");


        for (Product p: productList) {
            System.out.println(p);
        }

        shop.sortProductsByPrice();
        System.out.println("---------------------");

        //  корректность работы метода sortProductsByPrice
        assertThat(shop.getProducts())
                .extracting(Product::getTitle)
                .containsSequence("rice","porridge","lemonade","sugar","honey");

        for (Product p: productList) {
            System.out.println(p);
        }

        System.out.println("---------------------");
        System.out.println(shop.getMostExpensiveProduct());

        // проверки корректность работы метода getMostExpensiveProduct
        assertThat(shop.getMostExpensiveProduct())
                .extracting(Product::getTitle)
                .isEqualTo("honey");


    }

}
