public class Main {
    public static int[] twoSum(int[] nums, int target) { // create the function
        for (int i = 0; i < nums.length - 1; i++){   // minus one to no got over the array
            for (int j = i + 1; j < nums.length; j++ ){ // to store and compare a second element
                if (nums[i] + nums[j] == target){   // finds the elements that will sum to target
                    return new int[]{i,j};  // returns the new elements into a new array
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[] nums = {1,4,8,3,9,11};
        int target = 10;
        int [] results = twoSum(nums, target);    // creates a new array to store the elements
        System.out.println(results[0] + "," + results[1]);    // prints out the array elements
    }
}