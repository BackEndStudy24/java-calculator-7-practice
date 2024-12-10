package calculator.model;

import java.util.ArrayList;
import java.util.List;

public class Delimiter {

    private final static String COMMA = ",";
    private final static String COLON = ":";

    private List<String> customDelimiter = new ArrayList<>();

    public String getCustomDelimiter(String rawInput) {
        if(rawInput.startsWith("//") && rawInput.contains("\\n")) {

            int customMark = rawInput.indexOf("\\n");
            int slashMark = rawInput.indexOf("//");

            String cusDelimiter = rawInput.substring(slashMark+2, customMark);
            setCustomDelimiter(customDelimiter);


            return rawInput.substring(customMark+2);
        }
        return rawInput;
    }

    public void setCustomDelimiter(List<String> customDelimiter) {
        this.customDelimiter = customDelimiter;
    }

    public List<String> getCustomDelimiter() {
        return customDelimiter;
    }
}
