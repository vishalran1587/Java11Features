import java.util.stream.Collectors;

/*
 * Java 11 String methods Sample example
 */

public class Example1 {
	
	public static void main(String[] args) {
		
		blankMethod();
		linesMethod();
		stripMethods();
		repeatMethod();
	}
	
	public static void blankMethod() {
		String first = "";
		String second="Vishal";
		System.out.println("******Blank Method******");
		System.out.println(first.isBlank());
		System.out.println(second.isBlank());
	}
	
	public static void linesMethod() {
		String names="Vishal\nVishal\nVishal";
		System.out.println("******Lines Method******");
		System.out.println(names);
		System.out.println(names.lines().collect(Collectors.toList()));
	}
	
	public static void stripMethods() {
		String names=" Vishal ";
		System.out.println("******Strip Methods******");
		System.out.println("Start" + names.strip()+"End");
		System.out.println("Start" + names.stripLeading()+"End");
		System.out.println("Start" + names.stripTrailing()+"End");
	}
	
	public static void repeatMethod() {
		String names="Vishal".repeat(2);
		System.out.println("******Repeat Method******");
		System.out.println(names);
	}

}
