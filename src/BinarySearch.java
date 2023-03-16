import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {3,5,9,10,15,20};
        System.out.println(binarySearchAscending(arr,9));

    }


    //35. Search Insert Position
    //Given a sorted array of distinct integers and a target value, return the index if the target is found.
    //if not, return the index where it would be if it were inserted in order.
    //You must write an algorithm with O(log n) runtime complexity.
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start+(end-start)/2;

            if (nums[mid] == target){
                return mid;
            }

            if (target > nums[mid]){
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }
        }

        return start;
    }


    //----------------------

    static int binarySearchOrderAgnostic(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        boolean isAsc = nums[start] < nums[end];

        while (start <= end){
            int mid = start+(end-start)/2;

            if (nums[mid] == target){
                return  nums[mid];
            }

            if (isAsc){
                if (target < nums[mid]){
                    end = mid -1;
                }
                else if (target > nums[mid]){
                    start = mid + 1;
                }else {
                    return nums[mid];
                }
            }
            else {
                if (target < nums[mid]){
                    start = mid +1;
                }
                else if (target > nums[mid]){
                    end = mid - 1;
                }else {
                    return nums[mid];
                }
            }

            //end while
        }
        return -1;
    }

    //----------------------

    static int binarySearchAscending(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start+end/2;

            if (target < nums[mid]){
                start = mid + 1;
            } else if (target > nums[mid] ) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    //----------------------

    static int binarySearchDescending(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start+(end-start)/2;

            if (target < nums[mid]){
                start = mid + 1;
            } else if (target > nums[mid] ) {
                end = mid - 1;
            }
            else {
                return nums[mid];
            }
        }
        return -1;
    }


    //------------------------
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums, target, true);
        ans[0] = search(nums, target, false);
        return ans;
    }

    static int search(int[] nums, int target, boolean isFirstIndexFind){
        int ans =-1;

        int start = 0;
        int end = nums.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < nums[mid]){
                end = mid-1;
            } else if (target > nums[mid]) {
                start = mid +1;
            }
            else {
                ans = mid;
                if (isFirstIndexFind){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }


        }

        return ans;
    }
    //----------------------


    static int[] matrixBiinarySearch(int[][] arr, int target){
        int row= 0;
        int column = arr.length - 1;

        while (row <= column && column >= 0){
            if (arr[row][column] == target){
                return new int[] {row,column};
            }
            if (arr[row][column] > target) {
                column--;
            }
            else {
                row++;
            }
        }



        return new int[]{-1,-1};
    }


    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < letters[mid]){
                end = mid -1;
            }
            else {

                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }

    //----------------------

}
