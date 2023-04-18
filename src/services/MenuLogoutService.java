package services;

import bean.Menu;

public class MenuLogoutService extends MenuService {
    public static void logoutProcess(Menu menu) {
        menu.process();
    }

    @Override
    public void process() {
        MenuLoginService mls = new MenuLoginService();
        mls.checkUser();
    }
}
