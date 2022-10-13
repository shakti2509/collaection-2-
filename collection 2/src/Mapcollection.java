import java.util.*;;

public class Mapcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="maharashtra";
		Map<Character, Integer> List=new HashMap<>();
   for(int i=0;i<str.length();i++)
   {
	 Character ch=str.charAt(i);
	 if(List.containsKey(ch))
	 {
		 int n=List.get(ch);
		 List.put(ch,++n);
	 }
	 else
		 List.put(ch, 1);
   }
   for(Map.Entry<Character,Integer>entry:List.entrySet())
{
	System.out.println("\t"+entry.getKey()+"\t"+entry.getValue());
}
		
	}

}
