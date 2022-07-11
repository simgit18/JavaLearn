public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(223));
    }

    public static boolean isPalindrome(int number){
        int reversenum = 0;
        int temp = number;
        while(number>0){
            reversenum = (reversenum*10) + (number%10);
            number/=10;

        }

        if (temp==reversenum){
            return true;
        }
        else {
            return false;
        }
    }
}
