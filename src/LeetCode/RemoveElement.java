package LeetCode;

public class RemoveElement {
    public int removeElement(int[] nums, int val){
        int i = 0;
        int j = 0;

        while (i<nums.length){
            if(nums[i]==val){
                i++;
                continue;
            }else{
                nums[j]=nums[i];
                i++;
                j++;
            }
        }
        return j;
    }
}
