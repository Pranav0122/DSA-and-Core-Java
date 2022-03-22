package MapQPS;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {-2, -2, 0, 4};
        for (int i = 0; i < arr.length - 3; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            for (int j = i + 1; j < arr.length - 2; j++) {
                if (j > i + 1 && arr[j] == arr[j - 1])
                    continue;
                int l = i + 1, r = arr.length - 1;
                while (l < r) {
                    int sum = arr[i] + arr[j] + arr[l] + arr[r];
                    if (sum == 0) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[l] + " " + " " + arr[r]);
                        l++;
                        r--;
                        while (l < r && arr[l] == arr[l - 1])
                            l++;
                    } else if (sum > 0) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
    }
}
