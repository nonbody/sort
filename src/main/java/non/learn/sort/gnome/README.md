# Gnome sort / Stupid sort
Gnome Sort is a very simple sorting algorithm that works like a Garden Gnome sorting a line of flower pots.

## How It Works
- The gnome looks at the current pot and the previous pot.
- If they are in the correct order, the gnome takes one step forward.
- If they are in the wrong order, the gnome swaps them and takes one step backward.
- If the gnome is at the start of the line, he steps forward. If he reaches the end of the line, he is done.

## Key Characteristics
- Time Complexity:
  - Best case: O(n)
    - This happens when the input list is **already sorted**. The algorithm simply traverses the list from left to right exactly once without making any swaps.
  - Average case: O(n²)
    - For a **randomly ordered** list, the algorithm spends a quadratic amount of time bouncing back and forth to insert elements into their correct positions.
  - worst case: O(n²)
    - This happens when the input list is **sorted in reverse order**. The algorithm must move each element all the way to the beginning of the list, requiring a nested-loop equivalent of swaps.
- Space Complexity: O(n)
  - The algorithm operates directly on the input list numbers, which contains N elements. No additional data structures are created that scale with the input size.
- Auxiliary Space Complexity: O(1)
  - Auxiliary space measures only the extra memory or temporary space used by the algorithm, excluding the input data.
  - This algorithm only allocates a few fixed primitives and references (i, current, previous) to swap elements in place. Because this extra memory does not grow with the size of the list, it is constant.

## Reference
- https://en.wikipedia.org/wiki/Gnome_sort