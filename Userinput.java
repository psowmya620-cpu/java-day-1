import java.util.Scanner;
class Userinput{
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        double b=ob.nextDouble();
        float c=ob.nextFloat();
        String str1=ob.next();
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);
        System.out.println("value of c:"+c);
        System.out.println("String word:"+str1);
    }
}