package chapter3.E_variableMethod;

class Triangle{
	
	double underside;
	double height;
	double diagonal;
	
	double area;
	double circumference;
	
}

class TriangleMath{
	
	//넓이를 구하고, 둘레를 구하는 메소드
//	파라미터로 참조변수를 받는다면 메모리주소가 복사되어서 넘어오기 때문에
//	실제 작업도 해당 메모리 주소에서 작업을 진행함
//	실제 데이터가 변경됨
	static void setArea(Triangle triangle) {
		double area  = 0.5 * triangle.underside * triangle.height;
		triangle.area = area;
		//double area 이 메소드가 끝아면 이 변수가 사라짐. 
	}
	
	static void setDiagonal(Triangle triangle){
		
		double squareDiagonal = Math.pow(triangle.underside, 2) + Math.pow(triangle.height, 2);
		double diagonal = Math.sqrt(squareDiagonal);
		triangle.diagonal = diagonal;
	
		
	}
	
	static void setCircumference(Triangle triangle) {
		triangle.circumference = triangle.height + triangle.underside + triangle.diagonal;
	}
		
	static Triangle createTriangle(double underside, double height) { // 이 메소드를 써서 밑변과 높이를 받아오면 값이 지정된 인스턴스가 만들어지도록
		
		Triangle triangle = new Triangle(); // 주소를 반환해주기 때문에 쓸수있다.
		//근데 이건 힙영역에 생성이 되어진다. 위에 double area 랑은 생성되는 영역이 다르다.
		triangle.underside = underside;
		triangle.height = height;
		setDiagonal(triangle);
		setArea(triangle);
		setCircumference(triangle);
		
		return triangle;
	
	}
}

public class Method2 {

	public static void main(String[] args) {
		
		Triangle triangle1 = new Triangle();
		
		triangle1.underside = 3;
		triangle1.height = 4;
		triangle1.diagonal = 5;
		
		TriangleMath.setArea(triangle1);
		System.out.println(triangle1.area);
		
		
		Triangle triangle3 = TriangleMath.createTriangle(5, 5);
		System.out.println(triangle3.area);
		
		
		

	}

}

























