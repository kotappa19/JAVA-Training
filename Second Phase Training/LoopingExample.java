public class LoopingExample {
    public static void main(String[] args) {
        int i=1;
        while(i<=10){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        i=2;
        while (i<=20) {
                System.out.print(i+" ");
                i+=2;
        }
        System.out.println();
        i=1;
        int sum=0;
        while (i<=10) {
            sum+=i;
            i++;
        }
    System.out.println(sum);
    System.out.println("Number of Digits");
    int n=3456,count=0;
    while(n>0)
    {
        count++;
        n/=10;
    }
    System.out.println(count);

    }
}
