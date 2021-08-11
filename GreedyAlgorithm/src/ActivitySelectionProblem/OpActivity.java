package ActivitySelectionProblem;

import java.util.ArrayList;

public class OpActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Activity> activityList = new ArrayList<Activity>();
		activityList.add(new Activity("A1", 0, 6));
		activityList.add(new Activity("A2", 3, 4));
		activityList.add(new Activity("A3", 1, 2));
		activityList.add(new Activity("A4", 5, 8));
		activityList.add(new Activity("A5", 5, 7));
		activityList.add(new Activity("A6", 8, 9));
		
		ActivitySelection obj = new ActivitySelection();
		obj.activitySelection(activityList);
	}

}
