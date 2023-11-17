package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            int printCh = i;
            for (int j = cathetusLength; j >= 1; j--){
                if (j > i) {
                    System.out.print(' ');
                } else {
                    System.out.print(printCh);
                    printCh--;
                }
            }
            for (int j = 2; j <= cathetusLength; j++){
                if (j > i) {
                    System.out.print("");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        new Pyramid().printPyramid(7);
    }
}
