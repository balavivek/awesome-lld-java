package awesome.lld.design.principles.srp;


/**
 * The User class represents a user entity.
 */
public class User {
    private String username;
    private String password;
    private String email;

    /**
     * Constructs a new User.
     *
     * @param username The username of the user.
     * @param password The password of the user.
     * @param email The email of the user.
     */
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}