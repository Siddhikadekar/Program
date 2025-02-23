import java.util.*;

class Collections2
{
    public static void main(String arg[])
    {
        Hashtable <String, Integer> hobj = new <String , Integer>();

        hobj.put("PPA",19000);
        hobj.put("LB",15990);
        hobj.put("Angular",19200);
        hobj.put("Python",16000);

        System.out.println(hobj.get("Python"));
        Enumeration eobj = hobj.keys();
        while(eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElements());
        }
    }

}