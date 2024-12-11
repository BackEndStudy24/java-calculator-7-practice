package calculator.controller;

import calculator.model.Delimiter;
import calculator.model.Number;
import calculator.view.InputView;
import calculator.utils.ServiceValidation;


public class Controller {

    final Delimiter delimiter = new Delimiter();
    final Number number = new Number(delimiter);

    public void start() {
        runWithRetry(this::clientInput);
        addNumber();
    }

    private void clientInput() {
        String rawInput = InputView.inputMessage();
        ServiceValidation.invalidInputNull(rawInput);
        delimiter.setNewRawInput(rawInput);

        while (delimiter.getNewRawInput().contains("//")) {
           delimiter.extractCustomDelimiter(delimiter.getNewRawInput());
        }

    }

    private void addNumber() {
        String rawInput = delimiter.getNewRawInput();
        number.extractNumbers(rawInput);
        System.out.printf("결과 : %d", number.getTotalValue());
    }

    private void runWithRetry(Runnable serviceMethod) {
        boolean success = false;
        while (!success) {
            try {
                serviceMethod.run();
                success = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
