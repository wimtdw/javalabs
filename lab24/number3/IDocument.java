package lab24.number3;

public interface IDocument {
    void Open();
    void Save();
    void Close();
    void Print();

    String getContent();

    void Edit(String text);
}
