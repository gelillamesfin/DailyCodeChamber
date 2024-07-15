public class Evens {

    public static void main(String[]arg){
        int count=0;
         for(int i=0; i<=100;i++){
             
                System.out.println(i);
                int temp=count+1;
                count=temp;
           
        }
    }

    public static void indexValue(String [] args){
        for (int idx=0; idx <100;idx++){
            for (int j=0; j<100;j+=2){
                System.out.println("the index value of idx was " + idx );
            }
        }
    }
 
}
