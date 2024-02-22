public class Activity2 {

    public static void main(String[] args) {
        int arr[]={10,77,10,54,-11,10};
        int len=arr.length;
        int sum=0;
        for(int i=0;i<len;i++)
        {
            if(arr[i]==10)
            {
                sum=sum+arr[i];
            }
        }
        if(sum==30)
            System.out.println("Sum is 30");
        else
            System.out.println("Sum is not 30");
    }
}
