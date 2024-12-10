package calculator.controller;

import calculator.model.Delimiter;
import calculator.model.Number;
import calculator.utils.InputView;

public class Controller {

    final Delimiter delimiter = new Delimiter();
    final Number number = new Number();

    public void start() {
        clientInput();
    }

    private void clientInput() {
        String rawInput = InputView.inputMessage();

        String newRawInput = delimiter.getCustomDelimiter(rawInput);

    }
}
