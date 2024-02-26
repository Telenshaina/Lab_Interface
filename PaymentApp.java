public class PaymentApp {
    public static void main(String[] args) {

        Order p1 = new Order("Keyboard",10,300.0,new Gcash());
        System.out.println("Order item is " + p1.getItem());
        System.out.println("Unit price is " + p1.getUnitPrice());
        System.out.println("Quantity is " + p1.getQuantity());
        System.out.println("\nPayment order details if " + p1.getDiscount().getClass().getSimpleName());
        System.out.println("Discount rate is " +p1.getDiscount().determineDiscountRate());
        System.out.println("Payment amount is " + p1.getTotalAmount());


        Order p2 = new Order("Keyboard",10,300.0,new Maya());
        System.out.println("\nPayment order details if " + p2.getDiscount().getClass().getSimpleName());
        System.out.println("Discount rate is " +p2.getDiscount().determineDiscountRate());
        System.out.println("Payment amount is " + p2.getTotalAmount());


        Order p3 = new Order("Keyboard",10,300.0,new ShopeePay());


        System.out.println("\nPayment order details if " + p3.getDiscount().getClass().getSimpleName() );
        System.out.println("Discount rate is " + p3.getDiscount().determineDiscountRate());
        System.out.println("Payment amount is " + p3.getTotalAmount());






    }
}
