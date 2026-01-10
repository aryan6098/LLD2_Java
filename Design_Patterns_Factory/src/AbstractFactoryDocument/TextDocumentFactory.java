package AbstractFactoryDocument;

import AbstractFactoryDocument.parser.DocumentParser;
import AbstractFactoryDocument.parser.TextDocumentParser;
import AbstractFactoryDocument.printer.DocumentPrinter;
import AbstractFactoryDocument.printer.TextDocumentPrinter;
import AbstractFactoryDocument.processor.DocumentProcessor;
import AbstractFactoryDocument.processor.TextDocumentProcessor;

public class TextDocumentFactory extends DocumentFactory{
    @Override
    public DocumentType supportType() {
        return DocumentType.TEXT;
    }

    @Override
    public DocumentProcessor createProcessor(String documentName) {
        return new TextDocumentProcessor(documentName);
    }

    @Override
    public DocumentParser createParser(String path) {
        return new  TextDocumentParser(path);
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor processor) {
        return new TextDocumentPrinter(processor);
    }
}
