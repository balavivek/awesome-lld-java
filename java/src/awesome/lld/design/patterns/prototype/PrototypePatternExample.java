package awesome.lld.design.patterns.prototype;

public class PrototypePatternExample {
    public static void main(String[] args) {
        Document wordDoc = new WordDocument("This is a Word document.");
        Document clonedWordDoc = wordDoc.clone();
        wordDoc.print();
        clonedWordDoc.print();

        Document excelDoc = new ExcelDocument("This is an Excel document.");
        Document clonedExcelDoc = excelDoc.clone();
        excelDoc.print();
        clonedExcelDoc.print();
    }
}