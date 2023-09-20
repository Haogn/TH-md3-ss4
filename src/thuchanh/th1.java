package thuchanh;

import java.util.Scanner;

public class th1 {
    public static void main(String[] args) {
        // nhap va in ra mang co gia tri dao nguoc

        // khai bao cac bien
        int size ;
        int[] arr ;
        Scanner sc = new Scanner(System.in) ;
        do {
            System.out.print("Nhap kich thuoc");
            size = sc.nextInt();
            if (size > 10 ) {
                System.out.println("Kich thuoc lon khong vuot qua 20 ");
            }
        } while (size > 10);
        // gan cho mang co 10 gia tri
        arr = new int[size] ;
        int i = 0 ;
        while ( i < arr.length) {
            System.out.print("Nhap gia tri cho mang #"+(i+1) + ": ");
            arr[i] = sc.nextInt();
            i++ ;
        }
        // in ra mang da nhap
        System.out.printf("%-20s%s", "Gia tri cua mang : ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+"\t");
        }

        // dao nguoc lai mang 
        for (int j = 0; j < arr.length/2; j++) {
            int temp = arr[j];
            arr[j]=arr[size -1 -j];
            arr[size-1-j] = temp;
        }
        //        In ra mảng đã đảo ngược thứ tự các phần tử
        System.out.printf("\n%-20s%s", "Mang bi dao nguoc: ", "");
        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + "\t");
        }
    }
}
