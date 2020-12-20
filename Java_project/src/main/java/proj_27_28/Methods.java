package proj_27_28;

import java.util.List;

public class Methods {

    @AnnotationA(operation="sum")
    public void sum(Data data) {
        int sum = 0;
        List<Integer> values = data.getNumbers();
        for(Integer num : values)
        {
            sum += num;
        }
        System.out.println("Sum = " + sum);
    }

    @AnnotationA(operation="print")
    public void print(Data data) {
        List<String> values = data.getWords();
        String delimeter = data.getDelimeter();
        System.out.print("Result: ");
        for(int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i));
            if(i!=values.size()-1) {
                System.out.print(delimeter);
            }
        }
    }
}
