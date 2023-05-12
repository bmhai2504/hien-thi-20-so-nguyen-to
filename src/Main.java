import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.printf("Nhap vao so luong so nguyen to muon in ra: ");
            number = input.nextInt();
            int count = 0;
            if(number < 0){
                System.out.println("Khong co so nguyen to");
            }else{
                boolean flag;

                for(int n = 1; ; n++){
                    flag = false;
                    if(n == 1 || n == 2){
                        flag = true;
                    }else{
                        for (int i = 2; i < n; i++) {
                            flag = true;
                            if(n % i == 0){
                                flag = false;
                                break;
                            }
                        }
                    }
                    if(flag){
                        System.out.printf("%d ", n);
                        count ++;
                    }
                    if(count == number){
                        System.out.printf("\n");
                        break;
                    }
                }
            }
        }while (1 == 1);
    }
}