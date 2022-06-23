# Grocery Store

* For this activity you are tasked to build out the GroceryStore class and the Customer class. Eventually we will have a Customer "enter" the GroceryStore. (We will create an instance of a Customer in the GroceryStore class).
Once the Customer is in the store they will proceed to add items to their cart. When they have all the items they need, they will check out at the register and leave with their goods.

* This is good practice for creating classes and having them interact but also think about if the information you are creating should be public, private, or protected depending on who is accessing it.

* The GroceryStore should have some defining properties as well, for example:
  - inventoryOfSomeProduct (required) (Make at least 4 properties like this so the store has things to sell).
  - store name (required)
  - manager name (required)
  - manage salary (required)
* The GroceryStore should also have at least 2 methods,
  - greetCustomer(), where the store welcomes the customer by their name. Should the store have direct access to the Customers' name?
  - makeTransaction(), where the store sells the customer the goods (no math needed for the groceries) and depletes it from their inventory.

* The Customer class should have some defining properties, for example: (Should the Customers' information be publicly available? If not, make sure we have ways to get their information if we need it.)
  - name (required)
  - cart (required)(start by using an ArrayList<String> for the type)
  - age (optional)
  - hasKids (optional)
  - hasPets (optional)
    (add in any other properties that you would like)
* The Customer should also have at least two methods,
  - askManagersName(), this should return the name of the manager from the store the Customer is visiting
  - askManagerSalary(), this should try to return the salary of the manager at the store the Customer is visiting. Should this information be given to the Customer? You should have your program built in such a way that this throws an error. Inevitably you will get rid of this method.
  - addItemToCart(), which grabs an item from the store and adds it to the cart
  - checkoutAtRegister(), which allows the Customer to "purchase" their items. (no actual math required yet, just print something to the terminal)



