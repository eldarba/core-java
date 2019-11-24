package b;

public class App3SwitchGrades {

	public static void main(String[] args) {

		int grade = (int) (Math.random() * 15);
		System.out.println("grade: " + grade);

		switch (grade) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Fail");
			break;
		case 6:
		case 7:
			System.out.println("Pass");
			break;
		case 8:
		case 9:
		case 10:
			System.out.println("very good");
			break;
		default:
			System.out.println(grade + " is not a valid grade");
			break;
		}

	}

}
