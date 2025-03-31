Problem Statement: 2D Prefix Sum Query
Problem Description:

You are given a 2D integer matrix grid of size N × M. You need to process Q queries, where each query consists of four integers (r1, c1, r2, c2), representing the top-left and bottom-right corners of a submatrix. For each query, return the sum of elements inside the submatrix from (r1, c1) to (r2, c2).
Constraints:

    1≤N,M≤10001≤N,M≤1000

    1≤Q≤1051≤Q≤105

    −109≤grid[i][j]≤109−109≤grid[i][j]≤109

    0≤r1≤r2<N0≤r1≤r2<N

    0≤c1≤c2<M0≤c1≤c2<M
    Input Format:

    The first line contains two integers N and M — the dimensions of the grid.

    The next N lines each contain M space-separated integers representing the matrix.

    The next line contains an integer Q, the number of queries.

    The next Q lines contain four integers each: r1 c1 r2 c2 representing a query.

Output Format:

For each query, print the sum of the submatrix in a new line.
