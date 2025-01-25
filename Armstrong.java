class Armstrong {
    public static void main(String[] args) {
        int i=1,arm;
        System.out.println("Armstrong numbers Between 1 to 4000");
        while(i<4000){
            arm=armstrong(i);
            if(arm==i)
                System.out.println(i);
                i++;
        }
    }
    static int armstrong(int num){
        int x,a=0;
        while(num!=0){
            x=num%10;
            a=a+(x*x*x);
            num/=10;
        }
        return a;
    }
}
