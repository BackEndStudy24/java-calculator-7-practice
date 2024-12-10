package calculator.model;

import calculator.utils.ServiceValidation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number {

    private List<Integer> nums = new ArrayList<>();
    private final Delimiter delimiter;

    public Number(Delimiter delimiter) {
        this.delimiter = delimiter;
    }

    public void extractNumbers(String rawInput) { // 이부분 공부좀 합시다 좀 신기하네요
        List<String> customDelimiter = delimiter.getCustomDelimiter();

        StringBuilder sb = new StringBuilder(",|:");
        for (String s : customDelimiter) {
            sb.append("|").append(s);
        }

        String[] strNums = rawInput.split(sb.toString());

        List<String> strNumList = Arrays.stream(strNums)
                .map(String::trim)
                .toList();

        for (String string : strNumList) {
            int parseNum = ServiceValidation.invalidNumberFormat(string);
            ServiceValidation.invalidNegativeNumber(parseNum);
            nums.add(parseNum);
        }

    }

}
