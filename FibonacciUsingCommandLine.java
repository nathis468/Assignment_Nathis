import java.util.Scanner;

class FibonacciUsingCommandLine{
    static void fibonacciPrint(int prev,int current,int end){
        if(end>0){
            int next=prev+current;
            prev=current;
            current=next;
            end--;
            fibonacciPrint(prev,current,end);
            System.out.println(prev);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int end=sc.nextInt();
        fibonacciPrint(0,1,end);
    }
}

