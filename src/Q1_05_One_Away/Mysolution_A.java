package Q1_05_One_Away;

public class Mysolution_A {
	public static boolean oneEditAway(String s, String t) {
		
		boolean oneEdit = false;
		int l_s = s.length();
		int l_t = t.length();
		if(Math.abs(l_s - l_t) > 1) {
			return false;
		}
		
		/*we can fix the pattern if two patterns are symmetric*/
		String s1 = l_s < l_t ? s : t;
		String s2 = l_s < l_t ? t : s;
		
		int i = 0, j = 0;
		
		while(i < l_s && j < l_t) {
			if(s1.charAt(i) != s2.charAt(j)) {
				if(oneEdit)
					return false;
				oneEdit = true;
				if(l_s == l_t) {
					i++;
				} 
			} else {
				i++;
			}
			j++;
		}
		return true;
		
	}
}
