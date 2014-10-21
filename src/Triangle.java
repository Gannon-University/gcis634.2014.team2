public class Triangle {
	
	public static int triangleType(int a, int b, int c) {
		int type = 0; // init.  1=equilateral, 2=scalene, 3= isosceles, 4=NAT 
		
		if ((a < b + c) && (b < a + c) && (c < a + b) && (0 < a) && (a < 201) && (0 < b) && (b < 201) && (0 < c) && (c < 201)) {
			if ((a == b) && (b == c) && (a==c)){
				type = 1;   //equilateral 
			}
			else if (a != b && a != c && b != c){
				type = 2;   //scalene, no sides equal
			}
			else if(a==b && a==c || b==a && b==c || c==a && c==b ) {
				type = 3;   // isosceles triangle.  two sides equal
			}
		} else {
			type = 4;  //not t.
		}
		return type;
	}
}