

public class CheckPerfectNumber {

    static void checkPerfectNumber(int num){
        int sum = 0;
        for (int i = 1; i < num; i++) {

            if (num%i == 0){
                sum = sum+i;
            }
        }

        if (sum == num){
            System.out.println(num + " is a perfect number");
        }
        else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
