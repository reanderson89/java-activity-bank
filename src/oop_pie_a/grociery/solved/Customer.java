package oop_pie_a.grociery.solved;


import java.util.ArrayList;

public class Customer {
   private String name;
   private ArrayList<String> cart = new ArrayList<>();
   private int age;
    boolean broughtKids;
    boolean broughtPet;

    public Customer(String name, int age, boolean broughtKids, boolean broughtPet) {
        this.name = name;
        this.age = age;
        this.broughtKids = broughtKids;
        this.broughtPet = broughtPet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void addItemToCart(String item){
        System.out.println(this.name + " adds " + item + " to their cart.");
        this.cart.add(item);
    }

    public Customer checkoutAtRegister(){
        System.out.println(" ");
        System.out.println(this.name + " places their following items on the checkout stand.");
        System.out.println(this.cart);

        return this;
    }

    public void getManagerName(String name){
        System.out.println(name);
    }
//    public void askManagerSalary(GroceryStore store){
//        System.out.println(store.);
//    }


    public ArrayList<String> getCart() {
        return cart;
    }

    public void setCart(ArrayList<String> cart) {
        this.cart = cart;
    }
}
