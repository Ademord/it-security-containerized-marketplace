package ch.zhaw.securitylab.marketplace.service;

import ch.zhaw.securitylab.marketplace.model.Product;
import javax.enterprise.context.RequestScoped;

@RequestScoped
public class AdminProductService {

    /**
     * Inserts product into the database if no product with the same code
     * already exists.
     * 
     * @param product The product to insert
     * @return true if the product was inserted, false otherwise
     */
    public boolean insertProduct(Product product) {
        
        // Complete this method
        
        return false;
    }
}
