class enumtuto{
    enum ee{M,N,O,P;}
    public static void main(String[]args){
        for(int i=0;i<4;i++){
            System.out.print(ee.values()[i] + "\t");
        }
    }
}