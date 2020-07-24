package epamTask;

import java.util.List;


public class averagecalculation {
	public Double average(List<Integer> list) {
		return list.stream()
  .mapToInt(i -> i)
  .average()
  .getAsDouble();
	}

}
