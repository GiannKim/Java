class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }

  String creditCardType(String creditCard){
    if(creditCard.substring(0,1).equals("4")){
      return "Visa";
    }
    else if(creditCard.substring(0,2).equals("34") || creditCard.substring(0,2).equals("37")){
      return "American Express";
    }
    else if(creditCard.substring(0,2).equals("36")){
      return "Diner Club";
    }
    else if(creditCard.substring(0,2).equals("51") || creditCard.substring(0,2).equals("55")){
      return "Mastercard";
    }
    else if(creditCard.substring(0,4).equals("6011") || creditCard.substring(0,2).equals("65")){
      return "Discovery";
    }
  }

  String pigLatin(String word){
    return word.substring(1)+word.substring(0,1)+ "ay"
  }

  String nycLocate(String zip){
    if(zip.substring(0,3).equals("100") || zip.substring(0,3).equals("101") || zip.substring(0,3).equals("102")){
      return "Manhattan";
    }
  }

  boolean validatePswd(String pswd){
    if(pswd.length()>= 5 && pswd.length()<=8 && pswd.indexOf("*") == -1 && pswd.indexOf("^") == -1 && pswd.indexOf("(") == -1 && pswd.indexOf(")") == -1){
      return true
    }
  }