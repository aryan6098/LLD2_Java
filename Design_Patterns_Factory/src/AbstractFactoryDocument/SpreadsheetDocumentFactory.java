package AbstractFactoryDocument;

import AbstractFactoryDocument.parser.DocumentParser;
import AbstractFactoryDocument.parser.SpreadsheetDocumentParser;
import AbstractFactoryDocument.printer.DocumentPrinter;
import AbstractFactoryDocument.printer.SpreadsheetDocumentPrinter;
import AbstractFactoryDocument.processor.DocumentProcessor;
import AbstractFactoryDocument.processor.SpreadsheetDocumentProcessor;

public class SpreadsheetDocumentFactory extends DocumentFactory{
    @Override
    public DocumentType supportType() {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public DocumentProcessor createProcessor(String documentName) {
        return new SpreadsheetDocumentProcessor(documentName);
    }

    @Override
    public DocumentParser createParser(String path) {
        return new SpreadsheetDocumentParser(path);
    }

    @Override
    public DocumentPrinter createPrinter(DocumentProcessor processor) {
        return new SpreadsheetDocumentPrinter(processor);
    }


}
