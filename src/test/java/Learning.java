import java.sql.SQLOutput;

public class Learning {

    public static void combineStrings1(String name, String action){
        System.out.println(name + " " + action);
        System.out.println(name + " " + action);
    }

    public static String combineStrings2(String name, String action){
        String sentence;
        sentence = name + " " + action;
        System.out.println(name + " " + action);
        return sentence;
    }

    public static void calculate(int digit1, int digi2, String phrasa){
        int sum;
        sum = digit1 * digi2 / digi2 + digit1;
        System.out.println(phrasa + " " + sum);
    }

    public static void completeCondition(){
        boolean requirement = true;
        System.out.println(requirement);
    }

    public static void typeChars(){
        char letter1 =  'a';
        char letter2 =  's';
        System.out.println(letter1 + letter2);
    }



    public static void main(String[] args) {
        String name = "Billy";
        String action = "is moving";
        String result = combineStrings2(name, action);
        //System.out.println(result);

        int digit1 = 123;
        int digi2 = 1000;
        calculate(digit1, digi2, result);
        //completeCondition();
        //typeChars();
    }
}
