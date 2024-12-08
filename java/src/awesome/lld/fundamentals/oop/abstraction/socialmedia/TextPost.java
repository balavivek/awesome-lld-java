package awesome.lld.fundamentals.oop.abstraction.socialmedia;

/**
 * The TextPost class represents a specific type of social media post that contains text content.
 * It extends the SocialMediaPost class and provides an implementation for displaying the post.
 */
public class TextPost extends SocialMediaPost {

    /**
     * Initializes a new instance of the TextPost class with the specified content and timestamp.
     *
     * @param content The content of the text post.
     * @param timestamp The timestamp of when the post was created.
     */
    public TextPost(String content, long timestamp) {
        super(content, timestamp);
    }

    /**
     * Displays the text post by printing its content and timestamp.
     */
    @Override
    public void display() {
        System.out.println("Text Post: " + getContent() + " (Posted at: " + getTimestamp() + ")");
    }
}
