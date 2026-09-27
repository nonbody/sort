# Gnome sort / Stupid sort
Gnome Sort is a very simple sorting algorithm that works like a Garden Gnome sorting a line of flower pots.

## Key Characteristics
- Time Complexity:
  - Best case: O(n) 
    - Occurs when the input array is **already sorted**. The inner `while` loop condition `(numbers[prev] > currentNum)` fails immediately every time, resulting in only 1 comparison per element.
  - Average case: O(n²)
    - Occurs with a **randomly shuffled** array. On average, the inner loop will scan and shift about half of the elements in the sorted subsection for each iteration.
  - worst case: O(n²)
    - Occurs when the input array is **sorted in reverse order**. For every element, the inner while loop has to shift all previous elements, leading to roughly `(n(n-1))/2` operations.
- Space Complexity: O(n)
  - Total space complexity accounts for both the input data size and the auxiliary space combined.
  - Input Space: The algorithm takes an integer array int[] numbers of size n, which requires O(n) space.
  - Auxiliary Space: As stated above, the internal logic requires O(1) space.
  - Total Space: `O(n) (Input) + O(1) (Auxiliary) = O(n)`.
- Auxiliary Space Complexity: O(1)
  - Auxiliary space refers only to the extra memory or temporary space allocated by the algorithm, excluding the input size.
  - Your code only creates a few primitive variables: i, prev, and currentNum.
  - The memory allocated for these variables remains constant, regardless of whether the numbers array has 10 elements or 10 million elements.
  - Because the algorithm modifies the array in-place without cloning it or creating new data structures, its auxiliary space is O(1).

## Reference
- https://en.wikipedia.org/wiki/Insertion_sort