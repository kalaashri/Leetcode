public class leetcode1 {

    public static void main(String[] args) {
        int n[]={2,7,11,15};
        int ans=9;
        int out[];
        out=twoSum(n,ans);
        for(int im=0;im<2;im++)
        {
            System.out.println(out[im]);
        }


    }
    public static int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++)
        {
            for (int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                    return new int[] {i,j};
            }
        }
        return null;
    }

}




