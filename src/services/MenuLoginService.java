package services;

import util.InterfaceUtil;
import bean.Menu;
import bean.User;

import java.util.Scanner;

public class MenuLoginService extends MenuService implements MenuLoginServiceInterface {
    public static String input;
    static MenuLoginService mls = new MenuLoginService();

    public void checkUser() {

        User u = new User();
        int i;
        Scanner scan = new Scanner(System.in);
        for (i = 0; i < 3; i++) {
            System.out.println("Enter a username:");
            String username = scan.nextLine();
            System.out.println("Enter a password");
            String password = scan.nextLine();
            if (username.equalsIgnoreCase(u.getUsername()) && (password.equalsIgnoreCase(u.getPassword()))) {
                mls.callMenu();
                break;

            }
        }
        if (i == 3) {
            System.out.println("You banned!");
        }
    }

    @Override
    public void process() {
        mls.checkUser();
    }

    @Override
    public void callMenu() {
        Menu.showAll();
        System.out.println("Choose one of them");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        mls.checkCredentials();
    }

    @Override
    public void checkCredentials() {

        if (input.equals("1")) {
            InterfaceUtil.chooseOne(Menu.REGISTER);
//                    Menu.
        } else if (input.equals("2")) {
            InterfaceUtil.chooseOne(Menu.START);
        } else if (input.equals("3")) {
            InterfaceUtil.chooseOne(Menu.LOGOUT);
        } else if (input.equals("4")) {
            System.out.println("You exited");
        }


    }
}
