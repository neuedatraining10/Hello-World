public class Session1 {
    public static void main(String[] args) {

        long total_numbers = 0L;
        int count_even_numbers = 0;
        int count_divisible_by_3 = 0;
        int total_divisible_by_3 = 0;
        double average_numbers;

        int[] numbers = new int[40];
        numbers [0] = 0;
        numbers [1] = 1;
        for (int i = 2; i < 40; i++) {
            numbers[i] = numbers[i - 1]+ numbers[i - 2];
        }
        for (int i = 0; i < 40; i++) {
            System.out.println(numbers[i]);
            total_numbers = total_numbers + numbers[i];

            if ((numbers[i]%2) == 0){
                count_even_numbers = count_even_numbers + 1;
            }
            if ((numbers[i]%3) == 0){
                count_divisible_by_3 = count_divisible_by_3 + 1;
                total_divisible_by_3 = total_divisible_by_3 + numbers[i];
            }

        }

        average_numbers = total_numbers / 40;

        System.out.println("Total of all numbers = " + total_numbers);
        System.out.println("Count numbers that are even = " + count_even_numbers);
        System.out.println("Count numbers that are divisible by 3 = " + count_divisible_by_3);
        System.out.println("Total of all numbers divisible by 3 = " + total_divisible_by_3);
        System.out.println("Average of the numbers = " + average_numbers);

    }

}
