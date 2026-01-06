package factoryDocument;

public class TextDocumentProcessor extends DocumentProcessor{

    private String documentName;

    public TextDocumentProcessor(String documentName) {
        super(documentName);
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.TEXT;
    }

    @Override
    public void processDocument() {
        System.out.println("Processing a text document: " + getDocumentName());
    }
}
