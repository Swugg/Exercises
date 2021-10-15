public class Exercise10_03{
    public static void main(String[]args){
        MyInteger x = new MyInteger(15);
        MyInteger y = new MyInteger(12);

        System.out.println(x.equals(12));
    }
}

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