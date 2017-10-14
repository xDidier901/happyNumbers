import java.text.DecimalFormat;
import java.util.ArrayList;

public class Calculos {

    ArrayList<String> results;
    boolean fistTime;
    DecimalFormat df;

    Calculos(){
        results = new ArrayList<>();
        df = new DecimalFormat("0.#");
    }

    public void calculateHappyNumber(String number){
        String[] algo = number.split("");
        int[] digits = new int[algo.length];
        int k =0;
        double num=0;
        while (num != 1){
            for (String n : algo){
                digits[k] = Integer.parseInt(n);
                k++;
            }
            k=0;
            for (double x : digits){
                double h = Math.pow(x,2);
                int i = Integer.parseInt(df.format(h));
                num += i;
            }
            int num2 = Integer.parseInt(df.format(num));
            num = num2;
            if (num2 == 1){
                System.out.println("Is a happy number");
                System.exit(0);
            } else {
                results.add(Integer.toString(num2));
                if (results.contains(""+num2))  {
                    System.out.println("Se te cicló carnal");
                    break;
                }
                calculateHappyNumber(Integer.toString(num2));
            }

        }
    }


}
