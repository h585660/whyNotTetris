import java.io.IOException;

public class Main {
    private static int value = 0;

    public static void main(String[] args) {

        grid grid = new grid();
        blocks block = new blocks();

        Thread keyInputThread = new Thread(() -> {
            try {
                blocks.handleKeyInputs();
            } catch (IOException e) {
                e.printStackTrace();
            }
            boolean keyInputDone = true;
        });
        keyInputThread.start();

        block.runTheLoop();

    }

}