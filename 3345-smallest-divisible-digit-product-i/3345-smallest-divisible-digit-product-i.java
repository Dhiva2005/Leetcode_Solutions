class Solution {
    public int smallestNumber(int n, int t) {
        if (n == 0) {
            return n;
        }
        while (help(n) % t != 0) {
            n++;
        }
        return n;
    }

    public int help(int n) {
        int digit = 1;
        while (n > 0) {
            int rem = n % 10;
            digit *= rem;
            if (rem == 0) {
                return 0;
            }
            n /= 10;
        }
        return digit;
    }
}