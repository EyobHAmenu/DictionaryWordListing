import java.util.Scanner;

public class bubbleSort {
    /*  pseudocode :
        * declare String array, integer and string variables
        * creat scanner to accept values from user
        * Prompt the user to enter 10 words using for loop
        * store the words in the array
        * print the original order of the words using for loop
        * order the words in alphabetic order using bubble sort
        * Bubble sort needs two for loops that will help us to pick two words
          from the array and  if cause to compare the words and do swap.
        * Once we order the array in alphabetic order we can print the words
          in revers order by making the loop to start from the end.
        * To find the words that start with vowels. we need to through the array
          using fro loop then check if the word start with one of the vowels.
          If that is true print the word else go to the next word.
     */
    public static void main(String[] args) {
        String[] word = new String[10];
        int count = 0;
        String swap;
        Scanner sc = new Scanner(System.in);

        /*
            ask user to enter 10 words
         */
        for (int i = 0; i < word.length; i++) {
            count++;
            System.out.print(count + ". Enter a word: ");
            word[i] = sc.nextLine(); // Store the word on my word array.
        }
        System.out.println();

        /*
            This for loop will print the original order
            of the words as the user entered the words.
         */
        System.out.println("Original order: ");
        for (int i = 0; i < word.length; i++) {
            System.out.print(word[i] + " ");
        }
        System.out.println();

        /*
            Here we go through each word and compare with
            the rest of words to order the words in ascending
            order.
            Bubble sorting.
         */

        int n = word.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++) {
                if (word[j].compareToIgnoreCase(word[j + 1]) > 0) {
                    // swap arr[j+1] and arr[i]
                    String temp = word[j];
                    word[j] = word[j + 1];
                    word[j + 1] = temp;
                }
            }
        }

        /*
            This for loop print the ascending ordered words from the array
         */
        System.out.println("Alphabetical Order: ");
        for (int i = 0; i < word.length; i++)
        {
            System.out.print(word[i] + " ");
        }
        System.out.println();

        /*
            This for loop print the words in a revers order.
         */
        System.out.println("Reversed Alphabetical Order: ");
        for (int i = word.length - 1; i >= 0; i--)
        {
            System.out.print(word[i] + " ");
        }
        System.out.println();

        /*
        Here we try to find words that start with vowels
        so we go through the array and check if the word
        starts with a, e, i, o, or u.
     */
        System.out.println("Words that starts with a vowel:");
        for(int i = 0; i < word.length; i++){
            if(word[i].charAt(0) == 'a' || word[i].charAt(0) == 'A' ||
                    word[i].charAt(0) == 'e' || word[i].charAt(0) == 'E' ||
                    word[i].charAt(0) == 'o' || word[i].charAt(0) == 'O' ||
                    word[i].charAt(0) == 'i' || word[i].charAt(0) == 'I' ||
                    word[i].charAt(0) == 'u' || word[i].charAt(0) == 'U')
            {
                System.out.print(word[i] + " ");

            }
        }
    }
}
