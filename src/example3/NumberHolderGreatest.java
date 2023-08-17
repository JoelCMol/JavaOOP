package example3;

import java.io.FileNotFoundException;

public class NumberHolderGreatest extends NumberHolder {

    public NumberHolderGreatest(String filename) throws FileNotFoundException {
        super.loadAllNumbersFrom(filename);
    }
    @Override
    public int reduce() {

        int greatest = numbers.get(0);
        for(Integer current : super.numbers) {
            if(current > greatest) {
                greatest = current;
            }
        }

        return greatest;
    }
}
