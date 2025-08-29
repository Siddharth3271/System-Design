package org.example.Single_Responsibility_Principle;


//Bad Class
//Reducing Readability
//increasing complexity
//debugging difficult
public class BadBreadBaker {
    public void bakeBread(){
        System.out.println("Baking high-quality bread...");
    }

    public void manageInventory(){
        System.out.println("Managing inventory...");
    }

    public void orderSupplies(){
        System.out.println("Ordering Supplies....");
    }

    public void serveCustomer(){
        System.out.println("Serving Customers..");
    }

    public void cleanBakery(){
        System.out.println("Cleaning the Bakery.....");
    }

    public static void main(String[] args) {
        BadBreadBaker baker=new BadBreadBaker();
        baker.bakeBread();
        baker.manageInventory();
        baker.orderSupplies();
        baker.serveCustomer();
        baker.cleanBakery();
    }
}
