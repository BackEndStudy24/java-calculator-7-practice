package calculator.model;

import java.util.ArrayList;
import java.util.List;

public class Delimiter {

    private final List<String> customDelimiter = new ArrayList<>();
    private String newRawInput;

    public void extractCustomDelimiter(String rawInput) {
        if(rawInput.startsWith("//") && rawInput.contains("\\n")) {

            int customMark = rawInput.indexOf("\\n");
            int slashMark = rawInput.indexOf("//");

            String cusDelimiter = rawInput.substring(slashMark+2, customMark);

            addCustomDelimiter(cusDelimiter);
            setNewRawInput(rawInput.substring(customMark+2));

        }
    }

    public void addCustomDelimiter(String cusDelimiter) {
        this.customDelimiter.add(cusDelimiter);
    }

    public List<String> getCustomDelimiter() {
        return customDelimiter;
    }

    public void setNewRawInput(String newRawInput) {
        this.newRawInput = newRawInput;
    }

    public String getNewRawInput() {
        return newRawInput;
    }
}
