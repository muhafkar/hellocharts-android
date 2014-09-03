package lecho.lib.hellocharts.model.provider;

/**
 * Single axis value, Use it to manually set axis labels position. You can use label attribute to display text instead
 * of number but value formatter implementation have to handle it.
 * 
 * @author Leszek Wach
 * 
 */
public class AxisValue {
	private float value;
	private char[] label;

	public AxisValue(float value) {
		this.value = value;
	}

	public AxisValue(float value, char[] label) {
		this.value = value;
		this.label = label;
	}

	public AxisValue(AxisValue axisValue) {
		this.value = axisValue.value;
		this.label = axisValue.label;
	}

	public float getValue() {
		return value;
	}

	public AxisValue setValue(float value) {
		this.value = value;
		return this;
	}

	public char[] getLabel() {
		return label;
	}

	public AxisValue setLabel(char[] label) {
		this.label = label;
		return this;
	}
}