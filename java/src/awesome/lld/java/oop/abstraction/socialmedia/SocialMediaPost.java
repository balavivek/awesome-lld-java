package awesome.lld.java.oop.abstraction.socialmedia;


/**
 * The SocialMediaPost class is an abstract class that serves as a blueprint for creating different types of social media posts.
 * It encapsulates common properties and behaviors that all social media posts share, such as content and timestamp.
 * This class is designed to be extended by more specific types of social media posts, such as text posts or image posts.
 */
public abstract class SocialMediaPost {
    private String content; // Stores the content of the social media post
    private long timestamp; // Stores the timestamp of when the post was created

    /**
     * Initializes a new instance of the SocialMediaPost class with the specified content and timestamp.
     *
     * @param content The content of the social media post.
     * @param timestamp The timestamp of when the post was created.
     */
    public SocialMediaPost(String content, long timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }

    /**
     * Retrieves the content of the social media post.
     *
     * @return The content of the social media post.
     */
    public String getContent() {
        return content;
    }

    /**
     * Retrieves the timestamp of when the post was created.
     *
     * @return The timestamp of when the post was created.
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Abstract method that must be implemented by subclasses to define how the post is displayed.
     */
    public abstract void display();
}
