package by.htp.student.main;

/*
 *  Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, 
 *  успеваемость (массив из пяти  элементов).  Создайте  массив  из  десяти  элементов  
 *  такого  типа.  Добавьте  возможность  вывода  фамилий  и номеров групп студентов, 
 *  имеющих оценки, равные только 9 или 10.
 */
public class Main {
	
	public static void main(String[] args) {
		View view = new View();
		StudentLogic logic = new StudentLogic();
		Student[] students = new Student[] {new Student("Иванов", "И.И.", 12345, new int[] {7, 8, 10, 9, 8}),
				new Student("Петров", "П.П.", 12345, new int[] {6, 8, 9, 7, 7}),
				new Student("Сидоров", "С.С.", 12345, new int[] {8, 8, 8, 7, 7}),
				new Student("Смолич", "А.А.", 12345, new int[] {10, 9, 9, 10, 10}),
				new Student("Чернышевич", "Ф.И.", 12345, new int[] {9, 10, 9, 9, 9}),
				new Student("Игнатьев", "Е.И.", 12345, new int[] {9, 8, 9, 7, 8}),
				new Student("Лещинский", "Ю.Д.", 12345, new int[] {9, 8, 7, 10, 7}),
				new Student("Михайлова", "Е.В.", 12345, new int[] {10, 10, 9, 10, 9}),
				new Student("Руснак", "А.Н.", 12345, new int[] {6, 8, 9, 7, 7}),};
		
		view.print(students);
		System.out.println("/////////////");
		view.printExcellentPupils(logic.getExcellentPupils(students));
				
	}
}
