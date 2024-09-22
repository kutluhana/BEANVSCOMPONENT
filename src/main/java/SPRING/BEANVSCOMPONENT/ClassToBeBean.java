package SPRING.BEANVSCOMPONENT;

public class ClassToBeBean {

    private final String name;

    public ClassToBeBean(String name) {
        this.name = name;
        System.out.println("My name is: " + this.getName());
    }

    public String getName() {
        return name;
    }
}
