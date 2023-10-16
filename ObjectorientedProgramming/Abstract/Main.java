package ObjectorientedProgramming.Abstract;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AbstractModel model = new BTechModel();
        System.out.println("Enter no of years");
        model.degreeDuration(sc.nextInt());
    }
}
