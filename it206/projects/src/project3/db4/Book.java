package project3.db4;

public class Book {
        private String isbn;
        private double cost;
        private boolean isNew;
        private static double newPromotionDiscount;

        public Book() {
            this.isNew = true;
        }

        public Book(String isbn) {
            this();
            this.isbn = isbn;
        }

        public Book(String isbn, double cost) {
            this();
            this.isbn = isbn;
            this.cost = cost;
        }

        public String getIsbn() { return this.isbn; }
        public double getCost() { return this.cost; }
        public boolean isNew() { return this.isNew; }
        public static double getNewPromotionDiscount() { return newPromotionDiscount; }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public boolean setCost(double cost) {
            if (cost >= 0) {
                this.cost = cost;
                return true;
            }
            else {
                return false;
            }
        }

        public void setIsNew(boolean isNew) {
            this.isNew = isNew;
        }

        public static boolean setNewPromotionDiscount(double discount) {
            if (newPromotionDiscount >= 0.00) {
                newPromotionDiscount = discount;
                return true;
            }
            else {
                return false;
            }
        }

        public boolean discount(double percentage) {
            if (percentage > 0) {
                if (this.isNew()) {
                    setCost(this.getCost() - this.getCost() * (percentage/100) - getNewPromotionDiscount());
                }
                else {
                    setCost(this.getCost() - this.getCost() * (percentage/100));
                }
                return true;
            }
            else {
                return false;
            }
        }
    }
