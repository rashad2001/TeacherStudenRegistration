package bean;

import services.MenuLogoutService;
import services.MenuRegisterService;
import services.MenuService;
import services.MenuStartService;

public enum Menu {
    REGISTER(1, new MenuRegisterService()),
    START(2, new MenuStartService()),
    LOGOUT(3, new MenuLogoutService()),
    EXIT(4);


    private int number;
    private MenuService service;

    Menu(int a, MenuService service) {
        this.number = a;
        this.service = service;
    }

    Menu(int i) {
        this.number = i;
    }

    public void process() {
        service.process();
    }


    public static void showAll() {
        Menu[] values = Menu.values();
        for (Menu v : values) {
            System.out.println(v);

        }
    }
}
