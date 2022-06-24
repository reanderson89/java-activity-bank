package oop_pie_a.grociery.solved;

import java.util.ArrayList;

public class GroceryStore {
   private int breadCount = 100;
   private int milkCount = 100;
   private int cerealCount = 100;
   private int eggCount = 100;
    String storeName;
    String managerName;
    private double managerSalary;

    public GroceryStore(String storeName, String managerName, double managerSalary) {
        this.storeName = storeName;
        this.managerName = managerName;
        this.managerSalary = managerSalary;
    }

    public void greetCustomer(String customerName){
        System.out.println("Welcome to "+this.storeName+" "+customerName+"!");
        System.out.println(" ");
    }

   public void makeTransaction(ArrayList<String> cart, String custName){
        cart.forEach(item -> {
            switch (item) {
                case "milk" -> this.milkCount -= 1;
                case "cereal" -> this.cerealCount -= 1;
                case "bread" -> this.breadCount -= 1;
                case "eggs" -> this.eggCount -= 1;
                default -> {
                    System.out.println(item + " does not exist in inventory.");
                }
            }
        });
        System.out.println("Your all set " + custName + " have a nice day!");
        System.out.println(" ");
    }

    private void checkInventory(){
        System.out.println("Current Inventory: ");
        System.out.println("milk: "+this.milkCount);
        System.out.println("eggs: "+this.eggCount);
        System.out.println("cereal: "+this.cerealCount);
        System.out.println("bread: "+this.breadCount);
        System.out.println(" ");
    }


    public static void main(String[] args) {
        GroceryStore safeway = new GroceryStore("safeway","joe bob",72223.23);
        Customer emily = new Customer("emily", 34, true, false);
        safeway.checkInventory();


        safeway.greetCustomer(emily.getName());


        System.out.println("Managers name is:");
        emily.getManagerName(safeway.managerName);
//        System.out.println("Managers Salary is:");
//        emily.askManagerSalary(safeway);

        emily.addItemToCart("milk");
        emily.addItemToCart("milk");
        emily.addItemToCart("bread");
        emily.addItemToCart("cereal");
        emily.addItemToCart("cereal");
        emily.addItemToCart("eggs");
        emily.addItemToCart("eggs");

        safeway.makeTransaction(emily.getCart(), emily.getName());
        safeway.checkInventory();

    }


}
