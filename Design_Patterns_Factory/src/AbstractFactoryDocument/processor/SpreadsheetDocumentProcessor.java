package AbstractFactoryDocument.processor;

import AbstractFactoryDocument.DocumentType;

public class SpreadsheetDocumentProcessor extends DocumentProcessor{

    public SpreadsheetDocumentProcessor(String documentName) {
        super(documentName);
    }

    @Override
    public void processDocument() {
        System.out.println("Processing a spreadsheet document: " + getDocumentName());
    }

    @Override
    public DocumentType supportType() {
        return DocumentType.SPREAD_SHEET;
    }

    public void performDataAnalysis() {
        System.out.println("Performing data analysis on the spreadsheet.");
    }
}
