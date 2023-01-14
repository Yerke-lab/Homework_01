public class Main {
    public static void main(String[] args) {
       VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getProductList().add(new Product("Соломка соленая", 20));
        vendingMachine.getProductList().add(new Product("Венские вафли Яшкино", 10));
        vendingMachine.getProductList().add(new Baton("Батончик Марс", 10, 10.4324324234234));
        vendingMachine.getProductList().add(new SuperBaton("БОЛЬШОЙ Батончик Марс", 10, 10.4324324234234, TypeSize.BIG));
        vendingMachine.getProductList().add(new Milk("Молоко Домик в деревне", 30, 3.2));
        vendingMachine.getProductList().add(new Milk("Молоко У бабушки", 29, 2.5));
        vendingMachine.getProductList().add(new Chocolate("Geisha", 55, "35%"));


        for(Product product : vendingMachine.getProductList()) {
            System.out.println(product);
        }
    }


}
