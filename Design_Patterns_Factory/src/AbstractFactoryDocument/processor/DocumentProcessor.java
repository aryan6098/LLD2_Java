package AbstractFactoryDocument.processor;

import AbstractFactoryDocument.DocumentType;

public abstract class DocumentProcessor {
    private String documentName;

    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return this.documentName;
    }

    public abstract void processDocument();
    public abstract DocumentType supportType();

}
