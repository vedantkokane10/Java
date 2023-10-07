 class Loops {
    public static void main(String[] args) {
        // for
        System.out.println("For");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("for without initiazlization or increment");
        int i = 1;
        for(;i<=10;){
            System.out.println(i);
            i++;
        }

        // while - condition is checked first
        System.out.println("while");
        int n1 = 5;
        while(n1>0){
            System.out.println(n1);
            n1--;
        }

        // do-while - condtion is checked afterwards
        System.out.println("Do while");
        int n2 = 5;
        do{
            
            System.out.println(n2);
            n2++;
        }while(n2<=4);

    }
}
