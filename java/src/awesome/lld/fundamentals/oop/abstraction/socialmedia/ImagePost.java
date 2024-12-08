package awesome.lld.fundamentals.oop.abstraction.socialmedia;

/**
     * The ImagePost class represents a specific type of social media post that contains an image.
     * It extends the SocialMediaPost class and provides an implementation for displaying the post.
     */
public class ImagePost extends SocialMediaPost {
    private String imageUrl; // Stores the URL of the image

    /**
     * Initializes a new instance of the ImagePost class with the specified content, timestamp, and image URL.
     *
     * @param content The content of the image post.
     * @param timestamp The timestamp of when the post was created.
     * @param imageUrl The URL of the image.
     */
    public ImagePost(String content, long timestamp, String imageUrl) {
        super(content, timestamp);
        this.imageUrl = imageUrl;
    }

    /**
     * Retrieves the URL of the image.
     *
     * @return The URL of the image.
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Displays the image post by printing its content, image URL, and timestamp.
     */
    @Override
    public void display() {
        System.out.println("Image Post: " + getContent() + " (Image URL: " + getImageUrl() + ", Posted at: " + getTimestamp() + ")");
    }
}
