class LogicalOperators {
    public static void main(String[] args) {
        // && - AND , || - OR , ! - NOT
        int x = 5,y = 7;
        int a = 1, b = 3;
        boolean res1 = x<y && a<b;
        System.out.println(res1); 

        boolean res2 = x>y || a<b;
        System.out.println(res2); 

        boolean res3 = x<y && a<b;
        System.out.println(!res3); 
    }
}
