import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // khai báo các menu
        System.out.println("Chọn Menu chức năng từ 1 đến 4:");
        System.out.println("_______________________________");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        // khai báo hàm người dùng nhập dữ liệu
        Scanner sc = new Scanner(System.in);
        System.out.print("Chọn Chức Năng: ");
        // dữ liệu người dùng nhập từ bàn phím
        int plan = sc.nextInt();
        // khai báo các biến
        int a;
        int b;
        int c;
        int x;
        // hàm switch case
        switch (plan){
            // case 1
            case 1:
                // khai báo dữ liệu phương trình bậc 1
                System.out.println("Giải Phương Trình Bậc 1:");
                //người dùng khai nhập giá trị a của phương trình
                System.out.println("Nhập giá trị a:");
                a = sc.nextInt();
                System.out.println("a = "+a);
                //người dùng khai nhập giá trị b của phương trình
                System.out.println("Nhập giá trị b:");
                b = sc.nextInt();
                System.out.println("b = "+b);
                // hàm điều kiện if else để cho ra kết quả phương trình
                if (a == 0 && b == 0){
                    //in ra kết quả
                    System.out.println("Kết quả phương trình là: Vô Nghiệm(Điều kiện a phải lớn hơn 0)");
                }if (a != 0 && b == 0){
                //in ra kết quả
                    System.out.println("Kết quả phương trình là: x = 0");
                }else {
                    int x1 = -b/a;
                //in ra kết quả
                System.out.println("Kết quả phương trình là: x = "+x1);
                }
                // kết thúc hàm , vòng lặp chứa break
                break;
            // case 2
            case 2:
                // khai báo dữ liệu phương trình bậc 2
                System.out.println("Giải Phương Trình Bậc 2:");
                //người dùng khai nhập giá trị a của phương trình
                System.out.println("Nhập giá trị a:");
                a = sc.nextInt();
                System.out.println("a = "+a);
                //người dùng khai nhập giá trị b của phương trình
                System.out.println("Nhập giá trị b:");
                b = sc.nextInt();
                System.out.println("b = "+b);
                //người dùng khai nhập giá trị c của phương trình
                System.out.println("Nhập giá trị c:");
                c = sc.nextInt();
                System.out.println("c = "+c);
                //hàm if else (điều kiện in ra kết quả của phương trình bậc 2)
                if (a == 0 && b == 0){
                    //in ra kết quả
                    System.out.println("Kết quả phương trình là: Vô Nghiệm(a phải khác 0");
                }if (a != 0 && b == 0){
                    int x2 = -b/a;
                //in ra kết quả
                System.out.println("kết quả phương trình là: "+Math.sqrt(x2));
                }if (a == 0 && b !=0){
                    int x2 = -c/b;
                //in ra kết quả
                System.out.println("Kết quả phương trình là: "+x2);
                }else {
                    // tính detal của phương trình bậc 2
                    int detal = (b*b) - (4*a*c);
                    // giá trị của x1 khi kết quả có 2 nghiệm phân biệt
                    double x1 = (-b+Math.sqrt(detal))/(2*a);
                    // giá trị của x2 khi kết quả có 2 nghiệm phân biệt
                    double x2 = (-b-Math.sqrt(detal))/(2*a);
                    // giá trị của x1 = x2 khi kết quả có nghiệm kép
                    double x12 = -(b/(2*a));
                    if (detal > 0){
                        System.out.println("Phương trình có 2 nghiệm phân biệt là:");
                        //in ra kết quả
                        System.out.println("X1 = "+x1+", X2 = "+x2);
                    }if (detal == 0){
                    System.out.println("Phương trình có 2 nghiệm kép là:");
                    //in ra kết quả
                    System.out.println("X1 = X2 = "+x12);
                    }if (detal < 0){
                    //in ra kết quả
                    System.out.println("Phương trình Vô nghiệm");
                    }
                }
                // kết thúc hàm , vòng lặp chứa break
                break;
            // case 3
            case 3:
                System.out.println("Nhập số điện sử dụng tháng này:");
                a = sc.nextInt();
                if (0 < a && a <= 50){
                    int soTienDien = a*1000;
                    //in ra kết quả
                    System.out.println("Tiền điện tháng này của bạn là: "+ soTienDien);
                } else{
                    int soTienDien1 = (50*1000)+((a-50)*1200);
                    //in ra kết quả
                    System.out.println("Tiền điện tháng này của bạn là: "+soTienDien1 +" VND" );
                }
                // kết thúc hàm , vòng lặp chứa break
                break;
            // case
            case 4:
                System.out.println("Kết thúc");
                // kết thúc hàm , vòng lặp chứa break
                break;
        }
    }
}