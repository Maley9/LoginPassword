import java.util.HashMap;

public class IDandPassword {

    HashMap<String, String> logininfo = new HashMap<String,String>();

    IDandPassword(){
        logininfo.put("Bro", "pizza");
        logininfo.put("Bromatheus", "burger");
        logininfo.put("BroCode", "tortilla");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
