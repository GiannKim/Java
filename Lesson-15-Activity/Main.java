class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    
    
  }

  String spaces(int N){
    String space = ""
    for(int x=0; x<= N; x++){
      space += ""
    }
  }
  
  int harmonic(int N){
    int sum = 0
    for(int x = 1; x <= N; x++){
      sum += 1/x
    }
  }
}