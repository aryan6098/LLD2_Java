package AbstractFactoryDocument.processor;

import AbstractFactoryDocument.DocumentType;

public class TextDocumentProcessor extends DocumentProcessor{

    public TextDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    public void processDocument() {
        System.out.println("Processing a text document: " + getDocumentName());
    }

    @Override
    public DocumentType supportType() {
        return DocumentType.TEXT;
    }
}
