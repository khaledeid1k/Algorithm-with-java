package DependencyInjectionDesignAnotherExample;

/**
 * singleton to manage dependencies
 */
public class Injector {

    private static Injector instance = null;

    private Injector() {
    }

    public static Injector getInstance() {
        if (instance == null) {
            instance = new Injector();
        }
        return instance;
    }

    public Car getFiat() {
        return new CarImpl(60, "Fiat");
    }

    public Car getLambo() {
        return new CarImpl(200, "Lambo");
    }

    public Person getPerson() {
        return new PersonImpl(getFiat());
    }
}

