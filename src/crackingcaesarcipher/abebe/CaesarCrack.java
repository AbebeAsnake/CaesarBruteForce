package crackingcaesarcipher.abebe;

public class CaesarCrack {
	//we try all the possible key values so the size of the ALPHABET
	//actually a brute force attack 
	//there is only 27 possible encryptions
	public void crack(String cipherText) {
	for(int key=0;key<Constants.ALPHABET.length();++key ) {
		//initialize plaintext as an empty string 
		String plainText ="";
		//we just have to make a simple caesar decryption
		for(int i=0;i<cipherText.length();++i) {
			
			char character = cipherText.charAt(i);
			int charindex = Constants.ALPHABET.indexOf(character);
		int decryptIndex = Math.floorMod(charindex - key, Constants.ALPHABET.length());	
		plainText = plainText + Constants.ALPHABET.charAt(decryptIndex);
		}
		System.out.format("cracking caesar with %s key the result is : %s%n" ,key,plainText);
		
	}
	}

}
