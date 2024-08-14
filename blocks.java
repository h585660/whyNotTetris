import java.io.IOException;

public class blocks {

    private static boolean left = false;
    private static boolean right = false;
    private static boolean GO = false;

    grid editGrid = new grid();

    boolean[][] square = {
            { true, true },
            { true, true }
    };

    public void blockAppearance(boolean x) {
        x = true;
    }

    public void incremental(int x) {
        x++;
    }

    public void reduction(int x) {
        x--;
    }

    public void runTheLoop() {
        insertSquare();
    };

    public void convertGridSquare(boolean[][] grid, int x, int y) {
        GO = true;
        int temp = 0;
        int initial = x;
        int resetX = 0;
        int resetY = y;
        boolean damn = false;

        while (damn == false) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    if (left == true) {
                        y--;
                        left = false;
                    }
                    if (right == true) {
                        y++;
                        right = false;
                    }

                    grid[x][y] = true;
                    y++;
                    temp++;
                }
                y = y - temp;
                temp = 0;
                x++;
                if (x + 2 >= grid.length || grid[x + 1][y] == true || grid[x + 1][y + 1] == true) {
                    damn = true;
                }

            }
            editGrid.printGrid();

            if (damn == false) {
                grid[x - 1][y] = false;
                grid[x][y] = false;
                grid[x - 1][y + 1] = false;
                grid[x - 2][y] = false;
                grid[x - 2][y + 1] = false;
            }
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
        }

        editGrid.printGrid();
        runTheLoop();

    }

    public void insertSquare() {
        convertGridSquare(editGrid.gridList, 0, 2);
    }

    static void handleKeyInputs() throws IOException {

        while (true) {
            int key = System.in.read();
            if (key == 'a') {
                left = true;
            } else if (key == 'd') {
                right = true;

            } else if (key == 'q') {
                System.out.println("Exiting...");
                break;
            }
        }
    }

}