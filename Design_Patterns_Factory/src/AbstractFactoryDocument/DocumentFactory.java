package AbstractFactoryDocument;

import AbstractFactoryDocument.parser.DocumentParser;
import AbstractFactoryDocument.printer.DocumentPrinter;
import AbstractFactoryDocument.processor.DocumentProcessor;

public abstract class DocumentFactory {

    public abstract DocumentType supportType();
    public abstract DocumentProcessor createProcessor(String documentName);
    public abstract DocumentParser createParser(String path);
    public abstract DocumentPrinter createPrinter(DocumentProcessor processor);
}
