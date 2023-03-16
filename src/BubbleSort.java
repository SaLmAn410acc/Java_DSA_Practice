import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int[] nums){

        for (int i = nums.length-1 ; i >= 0; i--) {
            boolean swap = false;
            for (int j = 1; j <= i; j++) {
                if (nums[j-1] > nums[j]) {
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                    swap = true;
                }
            }

            if(swap == false){
                break;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
