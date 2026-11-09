void main() {

    Solution solution = new Solution();
    int[] array = new int[4];
    array[0] = 2;
    array[1] = 7;
    array[2] = 11;
    array[3] = 15;


    IO.println((Arrays.toString(solution.twoSum(array, 9))));
    IO.println((solution.isPalindrome(195)));

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];

        for (int i0 = 0; i0 < nums.length; i0++){
            for (int i1 = 0; i1 < nums.length; i1++){
                if (i1 == i0){
                    continue;
                }
                if (nums[i0] + nums[i1] == target){
                    array[0] = i0;
                    array[1] = i1;
                    return array;
                }
            }
        }
    return array;
    }
}