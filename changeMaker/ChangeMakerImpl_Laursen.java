package changeMaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ChangeMakerImpl_Laursen implements ChangeMaker {

	private Set<Integer> denominations;
	private List<Integer> denominationsArray;
	// pre i <= 0 => !denominations.contains(i)

	public ChangeMakerImpl_Laursen(Set<Integer> denominations) {
		this.denominations = denominations;
		validateDenominations();
		Integer[] denominationsArray = new Integer[denominations.size()];
		int i = 0;
		for (Integer denomination : denominations) {
			denominationsArray[i++] = denomination; 
		}
		Arrays.sort(denominationsArray);
		this.denominationsArray = Arrays.asList(denominationsArray);
		Collections.reverse(this.denominationsArray);
 	}

	public ChangeMakerImpl_Laursen() {
		// TODO Auto-generated constructor stub
	}

	public void validateDenominations() {
		assert denominations != null;
		assert !denominations.contains(null);
	}

	// part of post: i in [0, returnValue.size() -1) --> returnvalue.get(i) > returnValue.get(i + 1)

	@Override
	public List<Integer> getDenominations() {
		return this.denominationsArray;
	}

	@Override
	public boolean canMakeExactChange(int valueInCents) {
		List<Integer> exactChange = new ArrayList<Integer>();
		Iterator<Integer> iterator = this.denominationsArray.iterator();
		while (iterator.hasNext()) {
			int coin = iterator.next();
			exactChange.add(valueInCents / coin);
			valueInCents = valueInCents % coin;
		}		
		return 0 == valueInCents;
	}

	// [100, 25, 10, 5, 1].getExactChange(0) should return [0, 0, 0, 0, 0]
	@Override
	public List<Integer> getExactChange(int valueInCents) {
		assert canMakeExactChange(valueInCents):"Cannot make exact change";
		//if(!canMakeExactChange(valueInCents)) {
			//throw new RuntimeException("cannot make exact change");
		//}
		List<Integer> exactChange = new ArrayList<Integer>();
		Iterator<Integer> iterator = this.denominationsArray.iterator();
		while (iterator.hasNext()) {
			int coin = iterator.next();
			exactChange.add(valueInCents / coin);
			valueInCents = valueInCents % coin;
		}
		return exactChange;
	}

	@Override
	public int calculateValueOfChangeList(List<Integer> changeList) {
		assert changeList.size() == denominationsArray.size():"Size of change list must be the same size as the denominations list";
		int valueOfChange = 0;
		for (int i = 0; i < changeList.size(); i++) {
			valueOfChange += changeList.get(i) * denominationsArray.get(i);
		}
		// post: i in [0, rv.size() - 1) ==> getDenominations.get(i) >
		// rv.get(i+1)*getDenominations.get(i+1)
		return valueOfChange;
	}

}