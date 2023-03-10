package homework019;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * FileName: Task03
 * Author:   Andriy Vulook
 * Date:     10.03.2023 2:11
 * Description: Assortment of products in stores
 */

@Getter
@AllArgsConstructor
@ToString
class Price {
    private String productName;
    private String storeName;
    private double price;
}


public class Task03 {

    public static void main(String[] args) {

        String inputProduct;
        String inputStore;
        double inputPrice;
        List<Price> prices = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter product details No.: " + (i+1));
            System.out.print("Product name: ");
            inputProduct = s.nextLine();
            System.out.print("Store name: ");
            inputStore = s.nextLine();
            System.out.print("Price in UAH: ");
            inputPrice = s.nextDouble();
            prices.add(new Price(inputProduct, inputStore, inputPrice));
        }

    }


}
