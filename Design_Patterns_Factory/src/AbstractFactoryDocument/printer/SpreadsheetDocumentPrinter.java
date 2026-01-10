package AbstractFactoryDocument.printer;

import AbstractFactoryDocument.DocumentType;
import AbstractFactoryDocument.processor.DocumentProcessor;

public class SpreadsheetDocumentPrinter extends DocumentPrinter{

    public SpreadsheetDocumentPrinter(DocumentProcessor processor) {
        super(processor);
    }

    @Override
    public void printDocument() {
    }

    @Override
    public DocumentType supportType() {
        return DocumentType.SPREAD_SHEET;
    }
}
