package ActivitySelectionProblem;

public class Activity {
	
	String name;
	int startTime;
	int finishTime;
	
	Activity(String name, int startTime, int finishTime) {
		this.name = name;
		this.startTime = startTime;
		this.finishTime = finishTime;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getStartTime() {
		return startTime;
	}
	
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	
	public int getFinishTime() {
		return finishTime;
	}
	
	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}
	
	@Override 
	public String toString() {
		return "Activity Name : " + name + " Start Time : " + startTime + " Finish Time : " + finishTime;
	}

}
