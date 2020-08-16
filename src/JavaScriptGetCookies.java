public class JavaScriptGetCookies {
    String cname= "Dipendra";
    String[] getCookies(){
        String name = cname + "=";
        String decodedCookie = "username=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;";
        String[] ca = decodedCookie.split(" ");
        System.out.println("the decode cookies is" + ca);
//        for(int i = 0; i <ca.length(); i++) {
//            String c = ca[i];
//            while (c.charAt(0) == ' ') {
//                c = c.substring(1);
//            }
//            if (c.indexOf(name) == 0) {
//                return c.substring(name.length(), c.length());
//            }
//        }
        return ca;
    };
    public static void main(String[] args){


    }
}
