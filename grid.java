public class grid {

    blocks square = new blocks();

    boolean[][] gridList = {
            { false, false, false, false, false, false },
            { false, false, false, false, false, false },
            { false, false, false, false, false, false },
            { false, false, false, false, false, false },
            { false, false, false, false, false, false },
            { false, false, false, false, false, false },
            { false, false, false, false, false, false },
            { false, false, false, false, false, false },
            { false, false, false, false, false, false },
            { false, false, false, false, false, false },
            { true, true, true, true, true, true }
    };

    public void printGrid() {
        for (int i = 0; i < gridList.length; i++) {
            for (int j = 0; j < gridList[i].length; j++) {
                if (gridList[i][j] == false) {
                    System.out.print("   □");
                } else {
                    System.out.print("   ■");
                }
            }
            System.out.print("\n");
        }
    }

    public void insertSquare() {
        square.convertGridSquare(gridList, 2, 2);
    }
}
