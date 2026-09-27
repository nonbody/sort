package non.learn.sort.gnome;

import java.util.List;

public class Gnome {

    // GNOME sort or Stupid sort
    // Visualizer https://sortvisualizer.com/gnomesort/

    public List<Integer> ascending(List<Integer> numbers) {

        for (int i = 0; i < numbers.size();) {

            if (i == 0 || numbers.get(i) >= numbers.get(i-1)) {
                i++;
                continue;
            }

            Integer current = numbers.get(i);
            Integer previous = numbers.get(i-1);
            numbers.set(i, previous);
            numbers.set(i-1, current);
            i--;
        }

        return numbers;
    }

    public List<Integer> deAscending(List<Integer> numbers) {

        for (int i = 0; i < numbers.size();) {

            if (i == 0 || numbers.get(i) <= numbers.get(i-1)) {
                i++;
                continue;
            }

            Integer current = numbers.get(i);
            Integer previous = numbers.get(i-1);
            numbers.set(i, previous);
            numbers.set(i-1, current);
            i--;
        }

        return numbers;
    }

}
