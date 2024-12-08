package awesome.lld.design.principles.srp;


import java.util.HashMap;
import java.util.Map;

/**
 * The UserRepository class handles user data storage and retrieval.
 */
public class UserRepository {
    private Map<String, User> userDatabase = new HashMap<>();

    /**
     * Adds a user to the repository.
     *
     * @param user The user to add.
     */
    public void addUser(User user) {
        userDatabase.put(user.getUsername(), user);
    }

    /**
     * Retrieves a user from the repository by username.
     *
     * @param username The username of the user to retrieve.
     * @return The user, or null if not found.
     */
    public User getUser(String username) {
        return userDatabase.get(username);
    }
}
