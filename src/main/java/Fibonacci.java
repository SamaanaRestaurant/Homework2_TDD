public class Fibonacci {

    //1 1 2 3 5 8 13 21 34 55
    //0 1 2 3 4 5 6  7  8  9 - zero based index
    public static int computeRecursive(int index) {
        if (index < 0){
            throw new RuntimeException();
        }
        if (index == 0 || index == 1){
            return 1; // return index
        }
        return computeRecursive(index - 1) + computeRecursive(index - 2);
    }


    public static int computeNonRecursive(int index) {
        if (index < 0){
            throw  new RuntimeException();
        }
        if(index == 0 || index == 1){
            return 1; // return index
        }
        int first = 1; //1
        int second = 1;//1
        int nth = 1;//2

        for (int i = 2; i <= index; i++) {
            nth = first + second;
            first = second;
            second = nth;
        }
        return nth;
    }


    //Recursion vs. Iteration
    public static void main(String[] args) {
         //int index = 30;
         int index = 50;
         //computeRecursive
         long start1 = System.currentTimeMillis();
         int result1 = computeRecursive(index);
         long end1 = System.currentTimeMillis();
         System.out.println("computeRecursive:f("+ index + ") = " + result1 + ":time = " + (end1 - start1)+" ms");
         //computeRecursive:f(30) = 832040:time = 16 ms
        //computeRecursive:f(50) = -298632863:time = 114542 ms

        //computeNonRecursive
        long start2 = System.currentTimeMillis();
        int result2 = computeNonRecursive(index);
        long end2 = System.currentTimeMillis();
        System.out.println("computeNonRecursive:f("+ index + ") = " + result2 + ":time = " + (end2 - start2)+" ms");
        //computeNonRecursive:f(30) = 832040:time = 0 ms
        //computeNonRecursive:f(50) = -298632863:time = 0 ms

       //4. Which one is faster?
        //computeNonRecursive

//        5. What happens when index = 50?
//                - Think about possible explanations

        //The execution time raises a lot at computeRecursive, but remains the same at computeNonRecursive.
        //I think repeated calls on stack, for computeRecursive function,  and the dependence of previous result, to calculate next one,
        //is a point in explanation of why

    }
}
