package client;

import aggregators.AggregatorProcessor;
import aggregators.MaxAggregator;

import java.io.IOException;

/**
 * Created by nadimchouglay on 12/01/2019.
 */
public class AggregatorApp {

    public static void main(String[] args) throws IOException {
        MaxAggregator agg = new MaxAggregator();
        AggregatorProcessor<MaxAggregator> aggsProcessor = new AggregatorProcessor(agg,"table.csv");
        double value = aggsProcessor.runAggregator(1);
        System.out.println(value);
    }
}
