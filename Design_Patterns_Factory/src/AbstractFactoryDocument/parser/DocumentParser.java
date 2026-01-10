package AbstractFactoryDocument.parser;

import factoryDocument.DocumentType;

public abstract class DocumentParser {

    private final  String path;

    protected DocumentParser(String path) {
        this.path = path;
    }

    public abstract void parseDocument();

    public String getPath() {
        return this.path;
    }

    public abstract DocumentType supportType();

}
