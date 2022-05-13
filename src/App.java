import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("201920667 최준태");
		String path = null;
		int count[] = {0,0,0};
		 List<String> fashion = new ArrayList<String>();
		
		while(true)// 주소를 받는 while문
		{
			try
			{
				System.out.println("Enter file path : ");
				Scanner sc = new Scanner(System.in);
				path = sc.nextLine();
				File.fileLineRead(path);
				break;
			}
			catch(FileNotFoundException  e1)
			{
				System.out.println( e1.toString());
				count[0]++;
			}			
		}

		int array[][] = new int [29][29];
    	double sum=0;
    	count[2] = File.fileLineRead(path).size() - 28*28;	//	ArrayIndexOutOfBoundsException 카운트
	    while (true) // 파일 읽기
	    {
	    	int temp=0;
	    	try
	    	{
	    		temp=0;
	    		sum=0;
	    		for(int i=0;i<28;i++)
	    		{
	    			for(int j=0;j<28;j++)
	    			{
	    				if(fashion.size()==temp)
	    					fashion.add(File.fileLineRead(path).get(temp));
	    	    		array[i][j]= Integer.parseInt(fashion.get(temp));
	    	    		sum += Integer.parseInt(fashion.get(temp));
	    	    		temp++;
	    			}
	    		}
	    		break;
	    	}
	    	catch(NumberFormatException e2)
	    	{
	    		System.out.println(e2.toString());
	    		fashion.set(temp,"3000");
	    		count[1]++;
	    	}	    	
	    }

		System.out.println("");
		System.out.println("Average : " + sum/(28*28));
		System.out.println("Total FileNotFoundException : "+ count[0]);
		System.out.println("Total NumberFormatException : "+ count[1]);
		System.out.println("Total ArrayIndexOutOfBoundsException : "+ count[2]);
	}
}
