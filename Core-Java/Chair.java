public class Chair {
    String color="blue",shape="square";
    double price=5000d;
    public static void main(String[] args) {
       Chair c1=new Chair();
       System.out.println(c1.color+" "+c1.price+" "+c1.shape);
       Chair c2=new Chair();
       c2.color="Red";
       c2.price=6000d;
       c2.shape="circle";
       System.out.println(c2.color+" "+c2.price+" "+c2.shape);
       Chair c3=new Chair();
       c3.color="Yellow";
       c3.price=4000d;
       c3.shape="cube";
       System.out.println(c3.color+" "+c3.price+" "+c3.shape);
       Chair c4=new Chair();
       c4.color="black";
       c4.price=3000d;
       c4.shape="cone";
       System.out.println(c4.color+" "+c4.price+" "+c4.shape);

    }
}
