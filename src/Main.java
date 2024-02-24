import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double numN,numR, factN=1, factR=1, factS=1;    // describe data

        System.out.print("N sayısını girin : ");            //input N number
        numN = input.nextDouble();

        System.out.print("R sayısını girin : ");          //input R number
        numR = input.nextDouble();


        for(int x=1; x<=numN; x++) {factN *=x;}     //N number factorial
        for(int y=1; y<=numR; y++) {factR *=y;}      //R number factorial
        for(int z=1; z<=(numN-numR); z++) {factS *=z;}  //n-r factorial

        System.out.println("Result C(n , r): " + factN/(factR*factS));  //C(n,r)
    }
}  // Ali Eren KÖSE 24/02/2024  19:28



