class Solution {
    public double myPow(double x, int n) {
        long N = n;

        //For negative powers
        if(N < 0) {
            N = Math.abs(N);
            return 1 / (myPower(x, N));
        }
        else { //For positive powers
            return myPower(x, N);
        }
    }

    //Helper function
    double myPower(double x, long N) {
        //Base case
        if(N == 0){
            return 1;
        }

        //calculating half power
        double halfPower = myPower(x,N/2);

        if(N % 2 == 0) { //for even powers
            return halfPower * halfPower;
        }
        else { //for odd powers
            return x * halfPower * halfPower;
        }
    }
}