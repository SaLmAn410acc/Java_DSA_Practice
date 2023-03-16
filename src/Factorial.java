

public class Factorial {

    public static void main(String[] args) {


    }

    static float factorialcalculate(int val){
        int factorialValue = val;
        for (int i = factorialValue-1; i >= 1 ; i--) {
            factorialValue *= i;
        }
        return  factorialValue;
    }


    static float findingNcr(int n , int r){
//        nCr = n!/(r!*(n-r)!)
        float ncr ;
        ncr = factorialcalculate(n)/(factorialcalculate(r)*(factorialcalculate(n-r)));
        return ncr;
    }
}
