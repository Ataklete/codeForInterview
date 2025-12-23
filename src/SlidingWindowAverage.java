import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// find the average in the list based on the window of sublist
     void main() {
        List<Integer> input = Arrays.asList(4, 8, 15, 16, 23, 42);
        //output = [9.0, 13.0, 18.0, 27.0]
        int window = 2;
         List<Double> list = IntStream.rangeClosed(0, (input.size() - window))
                 .mapToObj(i -> input.subList(i, i + window))
                 .map(w -> w.stream()
                         .mapToInt(Integer::intValue)
                         .average()
                         .orElse(0.0))
                 .toList();
         System.out.println(list);
     }

