package by.htp.test.model;

/*
 *  Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих 
 *  переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который 
 *  находит наибольшее значение из этих двух переменных
 */

public class Test1 {
	
	private int a;
	
	private int b;
	
	public void printAB() {
		System.out.println("Переменная а = " + a);
		System.out.println("Переменная b = " + b);
	}
	
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int max(int a, int b) {
		return Math.max(a, b);
	}

}
