import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Moi ban nhap so nguyen duong tu 0 den 999 để đọc:");
        int number = s.nextInt();
        if (number < 10 && number >= 0) {
            System.out.print("số bạn nhập là: " + readNumber(number));
        } else if (number < 20) {
            System.out.println("Số bạn nhập là: " + readNumber10_19(number));
        } else if (number > 19 && number < 100) {
            int ones = number % 10;
            int tens = number / 10;
            System.out.print("số bạn nhập là: " + readNumber(tens) + " " + readNumber(ones));
        } else if (number > 99 & number < 1000) {
            int mode1 = number % 100;
            int ones = mode1 % 10;
            int tens = mode1 / 10;
            int hundreds = number / 100;
            System.out.printf("số bạn nhập là:  " + readNumber(hundreds) + " hundred and " + readNumber(tens) + " " + readNumber(ones));
        }
    }
    public static String readNumber(int x) {
        String read;
        switch (x) {
            case 0:
                read = "zero";
                break;
            case 1:
                read = "one";
                break;
            case 2:
                read = "two";
                break;
            case 3:
                read = "three";
                break;
            case 4:
                read = "four";
                break;
            case 5:
                read = "five";
                break;
            case 6:
                read = "six";
                break;
            case 7:
                read = "seven";
                break;
            case 8:
                read = "eight";
                break;
            case 9:
                read = "nine";
                break;
            default:
                read = "";
                break;
        }
        return read;
    }
    public static String readNumber10_19(int number) {
        String read;
        switch (number - 10) {
            case 0:
                read = "ten";
                break;
            case 1:
                read = "eleven";
                break;
            case 2:
                read = "twelve";
                break;
            case 3:
                read = "thirteen";
                break;
            case 4:
                read = "fourteen";
                break;
            case 5:
                read = "fifteen";
                break;
            case 6:
                read = "sixteen";
                break;
            case 7:
                read = "seventeen";
                break;
            case 8:
                read = "eighteen";
                break;
            case 9:
                read = "nineteen";
            default:
                read = "";
        }
        return read;
    }
}

