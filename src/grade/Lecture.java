package grade;

public class Lecture {
	private int [] scores;
	private StandardGrader grader = new StandardGrader();
	
	public Lecture(int ... scores) {
		this.scores = scores;
	}

	public String grade() {
		return grader.grade(scores);
	}
}
