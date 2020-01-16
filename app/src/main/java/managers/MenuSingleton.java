package managers;


import entities.Menu;

public class MenuSingleton {

    private static MenuSingleton instance = null;

    private Menu menu;

    private MenuSingleton() {
    }

    public static synchronized MenuSingleton getInstance() {
        if(instance == null)
            instance = new MenuSingleton();
        return instance;
    }


    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
