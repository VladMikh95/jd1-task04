package by.htp.triangle.bean;

/*
 * Описать  класс,  представляющий  треугольник.  Предусмотреть  методы  для  создания объектов,  
 * вычисления площади, периметра и точки пересечения медиан
 */
public class Triangle {
	
	private Point a;
	
	private Point b;
	
	private Point c;
	
	public Triangle(Point a, Point b, Point c) {
		if ((a.hashCode() == b.hashCode()) || (a.hashCode() == c.hashCode()) 
				|| (b.hashCode() == c.hashCode())) {
			System.out.println("Треугольника с такими координатами не может быть");
		} else {
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public  double calcPerimetr() {
		return Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) 
								+ (b.getY() - a.getY()) * (b.getY() - a.getY())) 
				+ Math.sqrt((c.getX() - a.getX()) * (c.getX() - a.getX()) 
						+ (c.getY() - a.getY()) * (c.getY() - a.getY()))
				+ Math.sqrt((c.getX() - b.getX()) * (c.getX() - b.getX()) 
						+ (c.getY() - b.getY()) * (c.getY() - b.getY()));
	}
	
	public double calcArea() {
		return ((a.getX() - c.getX()) * (b.getY() - c.getY()) 
				- (b.getX() - c.getX()) * (a.getY() - c.getY())) / 2;
	}
	
	public Point findPointOfIntersectionOfMedians() {
		Point result = new Point();
		result.setX((a.getX() + b.getX() + c.getX()) / 3);
		result.setY((a.getY() + b.getY() + c.getY()) / 3);
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (obj == null) {
			return false;
		}
		
		if (getClass() != obj.getClass()) {
			return false;
		}
		
		Triangle other = (Triangle) obj;
		if (a == null) {
			if (other.a != null) {
				return false;
			}
		} else if (!a.equals(other.a)) {
			return false;
		}
		
		if (b == null) {
			if (other.b != null) {
				return false;
			}
		} else if (!b.equals(other.b)) {
			return false;
		}
		
		if (c == null) {
			if (other.c != null) {
				return false;
			}
		} else if (!c.equals(other.c)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
		
}
