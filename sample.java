// Problem 1 - Candy
// Time Complexity : O(2n) where n = length of array
// Space Complexity : O(1)

// Your code here along with comments explaining your approach
// 1 - fill initially array with 1
// 2 - loop over array from left to right
// 3 - if curr element is greater than previous element, then current equals previous element + 1
// 4 - loop over array from right to left
// 5 - if current element is greater than its next element, then current element is max of current and next + 1
// 6 - loop over result array
// 7 - keep adding the candy count
// 8 - return count
class Solution {
    public int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return 0;
        }
        
        int[] result = new int[ratings.length];
        Arrays.fill(result, 1); // 1
        int count = 0;
        
        // curr > left // 2
        for (int i=1; i<ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) { // 3
                result[i] = (result[i - 1] + 1);
            }
        }
        
        // curr > right // 4
        for (int i=ratings.length-2; i>=0; i--) {
            if (ratings[i] > ratings[i + 1]) { // 5
                result[i] = Math.max(result[i], result[i + 1] + 1);
            }
        }
        // 6
        for (int c : result) {
            count += c; // 7
        }
        // 8
        return count;
    }
}

// Problem 2 - Task Scheduler
// Time Complexity : 
// Space Complexity :

// Your code here along with comments explaining your approach
