package factoryDocument;

public class SpreadsheetDocumentProcessor extends DocumentProcessor{

    private String documentName;

    public SpreadsheetDocumentProcessor(String documentName) {
        super(documentName);
        this.documentName = documentName;
    }

    public String getDocumentName() {
        return documentName;
    }

    @Override
    public DocumentType supportsType() {
        return DocumentType.SPREAD_SHEET;
    }

    @Override
    public void processDocument() {
        System.out.println("Processing a spreadsheet document: " + getDocumentName());
    }

    public void performDataAnalysis() {
        System.out.println("Performing data analysis on the spreadsheet.");
    }
}
