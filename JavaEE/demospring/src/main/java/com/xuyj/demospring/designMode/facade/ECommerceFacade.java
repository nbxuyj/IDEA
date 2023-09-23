package com.xuyj.demospring.designMode.facade;

public class ECommerceFacade {
    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;

    public ECommerceFacade() {
        inventory = new Inventory();
        payment = new Payment();
        shipping = new Shipping();
    }

    public void placeOrder(String productId, String paymentDetails, String shippingDetails) {
        if (inventory.isAvailable(productId) && payment.processPayment(paymentDetails)) {
            shipping.shipOrder(shippingDetails);
            System.out.println("下单成功：Order placed successfully!");
        } else {
            System.out.println("无法下单：Order could not be placed!");
        }
    }
}
