import java.util.LinkedList;

/**
 * Name: فطوم القريشي
 * Group: CYN_G2
 * Project: Data Structure Assignment 1
 */
public class ffaadd {
    public static void main(String[] args) {
        // إنشاء القائمة المرتبطة (LinkedList) لتطبيق الأسئلة عليها
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("--- Data Structure Assignment 1 ---");
        System.out.println("Original List: " + list);

        // Question 2: Write a program in Java to remove a random element
        if (!list.isEmpty()) {
            list.remove(1);
            System.out.println("Q2 - List after removing index 1: " + list);
        }

        // Question 4: Write a program in Java to reverse an array/list
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        System.out.println("Q4 - Reversed List: " + reversedList);

        // Question 6: Write a function to rotate a linked list to the right by k places
        int k = 1;
        if (!reversedList.isEmpty()) {
            int last = reversedList.removeLast();
            reversedList.addFirst(last);
        }
        System.out.println("Q6 - List after rotating right by " + k + ": " + reversedList);

        // Question 8: Write a function to find the index of a given data value
        int valueToFind = 30;
        int index = reversedList.indexOf(valueToFind);
        System.out.println("Q8 - Index of value " + valueToFind + " is: " + index);

        // Question 10: Write a function to remove duplicate elements
        reversedList.add(30); // إضافة عنصر مكرر للتجربة
        System.out.println("Q10 - List with duplicate: " + reversedList);
        LinkedList<Integer> noDuplicates = new LinkedList<>();
        for (Integer val : reversedList) {
            if (!noDuplicates.contains(val)) {
                noDuplicates.add(val);
            }
        }
        System.out.println("Q10 - List after removing duplicates: " + noDuplicates);
    }
}
