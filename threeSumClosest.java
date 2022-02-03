import java.util.Arrays;

public class threeSumClosest {
    public int threeSumC(int[] num, int target) {
        int result = num[0] + num[1] + num[num.length -1];
        Arrays.sort(num);
        for (int i = 0 ; i < num.length-2; i++) {
            int start = i+1, end = num.length-1;
            while(start < end) {
                int sum = num[i] + num[start] + num[end];
                if(sum > target)
                    end--;
                else
                    start++;
                if (Math.abs(sum-target) < Math.abs(result-target))
                    result = sum;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        threeSumClosest ts = new threeSumClosest();
        int result1 = ts.threeSumC(nums,1);
        System.out.println(result1);
    }
}
