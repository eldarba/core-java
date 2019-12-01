package f.imports;

// importing static members (fields or methods) of a class
import static java.lang.Math.PI;
import static java.lang.Math.random;

public class Demo4StaticImport2 {

	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(PI * 10);
		System.out.println(random());
	}

}
