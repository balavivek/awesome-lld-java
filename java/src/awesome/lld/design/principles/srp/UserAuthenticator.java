package awesome.lld.design.principles.srp;


/**
 * The UserAuthenticator class handles user authentication.
 */
public class UserAuthenticator {
    private UserRepository userRepository;

    /**
     * Constructs a new UserAuthenticator.
     *
     * @param userRepository The UserRepository to use for authentication.
     */
    public UserAuthenticator(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Authenticates a user by username and password.
     *
     * @param username The username of the user.
     * @param password The password of the user.
     * @return True if authentication is successful, false otherwise.
     */
    public boolean authenticate(String username, String password) {
        User user = userRepository.getUser(username);
        return user != null && user.getPassword().equals(password);
    }
}
