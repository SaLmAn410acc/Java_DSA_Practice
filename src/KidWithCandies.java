

import java.util.ArrayList;
import java.util.List;

public class KidWithCandies {

    //    1431. Kids With the Greatest Number of Candies
//    There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
//    and an integer extraCandies, denoting the number of extra candies that you have.
//    Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
//    they will have the greatest number of candies among all the kids, or false otherwise.
//    Note that multiple kids can have the greatest number of candies.

//
//    Input: candies = [12,1,12], extraCandies = 10
//    Output: [true,false,true]

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int val = findMaxValue(candies);
        val = val - extraCandies;


        for (int i = 0; i < candies.length; i++) {
            if (candies[i] >= val) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }


    //not working
    static List<Boolean> kidsWithCandiesBruteForce(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();

        for (int candy : candies) {
            boolean chk = false;
            for (int j = 0; j < candies.length; j++) {
                if (candy + extraCandies >= candies[j]) {
                    chk = true;
                    break;
                }
            }

            if (chk == false) {
                list.add(false);
            } else {
                list.add(true);
            }
        }

        return list;
    }


    static int findMaxValue(int[] nums) {

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

}
