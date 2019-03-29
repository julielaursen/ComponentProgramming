package changeMaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ChangeMakerImpl_Laursen implements ChangeMaker {

	private Set<Integer> denominations;

	public ChangeMakerImpl_Laursen(Set<Integer> denominations) {
		this.denominations = denominations;
		validateDenominations();
 	}

	private List<Integer> getChangeMakerList(){
		Integer[] denominationsArray = new Integer[denominations.size()];
		int i = 0;
		for (Integer denomination : denominations) {
			assert denomination >= 0;
			denominationsArray[i++] = denomination; 
 		}
		Arrays.sort(denominationsArray);
		List<Integer> denArray = Arrays.asList(denominationsArray);
		Collections.reverse(denArray);
		return denArray;
	}
	
	public void validateDenominations() {
		assert denominations != null:"Cannot have a null value passed into denominations";
		assert !denominations.contains(null):"Cannot have a null value passed into denominations";
	}
	// part of post: i in [0, returnValue.size() -1) --> returnvalue.get(i) > returnValue.get(i + 1)

	@Override
	public List<Integer> getDenominations() {
		return getChangeMakerList();
	}

	@Override
	public boolean canMakeExactChange(int valueInCents) {
		if(valueInCents < 0) {
			throw new RuntimeException("value cannot be negative");
		}
		List<Integer> exactChange = new ArrayList<Integer>();
		Iterator<Integer> iterator = getChangeMakerList().iterator();
		while (iterator.hasNext()) {
			int coin = iterator.next();
			exactChange.add(valueInCents / coin);
			valueInCents = valueInCents % coin;
		}		
		return 0 == valueInCents;
	}

	@Override
	public List<Integer> getExactChange(int valueInCents) {
		if(!canMakeExactChange(valueInCents)) {
			throw new RuntimeException("Must return exact change");
		}
		List<Integer> exactChange = new ArrayList<Integer>();
		Iterator<Integer> iterator = getChangeMakerList().iterator();
		while (iterator.hasNext()) {
			int coin = iterator.next();
			exactChange.add(valueInCents / coin);
			valueInCents = valueInCents % coin;
		}
		return exactChange;
	}

	public List<Integer> getRemainders(int valueInCents) {
		List<Integer> exactChange = new ArrayList<Integer>();
		Iterator<Integer> iterator = getChangeMakerList().iterator();
		while (iterator.hasNext()) {
			int coin = iterator.next();
			exactChange.add(valueInCents);
			valueInCents = valueInCents % coin;
		}
		return exactChange;
	}
	
	
	@Override
	public int calculateValueOfChangeList(List<Integer> changeList) {
		assert changeList.size() == getChangeMakerList().size():"Size of change list must be the same size as the denominations list";
		int valueOfChange = 0;
		for (int i = 0; i < changeList.size(); i++) {
			if(changeList.get(i) < 0) {
				throw new RuntimeException("cannot pass in a negative number");
			}
			// post: i in [0, rv.size() - 1) ==> getDenominations.get(i) > rv.get(i+1)*getDenominations.get(i+1)
			if(changeList.get(i) > getChangeMakerList().get(i)){
				throw new RuntimeException("change cannot be higher than the next largest denominator");
			}
 			valueOfChange += changeList.get(i) * getChangeMakerList().get(i);
 			}
		return valueOfChange;
	}

}