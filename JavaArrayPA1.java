package JavaArrayPA;


import java.util.Arrays;
import java.util.Scanner;

public class JavaArrayPA1 {
    public static void main(String[] args) {

        //Task1
        int [] arr = {1,2,3};
        for(int i=0; i < arr.length; i++){
            System.out.println(arr[i]);

        }

        System.out.println("***************************************************");
        //Task2
        int [] a = {13, 5, 7, 68, 2};
        int mid = a.length/2;
        System.out.println(a[mid]);


        //Task3
        System.out.println("***************************************************");
        String [] sarr = {"red", "green", "blue", "yellow"};
        String []scopy = sarr.clone();
        System.out.println(Arrays.toString(scopy));

        //Task 4
        System.out.println("***************************************************");
        int [] num = {1,2,3,4,5};
        System.out.println("First index: "+num[0]);
        int last = num.length;
        System.out.println("Last index: "+ last);
//      System.out.println(num[num.length] );//Array index is out of bounds
//      num[5]= 5;// ArrayIndexOutOfBoundsException

        System.out.println("***************************************************");
        //Task5
        int [] num1 = new int[5];

        for(int i=0; i<num1.length; i++){
            System.out.println(num1[i]= i);
        }

        System.out.println("***************************************************");
        //Task6
        int [] num2 = new int[5];

        for(int i=0; i<num2.length; i++){
            System.out.println(num2[i]= i*2);
        }

        System.out.println("***************************************************");
        //Task7
        int [] num3 = new int[5];

        for(int i=0; i<num3.length; i++){
           num3[i]=i;
            if(i ==2){
                continue;
            }
            System.out.println(num3[i]);
        }
        System.out.println("***************************************************");
        //Task8
        String[] strArray = {"one", "two", "three", "four", "five"};

        int middleIndex = strArray.length / 2;
        String temp = strArray[0];
        strArray[0] = strArray[middleIndex];
        strArray[middleIndex] = temp;

        for(int i=0; i<strArray.length; i++){
            System.out.println(strArray[i]);
        }
        System.out.println("***************************************************");
        //Task9

        int [] num4 = {4, 2, 9, 13, 1, 0};

        Arrays.sort(num4);


        for(int i=0; i<num4.length; i++) {
            if (i == num4.length - 1) {
                System.out.print(num4[i]);
                System.out.println(" ");
            }
            else {
                System.out.println(num4[i] + ", ");
            }
        }


        int small = num4[0];
        int large = num4[num4.length-1];

        System.out.println("The smallest number is " + small);
        System.out.println("The biggest number is " + large);

        System.out.println("***************************************************");
        //Task10
        Object[] mixedArray = {42, "Hello", "World", "Java", 3.14};

        for(int i=0; i<mixedArray.length; i++){
            System.out.println(mixedArray[i]);
        }


        System.out.println("***************************************************");
        //Task11
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many favorite things do you have? ");
        int numberOfFavorites = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create a String array of the correct size
        String[] favoriteThings = new String[numberOfFavorites];

        // Ask the user to enter their favorite things
        for (int i = 0; i < numberOfFavorites; i++) {
            System.out.print("Enter favorite thing #" + (i + 1) + ": ");
            favoriteThings[i] = scanner.nextLine();
        }

        // Print out the contents of the array
        System.out.println("Your favorite things are:");
        for (String thing : favoriteThings) {
            System.out.println(thing);
        }



    }
}

2