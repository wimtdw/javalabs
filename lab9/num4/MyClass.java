package lab9.num4;

class MyClass implements MyComparable<MyClass> {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(MyClass other) {
        // Сравниваем объекты по их значениям
        return Integer.compare(this.value, other.getValue());
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "value=" + value +
                '}';
    }
}

