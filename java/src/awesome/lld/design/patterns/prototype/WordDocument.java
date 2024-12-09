package awesome.lld.design.patterns.prototype;

/**
 * The WordDocument class implements the Document interface for Word documents.
 */
public class WordDocument implements Document {
    private String content;

    public WordDocument(String content) {
        this.content = content;
    }

    @Override
    public Document clone() {
        return new WordDocument(this.content);
    }

    @Override
    public void print() {
        System.out.println("Word Document Content: " + content);
    }
}