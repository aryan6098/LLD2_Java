package factoryDocument;

public class DocumentProcessorFactory {

    public static DocumentProcessor createDocument(DocumentType documentType, String  documentName) {
        return switch (documentType) {
            case TEXT -> new TextDocumentProcessor(documentName);
            case SPREAD_SHEET -> new SpreadsheetDocumentProcessor(documentName);
            case PRESENTATION -> new PresentationDocumentProcessor(documentName);
            default -> null;
        };
    }
}
