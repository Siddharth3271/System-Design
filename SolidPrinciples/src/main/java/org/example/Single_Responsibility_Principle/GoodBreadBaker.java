package org.example.Single_Responsibility_Principle;

//Good Class
//more maintainable
//easier to understand
//easy to do changes and test in future without infecting others
class BreadBaker{
    public void bakeBread(){
        System.out.println("Baking high-quality bread...");
    }
}
class InventoryManager{
    public void manageInventory(){
        System.out.println("Managing inventory...");
    }
}
class SupplyOrder{
    public void orderSupplies(){
        System.out.println("Ordering Supplies....");
    }
}
class CustomerService{
    public void serveCustomer(){
        System.out.println("Serving Customers..");
    }
}
class BakeryCleaner{
    public void cleanBakery(){
        System.out.println("Cleaning the Bakery.....");
    }
}
public class GoodBreadBaker {
    public static void main(String[] args) {
        BreadBaker baker=new BreadBaker();
        InventoryManager inventoryManager=new InventoryManager();
        SupplyOrder supplyOrder=new SupplyOrder();
        CustomerService customerService=new CustomerService();
        BakeryCleaner bakeryCleaner=new BakeryCleaner();

        //each class focuses on its specific responsibility
        //changes in one doesn't affect unrelated parts
        baker.bakeBread();
        inventoryManager.manageInventory();
        supplyOrder.orderSupplies();
        customerService.serveCustomer();
        bakeryCleaner.cleanBakery();
    }
}
