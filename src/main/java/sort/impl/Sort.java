package sort.impl;

public interface Sort {

	public enum Type {
		BUBBLE, COUNT, INSERT
	}

	public int[] sort(int[] numbers);
}
