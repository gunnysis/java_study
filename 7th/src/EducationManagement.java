import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class EducationManagement {
    static double getAverage(double[] scores) {
        double sum;
//        for (double score : scores) {
//            sum += score;
//        }
//        sum = sum / scores.length;

        OptionalDouble average = DoubleStream.of(scores).average();
        sum = average.isPresent() ? average.getAsDouble() : 0.0;
        return sum;
    }

    static double[] getMultiplicationArray(double[] scores) {
        // double[] scores = new double[scores.length];
        int i=0;
        // enhanced for statement
        for(double score : scores) {
            scores[i] = score * 10;
            i++;
        }
        return scores;
    }
}
