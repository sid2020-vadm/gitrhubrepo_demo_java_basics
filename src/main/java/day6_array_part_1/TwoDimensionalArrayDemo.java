package day6_array_part_1;

public class TwoDimensionalArrayDemo {
    public static void main(String[] args){
        int d[][]= new int[3][2];
        int a[][] ={
                {1,2},
                {3,4},
                {5,6}
                };

        System.out.println("length of rows "+a.length);
        System.out.println("length of columns "+a[0].length);
//        for (int i=0; i<a.length;i++){
//            for (int j=0; j<a[i].length;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println(" ");
//        }
//        for each loop
        for (int arr[]:a){
            for (int x:arr){
                System.out.print(x+" ");
            }
            System.out.println(" ");
        }

    }
}
