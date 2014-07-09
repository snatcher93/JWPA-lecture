package grade;

public class Lecture {
	private int [] scores;
	
	public Lecture(int ... scores) {
		this.scores = scores;
	}

	public String grade() {
		String [] grades = {"A", "B", "C", "D", "F"};
		int [] count = new int[6];
		
		for(int score : scores) {
			if (score >= 90) {
				count[0]++;
			} else if (score >= 80) {
				count[1]++;
			} else if (score >= 70) {
				count[2]++;
			} else if (score >= 60) {
				count[3]++;
			} else {
				count[4]++;
			}
		}
		
		String result = "";
		for(int loop=0; loop<grades.length; loop++) {
			result += grades[loop] + ":" + count[loop] + " ";
		}
		return result;
	}
}
