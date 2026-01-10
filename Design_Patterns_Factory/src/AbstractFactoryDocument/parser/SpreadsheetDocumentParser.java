package AbstractFactoryDocument.parser;

import factoryDocument.DocumentType;

public class SpreadsheetDocumentParser extends DocumentParser{

    public SpreadsheetDocumentParser(String path) {
        super(path);
    }
    @Override
    public void parseDocument() {

    }

    @Override
    public DocumentType supportType() {
        return DocumentType.SPREAD_SHEET;
    }
}
