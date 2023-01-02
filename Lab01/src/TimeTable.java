import java.util.*;
public class TimeTable {
        public static void main(String[] args) {
//            TimeTable aTimeTable = new TimeTable();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size: ");
            int size = sc.nextInt();
//            aTimeTable.printTimeTable(size);
            printTimeTable(size);
        }
        private static void printTimeTable(int n)
        {
            //cho row chay se lam duoc cai */ va row /
            for(int row = -1; row <= n; row++)
            {
                if (row == -1) {
                    System.out.print("*\t|");
                }
                else if (row == 0) {
                    System.out.print("--");
                }
                else if (row > 0) {
                    System.out.printf("%1d\t|", row); //%1d la khoang cach voi le dau tin, \t de cach voi n  |
                }
                //row chay het dieu kieu cai linh tinh bat dau vao khoi chinh, cot chay tu 1
                for(int col = 1; col <= n; col++)
                {
                    //neu la hang dau tien thi in ra cac so
                    if (row == -1) {
                        System.out.printf("%4d", col);
                        continue; //no se quay lai col =-1
                    }
                    // neu hang thu 2 thi cot in ra --
                    else if (row == 0) {
                        System.out.print("--------");
                        continue; //quay lai row = 0
                    }
                    //con lai thi in ra hang nhan cot
                    System.out.printf("%4d", row * col);
                }
                System.out.println();
            }
        }
    }

