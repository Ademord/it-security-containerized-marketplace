package ch.zhaw.securitylab.marketplace.dto;

import ch.zhaw.securitylab.marketplace.model.Product;
import java.math.BigDecimal;

public class ProductDto {

    private String code;
    private String description;
    private BigDecimal price;

    public ProductDto() {
    }

    public ProductDto(Product product) {
        code = product.getCode();
        description = product.getDescription();
        price = product.getPrice();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
