package Day2;

public class SumOfNaturalWhileloop {
    public static void main(String[] args) {
        int n = 20, sum = 0, i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Total Sum =" + sum);
    }
}

