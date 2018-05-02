public class Functions {
    //Constructor
    public Functions() {
    }

    public boolean problem1a(boolean p, boolean q){
        boolean answer = false;

        //YOUR CODE START AFTER THIS LINE

        if (p == true && q == false)
        {
            return false;
        } else {
            return true;
        }

        //YOUR CODE END BEFORE THIS LINE

        return answer;
    }

    public boolean problem1b(boolean p, boolean q, boolean r){
        boolean answer = false;

        //YOUR CODE START AFTER THIS LINE

        if (p==false && q == true && r == true)
        {
            return true;
        } else {
            return false;
        }

        //YOUR CODE END BEFORE THIS LINE

        return answer;
    }

    public boolean problem1c(boolean p, boolean q, boolean r){
        boolean answer = false;

        //YOUR CODE START AFTER THIS LINE

        answer = true;

        //YOUR CODE END BEFORE THIS LINE

        return answer;
    }

    //Write your own function for problem 1d
    //YOUR CODE START AFTER THIS LINE

    public boolean problem1d(boolean p, boolean q, boolean r){
        boolean answer = false;

        //YOUR CODE START AFTER THIS LINE

        if (p==false && q==false)
        {
            answer = true;
        } else {
            answer = false;
        }

        //YOUR CODE END BEFORE THIS LINE

        return answer;
    }

    //YOUR CODE END BEFORE THIS LINE

    //Compute floor value of a/b
    //DO NOT USE ADDITIONAL LIBRARY
    public int problem2a_floor(int a, int b){
        int answer = a;

        //YOUR CODE START AFTER THIS LINE

        if (answer > b) {
            answer = 0;
        } else {
            while (answer < b)
            {
                answer = answer + a;
            }
            answer = answer - a;
        }
        //YOUR CODE END BEFORE THIS LINE

        return answer;
    }

    //Compute ceiling value of a/b
    //DO NOT USE ADDITIONAL LIBRARY
    public int problem2b_ceil(int a, int b){
        int answer = 0;

        //YOUR CODE START AFTER THIS LINE

        answer = (int)(a/b);

        //YOUR CODE END BEFORE THIS LINE

        return answer;
    }


    //Use recursion to calculate Fibonacci number
    //USE MUST USE RECURSION
    public int problem3a_fib(int a){
        int answer = 0;

        //YOUR CODE START AFTER THIS LINE

        int n1 = 1;
        int n2 = 1;
        int n3 = 0;


        for(int i = 2; i < a; i++)
        {
            n3 = n2 + n1;

            n1 = n2;
            n2 = n3;
        }

        answer = n3;

        //YOUR CODE END BEFORE THIS LINE

        return answer;
    }

    //Use recursion to calculate sum of all integer from 1 to 'a'
    //USE MUST USE RECURSION
    public int problem3b_sum(int a){
        int answer = 0;

        //YOUR CODE START AFTER THIS LINE

        for (int i = a; i > 0; i--)
        {
            a = a+(a-1);
        }

        //YOUR CODE END BEFORE THIS LINE

        return answer;
    }

    //Use recursion to calculate multiplication of all integer from 1 to 'a'
    //USE MUST USE RECURSION
    public int problem3c_multiply(int a){
        int answer = 1;

        //YOUR CODE START AFTER THIS LINE

        for (int i = a; i > 0; i--)
        {
            a = a+(a-1);
        }

        //YOUR CODE END BEFORE THIS LINE

        return answer;
    }

    //Count the number of a-permutations from a set of size b (b > a)
    public int problem4_permutation(int a, int b){
        int answer = 0;

        //YOUR CODE START AFTER THIS LINE



        //YOUR CODE END BEFORE THIS LINE

        return answer;
    }
}
