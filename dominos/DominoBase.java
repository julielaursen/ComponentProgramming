package dominos;

public class DominoBase implements Domino {

	protected int highPipCount;
	protected int lowPipCount;
	protected int MIN_PIP_COUNT = 0;
	protected int MAX_PIP_COUNT = 6;
 	
	protected void validateHighLow() {
		assert MIN_PIP_COUNT <= lowPipCount:" Low count cannot be less than the min count";
		assert lowPipCount <= MAX_PIP_COUNT:"Low count cannot be more than the max count ";
		assert MIN_PIP_COUNT <= highPipCount: "High count cannot be less than the min count";
		assert highPipCount <= MAX_PIP_COUNT:"High count cannot be more than the max count";
		assert lowPipCount <= highPipCount:"High count cannot be less than the low count";
	}

	@Override
	public int getHighPipCount() {
		return highPipCount;
	}

	@Override
	public int getLowPipCount() {
		return lowPipCount;
	}

	protected void validateSumDifference(int sum, int difference) {
		assert 2 * MIN_PIP_COUNT <= sum:"twice the minimum pip count must be equal to or less than sum";
		assert sum <= 2 * MAX_PIP_COUNT:"sum must be less than or equal to twice the maximum pip count";
		assert -(MAX_PIP_COUNT - MIN_PIP_COUNT) <= difference:"the absolute value of max pip count - min pip count must be less than or equal to the difference";
		assert difference <= (MAX_PIP_COUNT - MIN_PIP_COUNT):"Difference must be less than or equal to the max pip count - the min pip count";
		assert difference <= sum:"Difference must be less than or equal to the sum";
	}

}
