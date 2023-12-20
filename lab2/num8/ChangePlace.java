package lab2.num8;

public class ChangePlace {
    public static void main(String[] args) {
        String[] arr = {"hi1", "hi2", "hi3", "hi4", "hi5", "hi6", "hi7", "hi8", "hi9", "hi10"};
        int start = 0;
        int end = arr.length - 1;
        String temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (String element : arr) {
            System.out.print(element + " ");
        }
    }
}

