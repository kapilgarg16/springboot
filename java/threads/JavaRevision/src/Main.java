import java.util.Arrays;
import java.util.concurrent.Flow;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String name = new String("Kapil Garg");
//        Integer age = 12;
//        Float height = 4.55f;
//        byte x = 125;
//
//        Scanner input = new Scanner(System.in);
//        int number = input.nextInt();
//        String word = input.next();
//        boolean y = word instanceof String;
//        System.out.println(y);
//        input.nextLine();
//        String line = input.nextLine();
//        long longnum = input.nextLong();
////        char lchar = input.next.charAt(0);
//        System.out.print("Enter a character: ");
//
//        //use nextLine
//        input.nextLine();
//        char ch = input.nextLine().charAt(0);
//
//
//
//        System.out.printf("%d,  %s , %s,  %d , %c%n", number, word, line, longnum, ch);
//
//        Scanner input = new Scanner(System.in);
//        char ch = input.nextLine().charAt(0);
//        System.out.printf("%c", ch);


//        System.out.printf("name - %s, Age - %d, Height - %.2f",name, age, height );

//        int []num = {1,2,3,4};
//        for(int n : num){
//            System.out.println(n);
//        }

//        first:
//        for(int i = 0 ; i < 3 ; ++i){
//            second:
//            for(int j = 0 ; j < 3 ; j++){
//                System.out.println("i " + i + " j " + j);
//                if(i == 1)
//                    break first;
//                }
//            }

//        int [][]a = {{1,3}, {4, 5}};
//
//        for(int []arr : a){
//            for(int ele : arr){
//                System.out.println(ele);
//            }
//        }

        int [] source = {1, 4, 3, 4, 5, 6};
        int [] dest = {1, 4, 3, 4, 5, 6};
//        int [] destination = new int[6];

//        // iterate and copy elements from source to destination
//        for (int i = 0; i < source.length; ++i) {
//            destination[i] = source[i];
//        }
//        System.arraycopy(source, 2, destination, 3, 3);

        int index = Arrays.binarySearch(source, 3);
//Arrays.fill(source, 2);
int cmp = Arrays.compare(source, dest);
        System.out.println("compare" + cmp);
        // converting array to string
        System.out.println(source);
        System.out.println(Arrays.toString(source));

    }
    }
