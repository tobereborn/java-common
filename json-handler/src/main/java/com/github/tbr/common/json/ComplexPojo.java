package com.github.tbr.common.json;

import java.util.Arrays;

public class ComplexPojo {
	private SimplePojo simplePojo;
	private String strField;
	private int intField;
	private boolean booleanField;
	private int[] intArray;

	public SimplePojo getSimplePojo() {
		return simplePojo;
	}

	public void setSimplePojo(SimplePojo simplePojo) {
		this.simplePojo = simplePojo;
	}

	public String getStrField() {
		return strField;
	}

	public void setStrField(String strField) {
		this.strField = strField;
	}

	public int getIntField() {
		return intField;
	}

	public void setIntField(int intField) {
		this.intField = intField;
	}

	public boolean isBooleanField() {
		return booleanField;
	}

	public void setBooleanField(boolean booleanField) {
		this.booleanField = booleanField;
	}

	public int[] getIntArray() {
		return intArray;
	}

	public void setIntArray(int[] intArray) {
		this.intArray = intArray;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (booleanField ? 1231 : 1237);
		result = prime * result + Arrays.hashCode(intArray);
		result = prime * result + intField;
		result = prime * result + ((simplePojo == null) ? 0 : simplePojo.hashCode());
		result = prime * result + ((strField == null) ? 0 : strField.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComplexPojo other = (ComplexPojo) obj;
		if (booleanField != other.booleanField)
			return false;
		if (!Arrays.equals(intArray, other.intArray))
			return false;
		if (intField != other.intField)
			return false;
		if (simplePojo == null) {
			if (other.simplePojo != null)
				return false;
		} else if (!simplePojo.equals(other.simplePojo))
			return false;
		if (strField == null) {
			if (other.strField != null)
				return false;
		} else if (!strField.equals(other.strField))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ComplexPojo [simplePojo=" + simplePojo + ", strField=" + strField + ", intField=" + intField
				+ ", booleanField=" + booleanField + ", intArray=" + Arrays.toString(intArray) + "]";
	}

}
