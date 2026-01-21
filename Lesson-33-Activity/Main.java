class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  CartItem item1 = new CartItem("Banana", 3.99, 6, false);
  CartItem item2 = new CartItem("Phone", 299.99, 1, true);
  CartItem item3 = new CartItem("Pencil", 3.99, 8, true);

  if (item1.onSale){
    System.out.println(item1.itemName + ": $" + item1.ItemPrice());
  }
  if(item2.onSale) {
    System.out.println(item2.itemName + ": $" + item2.ItemPrice());
  }
  if (item3.onSale) {
    System.out.println(item3.itemName + ": $" + item3.ItemPrice());
  }

  void init(){

  
    
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}