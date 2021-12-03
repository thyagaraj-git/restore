import java.util.*;
import java.util.stream.Stream;

public class main {
public static void main(String args[])
{
	List<Fruit>f1=new ArrayList<Fruit>();
	f1.add(new Fruit("grapes",111,45,"black"));
	f1.add(new Fruit("mango",200,110,"yellow"));
	f1.add(new Fruit("apple",300,120,"red"));
	f1.add(new Fruit("strawberry",350,250,"red"));
	f1.add(new Fruit("orange",100,50,"orange"));
	
	f1.stream().filter(f->f.getPrice()<100).forEach(f->System.out.println(f.getName()));
	System.out.println(".......................");
	f1.stream().anyMatch(f->f.getColor());
	f.forEach(f->System.out.println(f.getColor()+" "+f.getName()));
	f1.stream().filter(f->f.getColor()=="red").forEach(f->System.out.println("price: "+f.getPrice()+" "+f.getName()));
	System.out.println(".......................");
	
	
	
	//Stream<Fruit>fruitsfiltered=Stream().filter(f->f.getPrice<100);
//	Stream<Fruit>f1=Stream().filter(f->f,price<=100);
	
	List<News>n1=new ArrayList<News>();
	n1.add(new News(1,"mike","suresh","budget"));
	n1.add(new News(1,"tyson","ramesh","get"));
	n1.add(new News(1,"ravi","veeresh","budget"));
	n1.add(new News(1,"sandi","kiran","bud"));
	
}
}
