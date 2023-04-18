package bean;

import services.MenuLoginService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuLoginService mls = new MenuLoginService();
        mls.checkUser();
    }


}