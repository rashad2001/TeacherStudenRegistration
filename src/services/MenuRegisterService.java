package services;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MenuRegisterService extends MenuService {

    MenuLoginService mls = new MenuLoginService();

    @Override
    public void process() {
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter info:");
            String str = sc.nextLine();
            try {
                FileWriter fw = new FileWriter("participants.txt", true);
                fw.write(str + "\n");
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("successfully added");
        }
        mls.callMenu();
    }
}
