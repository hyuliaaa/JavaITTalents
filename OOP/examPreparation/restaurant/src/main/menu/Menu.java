package main.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Menu {
    HashMap<IMenuItem.MenuKind,HashMap<IMenuItem.MenuItemType, ArrayList<IMenuItem>>> menu;
    ArrayList<IThugItem> thugMenu;
    ArrayList<IVeganItem> veganMenu;

    public Menu(){
        menu = new HashMap<>();
        thugMenu = new ArrayList<>();
        veganMenu = new ArrayList<>();
        fillMenu();
    }

    public void addItem(MenuItem item){
        var kind =item.getKind();
        var type = item.getType();

        if(!menu.containsKey(item.getKind())){
            menu.put(item.getKind(), new HashMap<>());
        }
        if(!menu.get(item.getKind()).containsKey(item.getType())){
            menu.get(item.getKind()).put(item.getType(),new ArrayList<>());
        }
        menu.get(item.getKind()).get(item.getType()).add(item);
        if(item instanceof IThugItem){
            thugMenu.add((IThugItem) item);
        }
        if(item instanceof IVeganItem){
            veganMenu.add((IVeganItem) item);
        }
    }

    public void remove(IMenuItem item) {
        if(menu.containsKey(item.getKind())){
            if(menu.get(item.getKind()).containsKey(item.getType())){
                menu.get(item.getKind()).get(item.getType()).remove(item);
            }
        }
        if(item instanceof IThugItem){
            thugMenu.remove((IThugItem)item);
        }
        if(item instanceof IVeganItem){
            veganMenu.remove((IVeganItem)item );
        }
    }

    public IMenuItem pickRandomItem() {
        return menu.values().stream().findAny().get()//either drinks or meals
                .values().stream().findAny().get()//either salads or desserts or ...
                .stream().findAny().orElse(null);//random salad of dessert from the list


    }

    public IMenuItem pickRandomThugItem() {
        if(thugMenu.size()==0){
            return null;
        }
        return thugMenu.get(new Random().nextInt(thugMenu.size()));
    }

    public IMenuItem pickRandomVeganItem() {
        if(veganMenu.size()==0){
            return null;
        }
        return veganMenu.get(new Random().nextInt(veganMenu.size()));
    }

    private void fillMenu(){
        for(int i = 0; i <10;i++){
            addItem(new Salad("Ovcharska",350));
            addItem(new MainCourse("Parjolka", 400));
            addItem(new Dessert("Frenska selska",250));
        }

        for(int i = 0 ; i < 20 ; i++){
            addItem(new AlcoholDrink("Vodka"));
            addItem(new AlcoholDrink("Pepsi"));
        }
    }

    public void printMenu() {
        System.out.println("=====Printing Menu=========");
        for (Map.Entry<IMenuItem.MenuKind, HashMap<IMenuItem.MenuItemType, ArrayList<IMenuItem>>> e : menu.entrySet()) {
            System.out.println(e.getKey());
            for (Map.Entry<IMenuItem.MenuItemType, ArrayList<IMenuItem>> e1 : e.getValue().entrySet()) {
                System.out.println("\t"+e1.getKey()+" - " + e1.getValue().size());
            }
        }
    }
}
