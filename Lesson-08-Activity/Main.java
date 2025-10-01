class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){

	double c = FtoC(100);
	System.out.println(c);

	double v = sphereVolume(2.5);
	System.out.println(v);

	double cv = coneVolume(5, 2);
	System.out.println(cv);

	double d = distance(10, 20, 5, 10);
	System.out.println(d);

  }
	void print(String n){
		System.out.println(n);
	}

	double FtoC(double f){
		double c = (f - 32) * (5.0 / 9);
		return c;
	}

	double sphereVolume(double r){
		double v = 4.0 / 3 * Math.PI * Math.pow(r, 3);
		return v;
	}

	double coneVolume(double r, double h){
		double cv = Math.PI * Math.pow(r ,2) * (h / 3.0);
		return cv;
	}

	double distance(double x1, double x2, double y1, double y2){
		double d = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
		return d;
	}
}