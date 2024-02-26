public class Order {


    private String item;
    private Integer quantity;
    private Double unitPrice;
    private PaymentMode discount;
    
    public PaymentMode getDiscount() {
        return discount;
    }


    public void setDiscount(PaymentMode discount) {
        this.discount = discount;
    }


    public Order(){}


    public Order(String item, Integer quantity, Double unitPrice, PaymentMode discount) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }


    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }


    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    public Double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }


    public Double getTotalAmount() {
        double total = 0.0;
        total = getQuantity() * getUnitPrice();
        double gd = getDiscount().determineDiscountRate();
        double totalAmount = total - (total * gd);
        return totalAmount;
    }
    public Double setTotalAmount(Double totalAmount) {
        return totalAmount ;
    }




}
