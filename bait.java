class bait{
    public static void main(String[] args){
        System.out.println("We have a string array now");
        String arr="My name is Shadat Rolli";
        
        int n=arr.length();
        char arr1[]=arr.toCharArray();
        
        int count=0;
        for(int i=0;i<n;i++){
            if(arr1[i]==' '){count++;}

        }
        System.out.println(count);


    }
}