import java.util.List;
import java.util.Map;
import java.util.Optional;

/*
 * Java 11 Local-Variable(var) with mix Sample example
 */

public class Example2 {
	
	public static void main(String[] args) {
		
		var name ="Vishal";
		System.out.println(name);
		var names = List.of("Vishal","Yogesh");
		System.out.println(names);
		
		String[] nameArray = names.toArray(String[]::new);
		System.out.println(nameArray.length);
		
		String currentTime =null;
		
		System.out.println(Optional.ofNullable(currentTime).isEmpty());
		
		var map = Map.of("Vishal","Pittsburgh","Yogesh","Gandhinagar");
		System.out.println(map);
		System.out.println(map.get("Vishal"));
	}
	
}
