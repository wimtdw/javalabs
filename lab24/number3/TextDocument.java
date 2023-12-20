package lab24.number3;

public class TextDocument implements IDocument {
    private String content;

    public TextDocument() {
        content = "";
    }

    @Override
    public void Open() {
        System.out.println("Opened the text document");
    }

    @Override
    public void Save() {
        System.out.println("Saved the text document");
    }

    @Override
    public void Close() {
        System.out.println("Closed the text document");
    }

    @Override
    public void Print() {
        System.out.println("Printed the text document");
    }

    public void Edit(String text) {
        content = text;
    }

    public String getContent() {
        return content;
    }
}
