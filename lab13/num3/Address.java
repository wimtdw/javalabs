package lab13.num3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String addressString, String delimiter) {
        if (delimiter.equals(",")) {
            parseWithSplit(addressString, delimiter);
        } else {
            parseWithTokenizer(addressString, delimiter);
        }
    }

    private void parseWithSplit(String addressString, String delimiter) {
        String[] parts = addressString.split(delimiter);
        if (parts.length >= 1) {
            country = parts[0].trim();
        }
        if (parts.length >= 2) {
            region = parts[1].trim();
        }
        if (parts.length >= 3) {
            city = parts[2].trim();
        }
        if (parts.length >= 4) {
            street = parts[3].trim();
        }
        if (parts.length >= 5) {
            house = parts[4].trim();
        }
        if (parts.length >= 6) {
            building = parts[5].trim();
        }
        if (parts.length >= 7) {
            apartment = parts[6].trim();
        }
    }

    private void parseWithTokenizer(String addressString, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(addressString, delimiter);

        if (tokenizer.hasMoreTokens()) {
            country = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            region = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            city = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            street = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            house = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            building = tokenizer.nextToken().trim();
        }
        if (tokenizer.hasMoreTokens()) {
            apartment = tokenizer.nextToken().trim();
        }
    }

    @Override
    public String toString() {
        return "Country: " + country + "\n" +
                "Region: " + region + "\n" +
                "City: " + city + "\n" +
                "Street: " + street + "\n" +
                "House: " + house + "\n" +
                "Building: " + building + "\n" +
                "Apartment: " + apartment + "\n";
    }

    public static void main(String[] args) {
        String addressString1 = "Russia, Moscow, Moscow, Vernadskogo Street, 78, 1, 5";
        Address address1 = new Address(addressString1, ",");
        System.out.println("Address 1:\n" + address1);

        String addressString2 = "USA; California; Los Angeles; Hollywood Blvd.; 123; ; ";
        Address address2 = new Address(addressString2, "[,.;]");
        System.out.println("Address 2:\n" + address2);
    }
}
