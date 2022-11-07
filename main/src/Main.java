import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // define the input class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your first edge : ");
        int edge_1 = input.nextInt();
        System.out.println("Enter Your second edge : ");
        int edge_2 = input.nextInt();
        System.out.println("Enter Your third edge : ");
        int edge_3 = input.nextInt();

        // area formula is ;
        // perimeter of triangle = 2𝑢
        //
        //𝑢 = (a+b+c) / 2
        //
        //area * area = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        double u = (edge_1 + edge_2 + edge_3) / 2;
        double area = Math.sqrt( u * (u-edge_1) * (u-edge_2) * (u-edge_3));
        System.out.println("Area of triangle is : " + area);
    }

}
