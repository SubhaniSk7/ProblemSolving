package leetproblems;

import java.util.HashSet;

public class Q929_UniqueEmailAddresses {
	public static void main(String[] subhani) {
		Q929_UniqueEmailAddresses obj = new Q929_UniqueEmailAddresses();
		String[] emails = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		System.out.println(obj.numUniqueEmails(emails));
	}

	public int numUniqueEmails(String[] emails) {
		HashSet<String> set = new HashSet<>();
		int n = emails.length;
		for (int i = 0; i < n; ++i) {
			String mail = emails[i], domain = mail.substring(mail.indexOf("@"));
			StringBuffer sb = new StringBuffer();
			for (char ch : mail.toCharArray()) {
				if (ch == '.')
					continue;
				else if (ch == '+' || ch == '@')
					break;
				else
					sb.append("" + ch);
			}
			set.add(sb.toString() + domain);
		}
		return set.size();
	}
}
