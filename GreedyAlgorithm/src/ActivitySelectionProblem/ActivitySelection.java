package ActivitySelectionProblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {
	
	public void activitySelection(ArrayList<Activity> activityList) {
		
		Comparator<Activity> finishTimeComparator = new Comparator<Activity>() {
			
			@Override
			public int compare(Activity o1,Activity o2) {
				return o1.finishTime - o2.finishTime;
			}
		};
		
		Collections.sort(activityList,finishTimeComparator);
		Activity previousActivity = activityList.get(0);
		
		System.out.println("Recomended Schedule : \n" + previousActivity);
		
		for(int i=1;i<activityList.size();i++) {
			if(activityList.get(i).getStartTime() >= previousActivity.finishTime ) {
				System.out.println(activityList.get(i));
				previousActivity = activityList.get(i);
			}
		}
		
	}

}
