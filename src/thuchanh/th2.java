package thuchanh;

import java.util.Scanner;

public class th2 {
    public static void main(String[] args) {
        String[] students = {"tien", "hoang", "thanh", "thang", "tam", "binh", "nam", "dung", "huy", "hai"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten hoc sinh ban muon tim kiem: ");
        String inputName = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++){
            if(students[i].toLowerCase().equals(inputName.toLowerCase())){
                System.out.println("vi tri " + inputName + " cua hoc sinh trong mang: " + i);
                isExist = true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("khon tim thay " +  inputName + " trong mang.");
        }
    }
}
