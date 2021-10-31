package leetproblems;

public class Q1108_DefangingAnIPAddress {
	public String defangIPaddr(String address) {
		// return address.replaceAll("\\.","[\\.]");

		StringBuilder result = new StringBuilder();
		for (char ch : address.toCharArray()) {
			if (ch == '.')
				result.append("[.]");
			else
				result.append(ch);
		}
		return result.toString();
	}
}
