package calculator.utils;

import calculator.constants.ErrorMessageType;

import java.util.IllegalFormatException;

public class ServiceValidation {

    public static void invalidInputNull(String input) {
        if(input.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessageType.NULL_ERROR_MESSAGE.getMessage());
        }
    }

    public static void invalidNegativeNumber(int input) {
        if(input < 0) {
            throw new IllegalArgumentException(ErrorMessageType.NEGATIVE_NUMBER_ERROR_MESSAGE.getMessage());
        }
    }

    public static int invalidNumberFormat(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessageType.NUMBER_FORMAT_ERROR_MESSAGE.getMessage());
        }
    }

}
