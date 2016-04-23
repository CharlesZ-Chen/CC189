package Q1_09_String_Rotation;

public class MySolution {
	public static boolean isRotation(String s1, String s2) {
		if(s1 == null || s2 == null || s1.length() != s2.length() || s1.length() < 1)
			return false;
		String s = s1 + s1;
		return Question.isSubstring(s, s2);
	}
}
