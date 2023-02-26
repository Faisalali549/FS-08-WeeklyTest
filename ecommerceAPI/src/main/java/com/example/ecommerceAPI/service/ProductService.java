package com.example.ecommerceAPI.service;

import com.example.ecommerceAPI.dao.ProductRepository;
import com.example.ecommerceAPI.model.Product;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public int saveProduct(Product product) {
        Product userProduct = productRepository.save(product);
        return userProduct.getProductId();
    }

    public JSONArray getProduct(String productId) {
        JSONArray productArray = new JSONArray();
        if(null != productId && productRepository.findById(Integer.valueOf(productId)).isPresent()) {
            Product product = productRepository.findById(Integer.valueOf(productId)).get();
            JSONObject productObj = setProduct(product);
            productArray.put(productObj);
        }
        else {
            List<Product> products = productRepository.findAll();
            for(Product product : products) {
                JSONObject productObj = setProduct(product);
                productArray.put(productObj);
            }
        }
        return productArray;
    }

    private JSONObject setProduct(Product product) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("productId", product.getProductId());
        jsonObject.put("name", product.getName());
        jsonObject.put("price", product.getPrice());
        jsonObject.put("description", product.getDescription());
        jsonObject.put("category", product.getCategory());
        jsonObject.put("brand", product.getBrand());

        return jsonObject;
    }
}
