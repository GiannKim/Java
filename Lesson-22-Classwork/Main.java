class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[] friends = {Joe, Tom, James, Rudolph, Mary};

    double[] tempC = {-4.5, 0, 23, 34, 5, 10};

    double[] tempF = convert(tempC);
    for(int x = 0; x<tempF.length; x++)
      print(tempF[i]);
    
  }

  double[] convert(double[] c){
    double f = new double[c.length]
    for(int x = 0; x<c.length; x++){
      f[i] = c[i] * 9/5 + 32;
    }
    return f;
  }

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}