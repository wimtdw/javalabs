package lab19.number1;

public class INNValidator {
    public static void main(String[] args) {
        try {
            String fullName = "Иванов Иван Иванович";
            String inn = "1234567890";

            if (isValidINN(inn)) {
                System.out.println("ИНН " + inn + " действителен для клиента " + fullName);
            } else {
                System.out.println("ИНН " + inn + " недействителен для клиента " + fullName);
            }
        } catch (InvalidINNException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    public static boolean isValidINN(String inn) throws InvalidINNException {
        if (inn == null || !inn.matches("\\d{10}")) {
            throw new InvalidINNException("Недействительный ИНН: " + inn);
        }

        int[] weights = {2, 4, 10, 3, 5, 9, 4, 6, 8};
        int checksum = 0;

        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(inn.charAt(i));
            checksum += digit * weights[i];
        }

        checksum %= 11;
        if (checksum > 9) {
            checksum = 0;
        }

        int lastDigit = Character.getNumericValue(inn.charAt(9));

        if (checksum != lastDigit) {
            throw new InvalidINNException("Недействительный ИНН: " + inn);
        }

        return true; // ИНН прошел все проверки и считается действительным
    }
}
