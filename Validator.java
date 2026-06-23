/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ourfirstbankuganda;

/**
 *
 * @author NORMZ
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class Validator {

    // Name validation
    public static boolean validateName(String name) {
        name = name.trim();
        return Pattern.matches("^[A-Za-z]{2,30}$", name);
    }

    // NIN validation
    public static boolean validateNIN(String nin) {
        nin = nin.trim();
        return Pattern.matches("^[A-Z0-9]{14}$", nin);
    }

    // Email validation
    public static boolean validateEmail(String email) {
        email = email.trim();
        return Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
    }

    // Confirm email
    public static boolean emailsMatch(String email, String confirmEmail) {
        return email.trim().equals(confirmEmail.trim());
    }

    // Phone validation (+256XXXXXXXXX)
    public static boolean validatePhone(String phone) {
        phone = phone.trim();
        return Pattern.matches("^\\+256\\d{9}$", phone);
    }

    // PIN validation (4-6 digits and not all identical)
    public static boolean validatePIN(String pin) {

        if (!Pattern.matches("^\\d{4,6}$", pin)) {
            return false;
        }

        char firstDigit = pin.charAt(0);

        boolean allSame = true;

        for (int i = 1; i < pin.length(); i++) {
            if (pin.charAt(i) != firstDigit) {
                allSame = false;
                break;
            }
        }

        return !allSame;
    }

    // Confirm PIN
    public static boolean pinsMatch(String pin, String confirmPin) {
        return pin.equals(confirmPin);
    }

    // Calculate age from DOB
    public static int calculateAge(int year, int month, int day) {

        LocalDate dob = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        return Period.between(dob, today).getYears();
    }

    // General age validation (18-75)
    public static boolean validateAge(int age) {
        return age >= 18 && age <= 75;
    }

    // Student account age validation (18-25)
    public static boolean validateStudentAge(int age) {
        return age >= 18 && age <= 25;
    }

    // Deposit validation
    public static boolean validateDeposit(double deposit, Account account) {
        return deposit >= account.minimumDeposit();
    }

}
    

