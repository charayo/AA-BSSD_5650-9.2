public class Main {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("Pancake house menu", "breakfast menu");
        MenuComponent dinerMenu = new Menu("ObjectTown menu", "lunch menu");
        MenuComponent cafeMenu = new Menu("Cafe menu", "dinner menu");
        MenuComponent dessertMenu = new Menu("dessert menu", "enjoy dinner!!");

        MenuComponent breakFastMenu = new Menu("Breakfast Menu", "All breakfast menu");
        MenuComponent lunchMenu = new Menu("Lunch Menu", "All lunch menu");
        MenuComponent vegiMenu = new Menu("Vegetarian Dessert", "Just vegetarian menu");
        MenuComponent allMenus = new Menu("all menus", "all menus");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem("ET Pancakes", "Eggs, Toast, Pancakes",true, 2.09));
        pancakeHouseMenu.add(new MenuItem("Pancakes", "Pancakes",true, 2.09));
        pancakeHouseMenu.add(new MenuItem("ET", "Eggs & Toast",true, 2.09));
        pancakeHouseMenu.add(new MenuItem("Waffles", "Lumpy Pancakes",false, 2.09));

        dinerMenu.add(new MenuItem("pasta", "pasta with bread",true,2.90));
        dinerMenu.add(new MenuItem("pasta meat", "pasta with meatballs",false,3.89));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("apple pie", "apple with",true, 1.59));

        breakFastMenu.add(pancakeHouseMenu);
        breakFastMenu.add(dinerMenu);

        lunchMenu.add(dinerMenu);
        lunchMenu.add(cafeMenu);

        vegiMenu.add(dessertMenu);


        WaiterBot superBot = new WaiterBot(allMenus);
        System.out.println("-----------------------------------------------------------------------------------------");
        superBot.print();
        System.out.println("-----------------------------------------------------------------------------------------");
        superBot.printVegetarianMenu();
        System.out.println("******************************************************************************************");

        WaiterBot miniBot = new WaiterBot(breakFastMenu);
        System.out.println("-----------------------------------------------------------------------------------------");
        miniBot.print();
        System.out.println("******************************************************************************************");

        WaiterBot lunchBot = new WaiterBot(lunchMenu);
        System.out.println("-----------------------------------------------------------------------------------------");
        lunchBot.print();
        System.out.println("******************************************************************************************");

        WaiterBot dessertBot = new WaiterBot(vegiMenu);
        dessertBot.printVegetarianMenu();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("******************************************************************************************");

    }
}