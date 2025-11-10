class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){


    
  }
  String rollDice(int dice1, int dice2){
    int dice1 = Math.random() * (6-1+1)+1;
    int dice2 = Math.random() * (6-1+1)+1;
    return dice1 + dice2
  }



}