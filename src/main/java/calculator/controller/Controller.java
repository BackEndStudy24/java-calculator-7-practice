package calculator.controller;

import calculator.utils.InputView;

public class Controller {

    public void start() {
        clientInput();
    }

    private void clientInput() {
        String rawInput = InputView.inputMessage();
    }
}
