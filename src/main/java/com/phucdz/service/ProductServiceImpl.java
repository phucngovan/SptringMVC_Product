package com.phucdz.service;

import com.phucdz.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Adidas NMD R1", "3.500.000 VND", "Mẫu giày thể thao năng động 2018", "Trung Quốc"));
        products.put(2, new Product(2, "Adidas Sobakov", "4.000.000 VND", "Sobakov là mẫu giày bóng đá mới của Adidas", "Dubai"));
        products.put(3, new Product(3, "Adidas UltraBoost", "4.500.000 VND", "KÍCH CỠ TIÊU CHUẨN", "Hàn Quốc"));
        products.put(4, new Product(4, "Adidas Continental 80", "5.000.000 VND", "Đôi giày với thiết kế tối giản", "Campuchia"));
        products.put(5, new Product(5, "Adidas POD-S3.1", "2.000.000 VND", "Ổn định và linh hoạt", "Thailand"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
