// constructor name-age
public class DogImm {
    private String name;
    private int age;
    public DogImm(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Immutable Dog: " +
                "name = '" + name + '\'' +
                ", age = " + age;
    }
}
