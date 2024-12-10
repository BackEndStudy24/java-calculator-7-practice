package calculator.utils;

import calculator.constants.ErrorMessageType;

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

}
