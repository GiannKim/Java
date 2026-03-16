
import java.io.IOException;
import java.sql.*;
//For compiling on the shell on repl: Same on mac
//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//Use for windows
//javac -cp sqlite-jdbc-3.23.1.jar; ServerExample.java
class Main {

 public static void main(String[] args)throws IOException{
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init() {
   

    String queryResult="";

    //String sql ="SELECT * FROM CR101 WHERE teacher1 = 'Banu';";

    //String sql = "SELECT * FROM CR101 WHERE teacher1 = 'Porchetta' AND period = 10;";

    //String sql = "SELECT COUNT(studentid) FROM cr101;";

    //String sql = "SELECT studentid, course, period FROM cr101 WHERE room IN (322,105,106,323) AND grade = 11;";

    //String sql = "SELECT * FROM cr101 WHERE course LIKE 'M%X';";

    Database db = new Database("jdbc:sqlite:students.db");
    queryResult = db.runSQL(sql, "table-auto");
    print(queryResult);

  }    
}