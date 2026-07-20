public class ArmstrongNumber {
    public static boolean checkArmstrong (int num){
        int cntdigit=0;
        int n=num;
        while(n>0){
            n/=10;
            cntdigit++;
        }
        
        n=num;
        int sum=0;

        while(n>0){
            int digit = n%10;
            int power =1;
            for(int i=1; i<=cntdigit; i++){
                power = power*digit;           
            }
            sum +=power;
            n/=10;
        }
        return sum == num;   

    }
    public static void main(String args[]){
        System.out.println("Check Armstrog Number : ");
        int n = 53;
        if(checkArmstrong(n)){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong");        
        }
    }
}
