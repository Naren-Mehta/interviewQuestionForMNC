package goldmanSachs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class AverageOfStudentScores {

	public static Integer maxAverage(String[][] studentList) {
		Integer maxAvg = Integer.MIN_VALUE;

		HashMap<String, List<String>> map = new HashMap<String, List<String>>();

		for (int i = 0; i < studentList.length; i++) {

			if (map.containsKey(studentList[i][0])) {
				List<String> list = map.get(studentList[i][0]);
				list.add(studentList[i][1]);
				map.put(studentList[i][0], list);
			} else {
				List<String> list = new ArrayList<String>();
				list.add(studentList[i][1]);
				map.put(studentList[i][0], list);
			}
		}

		Collection<List<String>> listOfScores = map.values();

		for (List<String> l : listOfScores) {
			Integer sum = 0;
			for (String s : l) {
				sum = sum + Integer.parseInt(s);
			}
			Double avgFloorValue = Math.floor(Double.valueOf(sum) / l.size());
			Integer avg = avgFloorValue.intValue();

			if (avg > maxAvg) {
				maxAvg = avg;
			}
		}

		return maxAvg;
	}

	public static void main(String[] args) {

		String[][] studentList = { { "Naren", "-65" }, { "Sumit", "-67" }, { "Naren", "-66" } };
		System.out.println(maxAverage(studentList));
	}

}
