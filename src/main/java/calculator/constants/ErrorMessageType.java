package calculator.constants;

public enum ErrorMessageType {

    NULL_ERROR_MESSAGE("[ERROR] 공백은 입력할 수 없습니다. 다시 입력 해주세요."),
    NEGATIVE_NUMBER_ERROR_MESSAGE("[ERROR] 음수는 입력할 수 없습니다. 다시 입력 해주세요.");

    private final String message;

    ErrorMessageType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
