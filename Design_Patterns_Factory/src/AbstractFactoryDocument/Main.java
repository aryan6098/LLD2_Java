package AbstractFactoryDocument;

import AbstractFactoryDocument.parser.DocumentParser;
import AbstractFactoryDocument.printer.DocumentPrinter;
import AbstractFactoryDocument.processor.DocumentProcessor;

public class Main {

    public static void main(String[] args) {
        DocumentFactory factory = new TextDocumentFactory();
        DocumentProcessor processor = factory.createProcessor("notes.txt");
        DocumentParser parser = factory.createParser("/docs/notes.txt");
        DocumentPrinter printer = factory.createPrinter(processor);

        System.out.println(processor.getDocumentName());
        System.out.println(processor.supportType());
    }
}
