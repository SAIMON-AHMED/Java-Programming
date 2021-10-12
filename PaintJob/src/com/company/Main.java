package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.26, 0.75));
    }

        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
            int buyBuckets = 0;
            if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {

                return -1;
            } else {
                buyBuckets = (int) (Math.ceil(((double) (width * height) - (double) (areaPerBucket * extraBucket)) /(double) areaPerBucket));
            }
            return buyBuckets;
        }

        public static int getBucketCount(double width, double height, double areaPerBucket){
            int buyBuckets = 0;
            if (width <= 0 || height <= 0 || areaPerBucket <= 0){
                return -1;
            } else {
                buyBuckets = (int) (Math.ceil((width * height) / areaPerBucket));
            }
                return buyBuckets;
        }

        public static int getBucketCount(double area, double areaPerBucket){
            int buyBuckets = 0;
            if (area <= 0 || areaPerBucket <= 0){
                return -1;
            } else {
                buyBuckets = (int) (Math.ceil(area / areaPerBucket));

            }
                return buyBuckets;
        }
}


