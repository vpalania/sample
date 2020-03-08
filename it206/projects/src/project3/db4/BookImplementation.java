package project3.db4;

import javax.swing.JOptionPane;


public class BookImplementation {
        public static void main(String[] args) {
            Book b1 = new Book("983657897");
            Book b2 = new Book();
            Book b3 = new Book("705824950", 9.95);
            System.out.println(Book.getNewPromotionDiscount());
        }
    }
