package pl.kamil;

public class Choinka {

    public static void main(String []args) {

            int len = 5;

            for(int i= len; i > 0; i--){
                for (int j = i; j > 0; j--)
                    System.out.print(" ");
                for (int k= 2*(len - i) + 1; k > 0; k--)
                    System.out.print("-");
        System.out.println();

            }
    }
}
