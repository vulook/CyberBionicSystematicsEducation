package homework019;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.*;

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

class SortByStoreName implements Comparator<Price> {
    @Override
    public int compare(Price a, Price b) {
        return a.getStoreName().compareTo(b.getStoreName());
    }
}

public class Task03 {

    public static void main(String[] args) {

        String inputProduct;
        String inputStore;
        String searchStore;
        double inputPrice;

        List<Price> prices = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter product details No.: " + (i + 1));
            System.out.print("Product name: ");
            inputProduct = s.nextLine();
            System.out.print("Store name: ");
            inputStore = s.nextLine();
            System.out.print("Price in UAH: ");
            inputPrice = s.nextDouble();
            s.nextLine();
            prices.add(new Price(inputProduct, inputStore, inputPrice));
        }

        prices.sort(new SortByStoreName());
        printList(prices);


        System.out.println("Search by store:");
        searchStore = s.nextLine();

        try {
            printSearchStore(prices, searchStore);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static void printList(List<Price> prices) {
        System.out.println("\n");
        for (Price price : prices) {
            System.out.println((prices.indexOf(price) + 1) + ". "
                    + price.getProductName() + ", "
                    + price.getStoreName() + ", "
                    + price.getPrice());
        }
        System.out.println("\n");
    }

    static void printSearchStore(List<Price> prices, String searchStore) throws IllegalArgumentException {
        boolean flag = false;

        for (Price price : prices) {
            if (price.getStoreName().equalsIgnoreCase(searchStore)) {
                System.out.println((prices.indexOf(price) + 1) + ". "
                        + price.getProductName() + ", "
                        + price.getPrice() + " UAH");
                flag = true;
            }
        }

        if (!flag) {
            throw new IllegalArgumentException("Store not found.");
        }
    }

}
