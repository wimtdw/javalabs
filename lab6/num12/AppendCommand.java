package lab6.num12;

class AppendCommand implements Command {
    private String text;

    public AppendCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute(StringBuilder stringBuilder) {
        stringBuilder.append(text);
    }

    @Override
    public void undo(StringBuilder stringBuilder) {
        int length = text.length();
        stringBuilder.delete(stringBuilder.length() - length, stringBuilder.length());
    }
}

