public class Loops {

    public static void main(String[]args) {

        for (int i = 50; i < 56; i++) {
            System.out.println(i * 3);
        }

        int[] numbers = {12,16,9,4,22,104,66};
        for (int i = 0; i < 7; i++) {
            System.out.println(numbers[i]);
        }

        int counter = 0;
        while (counter < 10) {
            System.out.println("hello");
            counter++;
        }
        System.out.println("finished");

        int[] selectedNumbers = {1,2,3,4,9,5,6,7,8,10};
        int counter2 = 0;
        while (selectedNumbers[counter2] < 7) {
            System.out.println(selectedNumbers[counter2]);
            counter2++;
        }

        int myAge = 26;
        while (myAge < 20) {
            System.out.println("You are young");
            myAge++;
        }
        System.out.println(myAge);

        do {
            System.out.println("You are young");
            myAge++;
        } while (myAge < 20);
        System.out.println(myAge);

    }

}
