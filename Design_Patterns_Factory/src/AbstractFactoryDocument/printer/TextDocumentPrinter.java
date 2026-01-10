package AbstractFactoryDocument.printer;

import AbstractFactoryDocument.DocumentType;
import AbstractFactoryDocument.processor.DocumentProcessor;

public class TextDocumentPrinter extends DocumentPrinter{

    public TextDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    @Override
    public void printDocument() {
    }

    @Override
    public DocumentType supportType() {
        return DocumentType.TEXT;
    }
}
