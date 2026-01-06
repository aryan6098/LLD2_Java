package factoryDocument;

public class PresentationDocumentProcessor extends DocumentProcessor{

    private String documentName;

    public PresentationDocumentProcessor(String documentName) {
        super(documentName);
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return  documentName;
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.PRESENTATION;
    }

    @Override
    public void processDocument() {
        System.out.println("Processing a presentation document: " + getDocumentName());
    }

    public void addSlide() {
        System.out.println("Adding a slide to the presentation.");
    }
}
