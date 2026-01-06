package factoryDocument;

public class Client {
    public static void main(String[] args) {
        DocumentProcessor processor = DocumentProcessorFactory.createDocument(DocumentType.TEXT, "Notes.txt");
        processor.processDocument();
    }
}
