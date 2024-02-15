package patterns.structural.wrappers.facade.task;

import java.util.Arrays;

/**
    You'll need to simplify {@link FacadeRun} class's logic.
 */
public class FacadeRun {
    public static void main(String[] args) {

        Integer[] ints = new Integer[]{2, 4, 6, 1, 14, 2, -7, 66, 0, -555};
        Double[] doubles = new Double[]{31d, 3d, 5d, 55d, 12d, 47d, 0d, -1d, 125d, -15d};

        Facade<Integer> facade = new Facade<>();

        facade.doLogic(ints, 14);


    }

}
