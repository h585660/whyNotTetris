public class blocks {

    boolean[][] square = {
            { true, true },
            { true, true }
    };

    public void blockAppearance(boolean x) {
        x = true;
    }

    public void convertGridSquare(boolean[][] grid, int x, int y) {
        int temp = 0;
        int resetX = x;
        int resetY = y;
        boolean damn = false;

        while (!damn) {
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    grid[x][y] = true;
                    y++;
                    temp++;
                }
                y = y - temp;
                temp = 0;
                if (grid[x + 1][y] == true) {
                    damn = true;
                }
                x++;
            }
            grid[resetX][resetY] = false;
            grid[resetX][resetY + 1] = false;
            resetX++;
            try {
                Thread.sleep(1000); // 1000 milliseconds = 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
                e.printStackTrace();
            }
        }
        if (damn == true) {
            grid[resetX][resetY] = false;
            grid[resetX][resetY + 1] = false;
            grid[resetX + 1][resetY] = false;
            grid[resetX + 1][resetY + 1] = false;
        }

    }
}
