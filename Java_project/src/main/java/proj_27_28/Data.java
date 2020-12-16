package proj_27_28;

import java.util.List;

public class Data {

    private List<String> words;
    private List<Integer> numbers;
    private String delimeter;

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> number) {
        this.numbers = number;
    }

    public String getDelimeter() {
        return delimeter;
    }

    public void setDelimeter(String delimeter) {
        this.delimeter = delimeter;
    }
}
