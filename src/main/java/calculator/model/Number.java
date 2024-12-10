package calculator.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number {

    private final static String COMMA = ",";
    private final static String COLON = ":";
    private List<Integer> nums = new ArrayList<>();
    private final Delimiter delimiter;

    public Number(Delimiter delimiter) {
        this.delimiter = delimiter;
    }

    public void extractNumbers(String rawInput) { // 이부분 공부좀 합시다 좀 신기하네요
        List<String> customDelimiter = delimiter.getCustomDelimiter();

        StringBuilder sb = new StringBuilder(",|:");
        for (int i = 0; i < customDelimiter.size(); i++) {
            sb.append("|").append(customDelimiter.get(i));
        }

        System.out.println(sb);

        String[] strNums = rawInput.split(sb.toString());
        System.out.println(Arrays.toString(strNums));


    }


    public void addNum(int num) {
        this.nums.add(num);
    }
}
