package lab18.number5678;

import java.util.Objects;
import java.util.Scanner;

public class TestThrows {
    static public void getKey(){
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        try {
            printDetails(key);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    static public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println( message );
        }
        catch (Exception e){
            throw e;
        }
    }
    static private String getDetails(String key) throws Exception {
        if(Objects.equals(key, "empty")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(k);
        for(int i = 0; i < k; i ++){
            getKey();
        }
    }

}
