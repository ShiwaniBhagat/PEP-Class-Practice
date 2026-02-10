class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        long ans=1;
        for(int i=2;i<=n;i++){
            ans*=i;
        }
        return (int)ans;
    }
}
