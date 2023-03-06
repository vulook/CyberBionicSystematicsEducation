package homework005;

/**
 * FileName: Task06
 * Author:   Andriy Vulook
 * Date:     15.02.2023 1:07
 * Description: DeMorganComparison
 * ----------------------------------------------------------------------------
 * Для застосування теорем де Моргана до логічного оператора AND або OR та пари операндів
 * потрібно інвертувати обидва операнди, замінити (AND на OR) або (OR на AND) та інвертувати
 * весь вираз повністю
 * A | B = !(!A & !B)
 */

public class Task06 {

    public static void main(String[] args) {
        boolean A = true;
        boolean B = false;

        if (A | B)
            System.out.println("A | B = " + (A | B));
        else
            System.out.println("A | B = " + (A | B));

        if (!(!A & !B))
            System.out.println("!(!A & !B) = " + !(!A & !B));
        else
            System.out.println("!(!A & !B) = " + !(!A & !B));
    }

}
