package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int counted=0,skip=0;
        if (lastInRow<0){
            System.out.println("last number in row is negative");
            return;
        }
        if (numberToSkip>lastInRow){
            System.out.println("number to skip is bigger then the last");
            return;
        }
        for (int i = 1; i <=lastInRow ; i++) {
            if (i<=numberToSkip){
                skip+=i;
                continue;
            }
            counted+=i;
        }
        System.out.println("skipped sum is "+skip);
        System.out.println("counted sum is "+counted);
    }
}
