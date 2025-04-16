package singlton;

public class SingletonImpl {
    private static volatile SingletonImpl instance;

    private SingletonImpl(){}

    public static SingletonImpl getInstance() {
        if (instance == null) {
            synchronized (SingletonImpl.class) {
                if (instance == null) instance = new SingletonImpl();
            }
        }
        return instance;
    }

}
