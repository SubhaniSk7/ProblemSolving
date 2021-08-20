package interviewbit.bitmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountTotalSetBits {
	public static void main(String[] subhani) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(solve(n));
	}

	public static int solve(int A) {
		int n = A + 1, i = 2;
		long mod = 1000000007;
		A++;
		int ans = 0;
		while (A != 0) {
			ans = (int) ((ans
					+ (((n / i) * (i / 2)) % mod + ((n % i != 0) ? (n % i - i / 2 > 0 ? (n % i - i / 2) : 0) : 0))
							% mod)
					% mod);
			i = i * 2;
			A /= 2;
		}
		return ans;
	}
}

//long long int count=0;
//
//long long mod=1000000007;
//
//long long n=A+1,i=2;
//
//A++;
//
//int ans=0;
//
//while(A!=0){
//
//ans=(ans+(((n/i)(i/2))%mod+((n%i!=0)?(n%i-i/2>0?(n%i-i/2):0):0))%mod)%mod;
//
//i=i2;
//
//A=A/2;
//
//}
//
//return ans;
