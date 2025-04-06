class evenodd{

    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        int temp=0;
        int odd=0;
        for(int i=0;i<=5;i++){
            if(i%2==0){
                temp=temp+arr[i];
            }
            else{
                odd=odd+arr[i];

            }
        }
        System.out.println("The sum of even places in the array is : "+temp);
        System.out.println("The sum of odd places in the array is : "+odd);


    }
}