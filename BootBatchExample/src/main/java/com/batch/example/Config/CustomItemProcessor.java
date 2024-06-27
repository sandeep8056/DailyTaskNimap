package com.batch.example.Config;

import com.batch.example.model.Product;
import org.springframework.batch.item.ItemProcessor;

public class CustomItemProcessor implements ItemProcessor<Product, Product> {
    @Override
    public Product process(Product item) throws Exception {
        //transform
        int  discount = Integer.parseInt(item.getDiscount();
        double originalPrice = Double.parseDouble(item.getPrice());
        double finalDiscount= ((double) discount /100)*originalPrice;
        double finalPrice = originalPrice- finalDiscount;
        item.setDiscountedPrice(String.valueOf(finalPrice));

        return item;
    }
}
