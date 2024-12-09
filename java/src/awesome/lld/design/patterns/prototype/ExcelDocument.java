package awesome.lld.design.patterns.prototype;

/**
 * The ExcelDocument class implements the Document interface for Excel documents.
 */
public class ExcelDocument implements Document {
    private String content;

    public ExcelDocument(String content) {
        this.content = content;
    }

    @Override
    public Document clone() {
        return new ExcelDocument(this.content);
    }

    @Override
    public void print() {
        System.out.println("Excel Document Content: " + content);
    }
}