package example3;

import java.io.FileNotFoundException;

public class NumberHolderAdder extends NumberHolder {

    public NumberHolderAdder(String filename) throws FileNotFoundException {
        super.loadAllNumbersFrom(filename);
    }
    @Override
    public int reduce() {
        int total = 0;

        for(Integer current : super.numbers)
        {
            total += current;
        }
        return total;
    }
}
