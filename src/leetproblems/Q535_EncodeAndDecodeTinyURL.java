package leetproblems;

import java.util.HashMap;

public class Q535_EncodeAndDecodeTinyURL {
	HashMap<String, String> encodeMap = new HashMap<>();
	HashMap<String, String> decodeMap = new HashMap<>();

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {
		if (!encodeMap.containsKey(longUrl)) {
			String enc = "" + (encodeMap.size() + 1);
			encodeMap.put(longUrl, enc);
			decodeMap.put(enc, longUrl);
		}
		return encodeMap.get(longUrl);
	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		return decodeMap.get(shortUrl);
	}
}

//Your Codec object will be instantiated and called as such:
//Codec codec = new Codec();
//codec.decode(codec.encode(url));
