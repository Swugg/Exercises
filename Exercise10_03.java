
public class Exercise10_03{
    public static void main(String[]args){
        String parseString = "3539";
        char[] parseChar = {'3','5','3','9'};
        MyInteger n1 = new MyInteger(5);
        MyInteger n2 = new MyInteger(3539);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));
        System.out.println(MyInteger.parseInt(parseChar));
        System.out.println(MyInteger.parseInt(parseString));
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));

    }
}
//bink
class MyInteger{
   private int value;

    MyInteger(int value){
        this.value = value;
    }



    public int getValue(){
        return value;
    }

    public boolean isEven(){
        return (value % 2) == 0;
    }
    public boolean isOdd(){
        return (value % 2) != 0;
    }
    public boolean isPrime(){
        boolean primer = true;
        
        for(int i = 2; i < value; i++){
            if(value != i && (value % i) == 0){
                primer = false;
                break;
            }
        }

        return primer;
    }



    public static boolean isEven(int x){
        return (x % 2) == 0;
    }
    public static boolean isOdd(int x){
        return (x % 2) != 0;
    }
    public static boolean isPrime(int x){
        boolean primer = true;
        
        for(int i = 2; i < x; i++){
            if(x != i && (x % i) == 0){
                primer = false;
                break;
            }
        }

        return primer;
    }



    public static boolean isEven(MyInteger num){
        return isEven(num.getValue());
    }
    public static boolean isOdd(MyInteger num){
        return isOdd(num.getValue());
    }
    public static boolean isPrime(MyInteger num){
        return isPrime(num.getValue());
    }


    public boolean equals(int given){
        return given == value;
    }
    public boolean equals(MyInteger given){
        return given.getValue() == value;
    }


    public static int parseInt(char[] given){
        return Integer.parseInt(new String(given));
    }

    public static int parseInt(String given){
        return Integer.parseInt(given);
    }
} 