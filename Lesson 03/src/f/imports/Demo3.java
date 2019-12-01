package f.imports;

// only one import per class name
import java.util.Date;

public class Demo3 {

	public static void main(String[] args) {
		Date d = new Date();
		// to use java.sql.Date we need the fully qualified name
		java.sql.Date d2 = new java.sql.Date(0);

	}

}
