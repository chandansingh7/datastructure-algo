package goldman;

public class TrappingRainWater {

    public static int trap(int[] height) {

        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = height[0];
        right[n-1] = height[n-1];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i-1], height[i]);
        }

        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i+1], height[i]);
        }

        int answer = 0;

        for (int j = 0; j < n-1; j++) {

            answer += (Math.min(left[j], right[j])) - height[j];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
