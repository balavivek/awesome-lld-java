package awesome.lld.fundamentals.oop.abstraction.socialmedia;


public class SocialMediaApp {

    public static void main(String[] args) {
        // Create a new TextPost object
        TextPost textPost = new TextPost("Hello, world!", System.currentTimeMillis());

        // Create a new ImagePost object
        ImagePost imagePost = new ImagePost("Check out this cool image!", System.currentTimeMillis(), "http://example.com/image.jpg");

        // Display the text post
        textPost.display();

        // Display the image post
        imagePost.display();
    }
}
