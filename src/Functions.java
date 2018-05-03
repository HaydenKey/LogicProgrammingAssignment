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

    public boolean problem1d(boolean p, boolean q){
        boolean answer = false;

        //YOUR CODE START AFTER THIS LINE

        if (p==false || q==false)
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

        double raw = a/b;
        double excess = (a/b)%1;

        answer =  (int)(raw-excess);

        //YOUR CODE END BEFORE THIS LINE

        return answer;
    }

    //Compute ceiling value of a/b
    //DO NOT USE ADDITIONAL LIBRARY
    public int problem2b_ceil(int a, int b){
        int answer = 0;

        //YOUR CODE START AFTER THIS LINE

        answer = problem2a_floor(a,b) + 1;

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

        answer = recursiveAdd(a);

        //YOUR CODE END BEFORE THIS LINE

        return answer;
    }

    private int recursiveAdd(int current)
    {
        if(current == 1)
        {
            return current;
        }

        return current + recursiveAdd(current - 1);
    }

    //Use recursion to calculate multiplication of all integer from 1 to 'a'
    //USE MUST USE RECURSION
    public int problem3c_multiply(int a){


        //YOUR CODE START AFTER THIS LINE

        int answer = recursiveMultiply(a);

        a = answer;

        //YOUR CODE END BEFORE THIS LINE

        return answer;
    }

    private int recursiveMultiply(int current)
    {
        if(current == 1)
        {
            return current;
        }

        return current * recursiveMultiply(current - 1);
    }

    //Count the number of a-permutations from a set of size b (b > a)
    public int problem4_permutation(int a, int b){
        int answer = 0;

        //YOUR CODE START AFTER THIS LINE

        if (b < a)
        {
            System.out.println("b is less than a.  b needs to be greater than a.");
            return answer;
        }

        answer = recursiveMultiply(b)/recursiveMultiply((b-a));

        //YOUR CODE END BEFORE THIS LINE

        return answer;
    }
}
