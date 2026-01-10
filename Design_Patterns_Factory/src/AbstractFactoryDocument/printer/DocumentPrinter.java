package AbstractFactoryDocument.printer;

import AbstractFactoryDocument.DocumentType;
import AbstractFactoryDocument.processor.DocumentProcessor;

public abstract class DocumentPrinter {

    private final DocumentProcessor processor;

    public DocumentPrinter(DocumentProcessor processor) {
        this.processor = processor;
    }

    public DocumentProcessor getProcess() {
        return this.processor;
    }

    public abstract void printDocument();

    public abstract DocumentType supportType();
}
