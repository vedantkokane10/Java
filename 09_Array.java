import java.lang.Math;
class Array {
    public static void main(String[] args) {
        // when we create array by default all values are 0
        // 1 Dimensional array
        int arr[] = new int[4]; // size = 4
        System.out.println(arr[0]);
        int arr1[] = {1,2,3,4,5};
        System.out.println(arr1[4]);

        for(int i=0;i<4;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for(int i=0;i<5;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n");

        // Multi-dimensional array
        int m1[][] = new int[3][3];
        m1[2][2] = (int)(Math.random() * 100);
        m1[1][0] = (int)(Math.random() * 100);
        m1[0][2] = (int)(Math.random() * 100);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(m1[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("\n");

        // Jaged arrays 
        // means an multi-dimensional array which can have any no of elements in rows
        int j1[][] = new int[3][];
        j1[0] = new int[2]; // first row will have 2 elements
        j1[1] = new int[4]; // second row will have 4 elements
        j1[2] = new int[3]; // third row will have 3 elements
        for(int i=0;i<j1.length;i++){
            for(int j=0;j<j1[i].length;j++){
                System.out.print(j1[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
