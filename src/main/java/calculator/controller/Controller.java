package calculator.controller;

import calculator.model.Delimiter;
import calculator.model.Number;
import calculator.utils.InputView;

public class Controller {

    final Delimiter delimiter = new Delimiter();
    final Number number = new Number(delimiter);

    public void start() {
        String rawNumbers = clientInput();
        addNumber(rawNumbers);
    }

    private String clientInput() {
        String rawInput = InputView.inputMessage();
        delimiter.setNewRawInput(rawInput);

        while (delimiter.getNewRawInput().contains("//")) {
           delimiter.extractCustomDelimiter(delimiter.getNewRawInput());
        }

        return delimiter.getNewRawInput();
    }

    private void addNumber(String rawNumbers) {
        number.extractNumbers(rawNumbers);
    }
}
