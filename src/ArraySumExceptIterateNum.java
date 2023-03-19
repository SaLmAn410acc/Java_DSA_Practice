public class ArraySumExceptIterateNum {

    public static void main(String[] args) {
//        Input: nums = [1,2,3,4]
//        Output: [24,12,8,6]


    }

    static int[] productExceptSelf(int[] nums) {
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
}
