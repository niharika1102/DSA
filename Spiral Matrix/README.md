# Problem statement
You are given a 2-D array 'MATRIX' of dimensions N x M, of integers. You need to return the spiral path of the matrix.

### Example Of Spiral Path
![image](https://github.com/user-attachments/assets/5d0f2f4c-0eda-4962-ab45-0e06b18647ea)

**Detailed explanation ( Input/output format, Notes, Images )**

_Constraints:_

1 <= T <= 5

1 <= N  <= 10 ^ 2

1 <= M <= 10 ^ 2

-10 ^ 9 <= MATRIX[ i ][ j ] <= 10 ^ 9


Time Limit: 1sec.

Sample Input 1 :

2

4 4

1 2 3 4 

5 6 7 8 

9 10 11 12 

13 14 15 16


3 6

1 2 3 4 5 6 

7 8 9 10 11 12 

13 14 15 16 17 18

Sample Output 1 :

1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

1 2 3 4 5 6 12 18 17 16 15 14 13 7 8 9 10 11

Sample Input 2 :

2

1 1

4

1 5

1 2 3 4 5

Sample Output 2 :

4

1 2 3 4 5
