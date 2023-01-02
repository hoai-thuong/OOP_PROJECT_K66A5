//import java.util.Scanner;
//
//public class GradesStatistics {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int[] grades = inputArr(scan);
//        System.out.printf("%s %.2f\n", "The average is:", findAverage(grades));
//        System.out.println("The minimum is: " + findMin(grades));
//        System.out.println("The maximum is: " + findMax(grades));
//
//    }
//
//    static int[] inputArr(Scanner scan) {
//        System.out.print("Enter the number of students: ");
//        int numStudents = scan.nextInt();
//        if (numStudents < 0) {
//            System.out.println("So hoc sinh phai la so duong!");
//        } else {
//            int[] allGrades = new int[numStudents];
//            for (int i = 0; i < numStudents; i++) {
//
//
////                do {
//                    try {
//                        while (true) {
//                            System.out.print("Enter the grade for student " + (i + 1) + ": ");
//                            int grade = scan.nextInt();
//                            //catch wrong input
//                            if (grade < 0 || grade > 100) {
//                                System.out.println("Please input between 0 to 100!\n");
//                            } else {
//                                allGrades[i] = grade;
//                                break;  //break de ko tiep tuc chay tai bang cho sai
//                            }
//                            break;
//                        }
////                        break;  //gia su vao truong hop ko bat loi , thi break ra khoi if,
////                        break ow duoi la break cho vong do while
//
//                    } catch (java.util.InputMismatchException e) {
//                        while (true) {
//                            scan.next();
//                            System.out.println("Integer only!");
//                        }
////                        break;
//
////                        scan.next();
////                        System.out.println("Integer only!");
//
////                        break;
////                        continue;
//                    }
////                    break;
////                    break;
//
////                } while (true);
//
//
//            }
//            return allGrades;
//        }
//        return null;
//    }
//
//    static double findAverage(int[] grades) {
//        int sum = 0;
//        for (int grade : grades) {
//            sum += grade;
//        }
//        return (double) sum / grades.length;
//    }
//
//    static int findMin(int[] grades) {
//        int min = grades[0];
//        for (int i = 1; i < grades.length; i++) {
//            if (grades[i] < min) {
//                min = grades[i];
//            }
//        }
//        return min;
//    }
//
//    static int findMax(int[] grades) {
//        int max = grades[0];
//        for (int i = 1; i < grades.length; i++) {
//            if (grades[i] > max) {
//                max = grades[i];
//            }
//        }
//        return max;
//    }
//
//
//}
//package ArrayVSMethodEx;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] grades = inputArr(scan);
        System.out.printf("%s %.2f\n", "The average is:", findAverage(grades));
        System.out.println("The minimum is: " + findMin(grades));
        System.out.println("The maximum is: " + findMax(grades));

    }

    static int[] inputArr(Scanner scan) {
        System.out.print("Enter the number of students: ");
        int numStudents = scan.nextInt();
        if(numStudents < 0) {
            System.out.println("So hoc sinh phai la so duong!");
        } else {
            int[] allGrades = new int[numStudents];
            for (int i = 0; i < numStudents; i++) {
                do {
                    try {
                        while (true) {
                            System.out.print("Enter the grade for student " + (i + 1) + ": ");
                            int grade = scan.nextInt();
                            //catch wrong input
                            if (grade < 0 || grade > 100) {
                                System.out.println("Please input between 0 to 100!\n");
                            } else {
                                allGrades[i] = grade;
                                break;
                            }
//                            break;
                        }
                        break;
                    } catch (java.util.InputMismatchException e) {
                        scan.next();
                        System.out.println("Integer only!");
                    }

                } while (true);
            }
            return allGrades;
        }
        return null;
    }

    static double findAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    static int findMin(int[] grades) {
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }
        }
        return min;
    }

    static int findMax(int[] grades) {
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }
        }
        return max;
    }


}

