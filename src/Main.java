public class Main {
    public static void main(String[] args){
        Functions f = new Functions();
        double points = 0;

        //Problem 1a grading
        try{
            if (f.problem1a(true, true) == true){
              points += 2.5;
              System.out.println("You got problem 1a correct 2.5 points");
            }
        }catch (Exception e) {
            System.out.println("Exception Error Problem 1a");
        }

        //Problem 1b grading
        try{
            if (f.problem1b(true, true, true) == false){
                points += 2.5;
                System.out.println("You got problem 1b correct 2.5 points");
            }
        }catch (Exception e) {
            System.out.println("Exception Error Problem 1b 2.5 points");
        }

        //Problem 1c grading
        try{
            if (f.problem1c(true, true, true) == true){
                points += 2.5;
                System.out.println("You got problem 1c correct 2.5 points");
            }
        }catch (Exception e) {
            System.out.println("Exception Error Problem 1c");
        }

        //Problem 1d grading
        // Uncomment the following lines after you finish writing problem1d in Functions.java
      //  try{
      //      if (f.problem1d(true, true) == false){
      //          points += 2.5;
      //          System.out.println("You got problem 1d correct 2.5 points");
      //        }
      //  }catch (Exception e) {
      //      System.out.println("Exception Error Problem 1d");
      //  }

        //Problem 2a grading
        try{
            if (f.problem2a_floor(5, 3) == 1){
                points += 10;
                System.out.println("You got problem 2a correct 10 points");
            }
        }catch (Exception e) {
            System.out.println("Exception Error Problem 2a");
        }

        //Problem 2b grading
        try{
            if (f.problem2b_ceil(5, 3) == 2){
                points += 10;
                System.out.println("You got problem 2b correct 10 points");
            }
        }catch (Exception e) {
            System.out.println("Exception Error Problem 2b");
        }

        //Problem 3a grading
        try{
            if (f.problem3a_fib(6) == 8){
                points += 15;
                System.out.println("You got problem 3a correct 15 points");
            }
        }catch (Exception e) {
            System.out.println("Exception Error Problem 3a");
        }

        //Problem 3b grading
        try{
            if (f.problem3b_sum(5) == 15){
                points += 15;
                System.out.println("You got problem 3b correct 15 points");
            }
        }catch (Exception e) {
            System.out.println("Exception Error Problem 3b");
        }

        //Problem 3c grading
        try{
            if (f.problem3c_multiply(4) == 24){
                points += 15;
                System.out.println("You got problem 3c correct 15 points");
            }
        }catch (Exception e) {
            System.out.println("Exception Error Problem 3c");
        }

        //Problem 4 grading
        try{
            if (f.problem4_permutation(5, 8) == 6720){
                points += 25;
                System.out.println("You got problem 4 correct 25 points");
            }
        }catch (Exception e) {
            System.out.println("Exception Error Problem 4");
        }

        System.out.println("Your total score: " + points);
    }
}
