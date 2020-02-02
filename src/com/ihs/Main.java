package com.ihs;

public class Main {
    public static void main(String[] args) {

    }
}

class MyClass {

    void DFSTravel(int[][] grid) {
        int h = grid.length;
        int l = grid[0].length;

        boolean[][] visited = new boolean[h][l];

        DFSdriver(grid, 0, 0, visited);
    }
    int count = 0;
    void DFSdriver(int[][] grid, int row, int col, boolean[][] visited) {

        int H = grid.length;
        int L = grid[0].length;
        if (row < 0 || col < 0 || row >= H || col >= L || visited[row][col])
            return;

        visited[row][col] = true;
        System.out.println(grid[row][col] + " ");

        DFSdriver (grid, row+1, col, visited);
        DFSdriver (grid, row, col+1, visited);
        DFSdriver (grid, row-1, col, visited);
        DFSdriver (grid, row, col-1, visited);
    }

    public static void main(String[] args) {

        int [][] grid = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        MyClass d = new MyClass();
        d.DFSTravel(grid);
    }
}



