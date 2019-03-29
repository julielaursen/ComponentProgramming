package changeMaker;

import java.util.List;

public interface ChangeMaker {

	public List<Integer> getDenominations();

	public boolean canMakeExactChange(int valueInCents);
	
	//pre canMakeExacthange(valueInCents);
	//post calculateValueOfChangeList(rv) == valueInCents
	//part of post: i in [0, rv.size() - 1] --> getDenominations.get(i) > rv.get(i+1)*getDenominations.get(i+1)
	//so 25 cents > get(10)*(10)?????
	public List<Integer> getExactChange(int valueInCents);
	
	//pre; changeList.size() == getDenominations().size()
	//pre SIZE = changeList.size()
	//post
	public int calculateValueOfChangeList(List<Integer> changeList);

	public List<Integer> getRemainders(int valueInCents);

	
}
