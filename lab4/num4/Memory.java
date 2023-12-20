package lab4.num4;


public class Memory {
    private int sizeGB;
    private String type;

    public Memory(int sizeGB, String type) {
        this.sizeGB = sizeGB;
        this.type = type;
    }

    public int getSizeGB() {
        return sizeGB;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Memory: " + sizeGB + " GB, Type: " + type;
    }
}

