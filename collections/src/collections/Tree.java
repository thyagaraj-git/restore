package collections;
import java.util.*;
public class Tree {
	public static void main(String args[])
	{
//		Long p1=9983434322L;
//		Long p2=8843432442L;
//		Long p3=9832323221L;
//		Long p4=9932323333L;
//
//
//		contacts c1=new contacts(p1,Name:"man1",Email:"man1@gmail.com",Gender.male);
//		contacts c2=new contacts(p2,Name:"man2",Email:"man2@gmail.com",Gender.male);
//		contacts c3=new contacts(p3,Name:"woman1",Email:"woman1@gmail.com",Gender.female);
//		contacts c4=new contacts(p4,Name:"man3",Email:"man3@gmail.com",Gender.male);
//		
		TreeMap<Long,contacts> show=new TreeMap<>();
		show.put(9983434322L, new contacts(9983243212l,"man1","man1@gmail.com",Gender.male));
		show.put(9343657765L, new contacts(9983243233l,"man2","man2@gmail.com",Gender.male));
		show.put(8875655453L, new contacts(9983243666l,"woman1","woman1@gmail.com",Gender.female));
		
		//System.out.println(show);
		Set<Long>keys=show.keySet();
		for(long i:keys)
		{
			System.out.println(i);
		}
		
		for(Map.Entry<Long,contacts>entry:show.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
	}
}
enum Gender{
	male,female,undefined;
}

