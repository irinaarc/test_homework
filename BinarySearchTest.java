package Algorithms;

public class BinarySearchTest {
        public int search(int[] nums, int target) {
            int lastIndex = nums.length - 1;
            int firstIndex = 0;

            while(firstIndex <= lastIndex) {
                int middleIndex = (lastIndex + firstIndex) / 2;

                if (nums[middleIndex] == target) {
                    return middleIndex;
                }

                else if (nums[middleIndex] > target) {
                    lastIndex = middleIndex - 1;
                }

                else if (nums[middleIndex] < target) {
                    firstIndex = middleIndex + 1;

                }
            }

            return -1;



        }
}
