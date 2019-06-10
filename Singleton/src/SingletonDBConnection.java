import java.io.Serializable;

public class SingletonDBConnection implements Cloneable, Serializable {

    static private SingletonDBConnection instance;

    public int getVariableForTestingSingletonClass() {
        return variableForTestingSingletonClass;
    }

    public void setVariableForTestingSingletonClass(int variableForTestingSingletonClass) {
        this.variableForTestingSingletonClass = variableForTestingSingletonClass;
    }

    int variableForTestingSingletonClass;



    private SingletonDBConnection() {

    }

    public static SingletonDBConnection getInstanceOfSingletonDBConnection() {
        SingletonDBConnection toBeReturned = instance;
        if(toBeReturned == null) {
            toBeReturned = new SingletonDBConnection();
            instance = toBeReturned;

        }
        return toBeReturned;
    }
    
    protected Object clone() throws CloneNotSupportedException {
    	return instance;
    }
    
    protected Object readResolve() 
    { 
        return instance; 
    } 
    
    
    
}
