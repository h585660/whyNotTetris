public class grid {

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

}
