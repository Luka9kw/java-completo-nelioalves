package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product produto = new Product();

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        produto.nomeDoProduto = sc.nextLine();
        System.out.print("Price: ");
        produto.valorDoProduto = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        produto.quantidadeDoProduto = sc.nextInt();


        System.out.print("Product Data: ");
        System.out.println(produto);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int products = sc.nextInt();
        produto.adicionarProduto(products);

        System.out.println();
        System.out.print("Updated Data: ");
        System.out.println(produto);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        products = sc.nextInt();
        produto.removerProduto(products);

        System.out.println();
        System.out.print("Updated Data: ");
        System.out.println(produto);




        sc.close();
    }
}