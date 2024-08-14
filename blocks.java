
public class blocks {

    grid editGrid = new grid();

    boolean[][] square = {
            { true, true },
            { true, true }
    };

    public void blockAppearance(boolean x) {
        x = true;
    }

    public void convertGridSquare(boolean[][] grid, int x, int y) {
        int temp = 0;
        int initial = x;
        int resetX = 0;
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
            editGrid.printGrid();
            grid[x - 1][y] = false;
            grid[x][y] = false;
            grid[x - 1][y + 1] = false;
            grid[x - 2][y] = false;
            grid[x - 2][y + 1] = false;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }

        }
        editGrid.printGrid();

    }

    public void insertSquare() {
        convertGridSquare(editGrid.gridList, 0, 2);
    }
}