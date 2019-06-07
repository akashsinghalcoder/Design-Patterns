public class Main {
    public static void main(String[] args) {
        //SingletonDBConnection a = new SingletonDBConnection(); You can't instantiate the object like this because of private constructor
        SingletonDBConnection a = SingletonDBConnection.getInstanceOfSingletonDBConnection();
        System.out.print(a.getVariableForTestingSingletonClass());
        a.setVariableForTestingSingletonClass(40);
        System.out.print(a.getVariableForTestingSingletonClass());
        SingletonDBConnection b = SingletonDBConnection.getInstanceOfSingletonDBConnection();
        System.out.print(b.getVariableForTestingSingletonClass());
    }
}
