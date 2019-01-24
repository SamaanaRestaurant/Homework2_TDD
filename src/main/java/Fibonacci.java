public class Fibonacci {


    public int computeRecursive(int index) {
        if (index == -1){
            throw new RuntimeException();
        }
        if (index == 0 || index == 1){
            return 1;
        }
        return computeRecursive(index - 1) + computeRecursive(index - 2);
    }


    public int computeNonRecursive(int index) {
        if (index == -1){
            throw  new RuntimeException();
        }
        if(index == 0 || index == 1){
            return 1;
        }
        int first = 1;
        int second = 1;
        int nth = 2;

        for (int i = 2; i <= index; i++) {
            nth = first + second;
            first = second;
            second = nth;
        }
        return nth;
    }
}
