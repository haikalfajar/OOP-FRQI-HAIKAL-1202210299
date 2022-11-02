import java.util.List;
import java.util.ArrayList;

public class Database {
    // TODO Create List of Menu Object to Store Menu from Menu Class
    List<Menu> listMenu = new ArrayList<Menu>();
    // TODO Create Method to Insert Menu to Database
    public void InsertMenu(Menu menu){
        listMenu.add(menu);

    }

    // TODO Create Method to Show Menu from Database
    public void ShowMenu(){
        for (int i = 0; i < listMenu.size(); i++){
            System.out.println((i + 1) + "." + listMenu.get(i).menu + listMenu.get(i).category + listMenu.get(i).price);
        }

    }

    // TODO Create Method to Search Menu from Database
    public void SearchMenu(){
        
    }


}
