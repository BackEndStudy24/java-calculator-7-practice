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
        delimiter.setNewRawInput(rawInput);

        while (delimiter.getNewRawInput().contains("//")) {
           delimiter.extractCustomDelimiter(delimiter.getNewRawInput());
        }

        String newRawInput = delimiter.getNewRawInput();

        System.out.println(newRawInput);
        System.out.println(delimiter.getCustomDelimiter());

    }
}
