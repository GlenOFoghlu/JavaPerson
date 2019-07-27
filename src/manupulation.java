
public class manupulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String date = "19/7/2019";
			String[] temp;
			
			System.out.println(date);
			
			temp = date.split("/");
			
			System.out.println(temp[0]+1);
			System.out.println(temp[1]);
			System.out.println(temp[2]);
			
			int day = Integer.parseInt(temp[0]);			
			System.out.println(day+1);
			
			
	}

}
