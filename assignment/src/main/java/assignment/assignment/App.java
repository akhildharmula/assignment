package assignment.assignment;

import java.util.TreeMap;

public class App 
{
    public static void main( String[] args )
    {
        TreeMap<String,String> s=new TreeMap<String, String>();
        
        s.put("Java","abc");
        s.put("Python", "cdf");
        s.put("ai", "ghf");
        
        for(String key:s.keySet())
        {
        	System.out.println(key+"="+s.get(key));
        }
    }
}
