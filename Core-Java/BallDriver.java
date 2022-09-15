import java.util.*;

class Ball {
    private double r;

    double getr() {
        return r;
    }

    void setr(double r) {
        this.r = r;
    }

    Ball(double r) {
        this.r = r;
    }
}

class BasketBall extends Ball {
    BasketBall(double r) {
        super(r);
    }

    String game = "Basket Ball";
}

class TennisBall extends Ball {
    TennisBall(double r) {
        super(r);
    }

    String game = "Tennis Ball";
}
class MyException extends Exception
{
    public MyException(String s)
    {
        super(s);
    }
}
class Bag {
    Ball b;

    void AddBall(Ball b) throws MyException{
        if (this.b != null)
            throw new MyException("Ball is already present");
        else {
            this.b = b;
            System.out.println("Ball is added Successfully");
        }
    }

    void RemoveBall() throws MyException {
        if (this.b == null) {
            throw new MyException("There is no ball present in the bag");
        } else {
            if (b instanceof BasketBall) {
                b = null;
                System.out.println("Basket Ball is removed");
            } else {
                b = null;
                System.out.println("Tennis Ball is removed");
            }

        }
    }

    void isBagEmpty() throws MyException {
        if (this.b == null)
            throw new MyException("Bag is empty");
        else {
            if (b instanceof BasketBall) {
                System.out.println("Basket Ball is in the Bag");
            } else {
                System.out.println("Tennis Ball is in the Bag");
            }
        }
    }

    void ShowGame() throws MyException{
        if (this.b == null)
            throw new MyException("Bag is empty");
        else {
            if (b instanceof BasketBall) {
                System.out.println("Basket Ball is Available");
            } else {
                System.out.println("Tennis Ball is Available");
            }
        }
    }
}

public class BallDriver {
    public static void main(String[] args) {

        Bag b = new Bag();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1-Add Ball\n2-Remove Ball\n3-Is Bag Empty\n4-Show Game\n5-Exit\nEnter Your Choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("1-Basket Ball\n2-Tennis Ball");
                    int c = sc.nextInt();
                    System.out.println("Enter the Radius of the Ball");
                    double r = sc.nextDouble();
                    if (c == 1) {
                        try {
                            b.AddBall(new BasketBall(r));
                        } catch (MyException e) {
                            System.out.println(e);
                        }
                    } else if (c == 2) {
                        try {
                            b.AddBall(new TennisBall(r));
                        } catch (MyException e) {
                            System.out.println(e);
                        }
                    }
                    break;
                case 2:
                    try {
                        b.RemoveBall();
                    } catch (MyException e) {
                        System.out.println(e);
                    }
                    break;
                case 3:
                    try {
                        b.isBagEmpty();
                    } catch (MyException e) {
                        System.out.println(e);
                    }
                    break;
                case 4:
                    try {
                        b.ShowGame();
                    } catch (MyException e) {
                        System.out.println(e);
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }
}
