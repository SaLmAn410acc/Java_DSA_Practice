
public class TwoSum {

    public static void main(String[] args) {

    }


    //using two pointers to remove loop for n2 complexity
    static int[] twoSumUsingPointers(int[] nums, int target) {

        int n = nums.length;
        int []ans = new int[2];

        int i = 0;
        int j = i+1;

        while(i<j) {
            if(nums[i]+nums[j]==target){
                ans[0] = i;
                ans[1] = j;
                break;
            } else if(j==n-1) {
                i++;
                j = i+1;
            } else {
                j++;
            }
        }
        return ans;
    }

    //using bruteforce
    static int[] twoSum(int[] nums, int target) {


        int[] ans= new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
