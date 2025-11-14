class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    
  }



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
  int allowance(){
    int days = 1;
    int penny = 1;
    while (!(500<penny)){
      penny += Math.pow(2, days);
      days += 1
    }
    return days;
  }

  int addTwoNumbers(){
    int n1 = randInt(1, 50);
    int n2 = randInt(1, 50);
    int ans = n1 + n2
    print("what is the answer to "+ n1 "+" + n2 "?");
    while(n1 + n2 != ans){
      ans = Input.readInt();
      if(n1+n2 == ans){
        print("Correct");
      }
      else{
        print("Incorrect, try again.");
      }
    }
  }

}