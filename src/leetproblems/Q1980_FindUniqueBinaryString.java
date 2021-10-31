package leetproblems;

public class Q1980_FindUniqueBinaryString {
//	public String findDifferentBinaryString(String[] nums) {
//		int n = nums.length;
//		int b = nums[0].length();
//		HashSet<Integer> set = new HashSet<>();
//		for (String x : nums)
//			set.add(Integer.parseInt(x, 2));
//		for (int i = 0; i < (int) Math.pow(2, b); ++i) {
//			if (!set.contains(i)) {
//				String val = Integer.toBinaryString(i);
//				if (val.length() < b)
//					for (int k = val.length(); k < b; ++k)
//						val = "0" + val;
//				return val;
//			}
//		}
//		return "";
//	}

	public String findDifferentBinaryString(String[] nums) {
		String result = "";
		for (int i = 0; i < nums.length; ++i) {// change diagonal bit to opposite bit
			if (nums[i].charAt(i) == '0')
				result += "1";
			else
				result += "0";
		}
		return result;
	}
}
