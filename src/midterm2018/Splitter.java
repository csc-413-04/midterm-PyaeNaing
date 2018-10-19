package midterm2018;

public class Splitter {

    public String [] line = null;
    String Host = "";
    String toadd = "";

    public Splitter(String Request)
    {
        line = Request.split("\n");
        toadd = line[0];
        Host = line[1];
    }

    public String getHost()
    {
        String HostName [] = Host.split(" ");
        return HostName[1];
    }

    public int aandb()
    {
        String a,b;
        int c = 0,d = 0;
        try{
        String temp [] = toadd.split(" ");
        String req = temp[1];
        temp = req.split("&");
        a = temp[0];
        b = temp[1];

        temp = a.split("=");
        a = temp[1];

        temp = b.split("=");
        b = temp[1];

        c = Integer.valueOf(a);
        d = Integer.valueOf(b);
        }catch (Exception e){}

        return c+d;
    }
}
