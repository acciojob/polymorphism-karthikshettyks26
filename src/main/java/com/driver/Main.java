package com.driver;

public class Main {

    public static class Product{

        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return (double)(x*y);
        }

    }
    public static void main(String[] args) {

        Product p = new Product();
        int ans1 = p.product(8,8);
        int ans2 = p.product(8,8,8);
        double ans3 = p.product(8.6,8.8);
        System.out.println(ans1+" "+ans2+" "+ans3);
    }

}