## Problem statement
You are given a sorted array ‘arr’ containing ‘n’ integers and an integer ‘x’.Implement the ‘upper bound’ function to find the index of the upper bound of 'x' in the array.



**Note:**
1. The upper bound in a sorted array is the index of the first value that is greater than a given value. 
2. If the greater value does not exist then the answer is 'n', Where 'n' is the size of the array.
3. Try to write a solution that runs in log(n) time complexity.


**Example:**

_Input :_ ‘arr’ = {2,4,6,7} and ‘x’ = 5,

_Output:_ 2

_Explanation:_ The upper bound of 5 is 6 in the given array, which is at index 2 (0-indexed).


**Detailed explanation ( Input/output format, Notes, Images )**


Constraints:

1 <= ‘n’ <= 10^5

1 <= ‘x’ <= 10^9

1 <= ‘arr[i]’ <= 10^9

Time Limit: 1 sec

Sample Input 1:

5 7

1 4 7 8 10


Sample Output 1:

3   


Explanation of sample output 1:

In the given test case, the lowest value greater than 7 is 8 and is present at index 3(0-indexed). 


Sample Input 2:

5 10

1 2 5 6 10   


Sample Output 2:
5


Sample Input 3:

7 5

1 5 5 7 7 9 10


Sample Output 3:
3
