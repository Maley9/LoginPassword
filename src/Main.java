public class Main {
    public static void main(String[] args) {
        IDandPassword id = new IDandPassword();



        LoginPage page = new LoginPage(id.getLoginInfo());
    }
}
