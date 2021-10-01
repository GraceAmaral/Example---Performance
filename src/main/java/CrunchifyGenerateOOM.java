
public class CrunchifyGenerateOOM {

    /**
     * @author Crunchify.com
     * @throws Exception
     *
     */

    public static void main(String[] args) throws Exception {
        CrunchifyGenerateOOM memoryTest = new CrunchifyGenerateOOM();
        memoryTest.generateOOM();
    }

    public void generateOOM() throws Exception {
        int iteratorValue = 20;
        System.out.println("\n=================> OOM test started. With Memory JVM: \n" + (Runtime.getRuntime().totalMemory() / 1024) / 1024 );
        for (int outerIterator = 1; outerIterator < 20; outerIterator++) {
            System.out.println("Iteration " + outerIterator + " Free Memory MB: " + (Runtime.getRuntime().freeMemory() / 1024) / 1024 );
            int loop1 = 2;
            int[] memoryFillIntVar = new int[iteratorValue];
            // feel memoryFillIntVar array in loop..
            do {
                memoryFillIntVar[loop1] = 0;
                loop1--;
            } while (loop1 > 0);
            iteratorValue = iteratorValue * 5;
            System.out.println("\nRequired Memory for next loop: " + (iteratorValue / 1024) / 1024);
            Thread.sleep(1000);
        }
    }

}