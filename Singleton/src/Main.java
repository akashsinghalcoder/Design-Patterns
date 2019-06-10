public class Main {
    public static void main(String[] args) {
        //SingletonDBConnection a = new SingletonDBConnection(); You can't instantiate the object like this because of private constructor
        SingletonDBConnection a = SingletonDBConnection.getInstanceOfSingletonDBConnection();
        System.out.println(a.hashCode());
        SingletonDBConnection b = SingletonDBConnection.getInstanceOfSingletonDBConnection();
        System.out.println(b.hashCode());
        SingletonDBConnection c;
		try {
			c = (SingletonDBConnection)b.clone();
	        System.out.println(c.hashCode());

		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        

     
    }
}
