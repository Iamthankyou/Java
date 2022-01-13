package com.company;

public class Main {

    static void primeDiagonalElementSum(int [][]mat,
                                        int r, int c)
    {
        int totalSum = 0;

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                int temp = mat[i][j];

                if ((i == j))
                    totalSum += (temp);
            }
        }

        System.out.print(totalSum + "\n");
    }

    public static void main(String[] args) {
        int R = 4, C = 5;

        // Given Matrix
        int mat[][] = { { 1, 2, 3, 4, 2 },
                { 0, 3, 2, 3, 9 },
                { 0, 4, 1, 2, 8 },
                { 1, 2, 3, 6, 6 } };

        primeDiagonalElementSum(mat, R, C);
    }
}
