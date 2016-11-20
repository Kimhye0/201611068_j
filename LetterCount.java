import java.util.HashMap;

public class LetterCount{

	void countletter(){
		Map<String,Integer> m = new HashMap<String,Integer>();
		// m.getClass();
		char[] letters = "Sangmyung university".toCharArray();
		for(char c:letters){
			System.out.println(c);
			String s;
			s = Character.toString(c);
			if(m.containsKey(s)){
				m.put(s,m.get(s)+1);
			}
			else{
				m.put(s,1);
			}

			}
		System.out.println(m);
		}
		public static void main(String[] args) {
			LetterCount l = new LetterCount();
			l.countletter();
		}

	}

