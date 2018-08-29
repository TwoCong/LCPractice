public class Day1 {
    public int singleNumber(int[] nums){

        int xor=0;
        for (int i=0;i<nums.length;i++) {
           xor =   nums[i]^xor;
        }
        return xor;

    }
}
