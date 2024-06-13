package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 0; i < height; i++) {

            if (i < height / 2) {
                for (int j = 0; j < height; j++) {

                    if (j >= i && j <= height - 1 - i) {
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }


                }
                System.out.print("\n");
            } else {
                for (int j = 0; j < height; j++) {

                    if (j >= height - 1 - i && j <= i) {
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }


                }

                System.out.print("\n");

            }

        }
    }
}