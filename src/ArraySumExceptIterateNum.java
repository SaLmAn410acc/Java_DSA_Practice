public class ArraySumExceptIterateNum {

    public static void main(String[] args) {
//        Input: nums = [1,2,3,4]
//        Output: [24,12,8,6]
    }

    static int[] productExceptSelfBrutrForce(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j = 0, product=1;

            while (j < nums.length){
                if (j != i){
                    product *= nums[j];
                }
                j++;
            }
            answer[i] = product;
        }
        return answer;

    }

    static int[] productExceptSelfPrefixAndSuffix(int[] nums) {

        int result [] = new int [nums.length];
        int runningProduct = 1;

        for(int i = 0; i < nums.length; i++){

            result[i] = runningProduct;
            runningProduct = runningProduct * nums[i];
        }

        runningProduct = 1;

        for(int i = nums.length -1 ; i >= 0; i--){


            result[i] = result[i] * runningProduct;
            runningProduct = runningProduct * nums[i];
        }
        return result;


    }
}
