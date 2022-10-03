package Day2;

public class ReverseNumber {
    public static void main(String[] args)
    {
        //an integer number declared
        int num = 231;
        //intger variable 'rev' to store reverse value
        int rev = 0;

        //find reverse using while loop
        while (num != 0)
        {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reversed num: " + rev);
    }
}



