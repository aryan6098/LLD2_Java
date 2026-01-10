package AbstractFactoryDocument.parser;

import factoryDocument.DocumentType;

public class TextDocumentParser extends DocumentParser {

    public TextDocumentParser(String path) {
        super(path);
    }

    @Override
    public void parseDocument() {

    }

    @Override
    public DocumentType supportType() {
        return DocumentType.TEXT;
    }
}
