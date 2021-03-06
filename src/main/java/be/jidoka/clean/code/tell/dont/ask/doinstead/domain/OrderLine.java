package be.jidoka.clean.code.tell.dont.ask.doinstead.domain;

import java.math.BigDecimal;

/**
 * OrderLine is now completely encapsulated by the Order it is in!
 */
class OrderLine {

    private final String productName;
    private BigDecimal price;
    private final int amount;

    OrderLine(String productName, BigDecimal price, int amount) {
        this.productName = productName;
        this.price = price;
        this.amount = amount;
    }

    String getProductName() {
        return productName;
    }

    BigDecimal getPrice() {
        return price;
    }

    int getAmount() {
        return amount;
    }

    BigDecimal calculateSubtotal() {
        return price.multiply(BigDecimal.valueOf(amount));
    }

    void applyDiscount(BigDecimal discount) {
        this.price = price.subtract(price.multiply(discount));
    }

}
