package non.learn.sort.insertion;

public class Insertion {

    public int[] ascending(int[] numbers) {

        int prev;
        for (int i = 1; i < numbers.length; i++) {

            prev = i - 1;
            int currentNum = numbers[i];

            while (prev >= 0 && numbers[prev] > currentNum) {
                numbers[prev + 1] = numbers[prev];
                prev--;
            }
            numbers[prev + 1] = currentNum;
        }

        return numbers;
    }

    public int[] deAscending(int[] numbers) {

        int prev;
        for (int i = 1; i < numbers.length; i++) {

            prev = i - 1;
            int currentNum = numbers[i];

            while (prev >= 0 && numbers[prev] < currentNum) {
                numbers[prev + 1] = numbers[prev];
                prev--;
            }
            numbers[prev + 1] = currentNum;
        }

        return numbers;
    }

}
