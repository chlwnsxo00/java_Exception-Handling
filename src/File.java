import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class File {
    public static List<String> fileLineRead(String path) throws IOException {
        List<String> file = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String s;
        String []items;
        while ((s = bufferedReader.readLine()) != null) {
        	items = s.split(",");
        	for(int i=0;i<items.length;i++)
        	{
        		file.add(items[i]);
        	}
        }
        bufferedReader.close();
        return file;
    }
    File file = new File();
    public void addFile()
    {
    
    }
}
