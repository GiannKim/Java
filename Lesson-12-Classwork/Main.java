class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   

    
  }

  String collegeCredit(String courseCode){
    if(courseCode.substring(6,7).equals("E")||("M"))
    System.out.println("True");
    if(!courseCode.substring(6,7).equals("E")||("M"))
    System.out.println("False");
    }

  }

  String getCounselor(String class){
    if(class.substring(0,1).equals("C") || class.substring(class.length()/2).equals("C"))
    System.out.println("Chu");
  }

  String imageType(String imageFile){
    if(imageFile.equals("JPEG") || image.File.equals("JPG"))
    System.out.println("Joint Photographic Experts Group");
  }