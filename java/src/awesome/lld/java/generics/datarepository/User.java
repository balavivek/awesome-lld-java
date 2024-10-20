package awesome.lld.java.generics.datarepository;

/**
 * The User class represents a user entity.
 */
public class User {
    private String name;
    private int age;

    /**
     * Constructs a new User.
     *
     * @param name The name of the user.
     * @param age The age of the user.
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}
