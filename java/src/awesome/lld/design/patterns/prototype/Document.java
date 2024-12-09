package awesome.lld.design.patterns.prototype;

/**
 * The Document interface defines a method for cloning documents.
 */
public interface Document extends Cloneable {
    Document clone();
    void print();
}