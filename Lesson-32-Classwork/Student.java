class Student{

  
  String firstName;
  int gradeLevel;
  double gpa;
  double[] grades;

  
  Student(String firstName, int gradeLevel, double gpa, 
          double[] grades){
    
    this.firstName  = firstName;
    this.gradeLevel = gradeLevel;
    this.gpa        = gpa;
    this.grades     = grades;
  }


  // class functions

  double calculateAvg(){
    double sum=0;
    for(int x=0; x<=this.grades.length-1;x++){
      sum+=this.grades[x];
    }
    return sum/this.grades.length;
  }

  boolean checkCourse(String course){
    for(x=0; x<this.courses.length;x++){
      if(this.courses[x].equals(course)){
        return true;
      }
    }
  }
  return false;

  
}