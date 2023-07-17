package _02_loop_in_java.practice;

public class b2_hienthi20sntdautien {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 20 ; i++) {
            int n = 0;
            for (int j =2 ; j <= Math.sqrt(i);j++) {
                if (i % j == 0) {
                    n =1;
                }
            }
            if (n==0){
                System.out.println(""+i);
                count++;
            }

        }
    }
}
