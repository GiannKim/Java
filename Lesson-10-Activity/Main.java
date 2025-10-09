
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		System.out.println(gpa(80));
		System.out.println(gpa(95));
		System.out.println(isGraduating(12,46));
		System.out.println(BMI(120, 69));
		System.out.println(BMI(150, 69));
		System.out.println(BMI(180, 69));
		System.out.println(BMI(300, 69));
		System.out.println(shippingCost(5));
		System.out.println(shippingCost(12));
		System.out.println(shippingCost(20));
		System.out.println(shippingCost(30));

  }

	double gpa(double gpa){
		if(gpa > 90){
			return gpa * 1.1;
		}
		else{
			return gpa; 
		}
	}

	boolean isGraduating(int grade,int credits){
		if(grade == 12 && credits >= 44){
			return true;
		}
		else{
			return false;
		}
	}

	String BMI(double weight, double height){
		double bmi = weight / Math.pow(height, 2) * 703;
		if(bmi <= 18.4){
			return "Underweight";
		}
		else if(bmi >= 18.5 && bmi <= 24.9){
			return "Normal";
		}
		else if(bmi >= 25 && bmi <= 39.9){
			return "Overweight";
		}
		else{
			return "Obese";
		}
	}
	
	double shippingCost(double weight){
		if(weight <= 10){
			return 0.00;
		}
		else if(weight > 10 && weight <= 15){
			return 5.00;
		}
		else if(weight > 15 && weight <= 25){
			return 10.00;
		}
		else{
			return (weight - 25) * .02 + 10;
		}
	}

	

}