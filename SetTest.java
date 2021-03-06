import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class SetTest{
	public static void main(String[] args){
		Set<String> words = new HashSet<String>();
		long totalTime = 0;
		try(Scanner in = new Scanner(System.in)){
			while(in.hasNext()){
				String word = in.next();
				long callTime = System.currentTimeMillis();
				words.add(word);
				callTime = System.currentTimeMillis() - callTime;
				totalTime += callTime;
			}
		}
		Iterator<String> iter = words.iterator();
		for(int i = 0; i < 10 && iter.hasNext(); i++){
			System.out.println(iter.next());
		}
		System.out.println(words);

		System.out.println("words number:"+words.size()+"total time:"+totalTime);
	}
}
