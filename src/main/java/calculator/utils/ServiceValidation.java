package calculator.utils;

import calculator.constants.ErrorMessageType;

public class ServiceValidation {

    public static void invalidInputNull(String input) {
        if(input.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessageType.NULL_ERROR_MESSAGE.getMessage());
        }
    }

}
