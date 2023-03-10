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
        String inputstore;
        List<Price> prices = new ArrayList<>();
        Scanner s = new Scanner(System.in);



    }


}
