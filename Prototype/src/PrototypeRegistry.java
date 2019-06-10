import java.util.HashMap;

public class PrototypeRegistry {
	private static HashMap<String,Color> registry = new HashMap<String, Color>();
	
	static {
		registry.put("blue", new BlueColor());
		registry.put("red", new RedColor());
	}
	
	public static Color returnColor(String colorName) {
		try {
			return (Color)registry.get(colorName).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	

}
