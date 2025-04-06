
class lenoflongestString{
    public static void main(String[] args){
        System.out.println("Hello world");
        String str="this is an apple and that is an orange";
        int n=str.length();
        char arr[]=str.toCharArray();
        int vowels=0;
        int consonants=0;
        for(int i=0;i<n;i++){
            if(arr[i]=='a'){
                    vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("The total number of vowels are: "+vowels);
        System.out.println("The total number of Consonants are: "+Consonants);
        
    }
}