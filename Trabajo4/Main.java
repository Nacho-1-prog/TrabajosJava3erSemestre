package Trabajo3;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("1234", "Raid", 1200.00);
        Product product2 = new Product("1234", "Fly", 1201.00);

        if(product1.equals(product2)){
            System.out.println("son iguales");
        }else{
            System.out.println("no iguales");
        }
    }
}
