package lambda;

public class TestPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate p = s -> s.length() > 10;
		
		Command c = s -> System.out.println(s);
		
		Generator g = () -> "Plop";
		
	}

}
