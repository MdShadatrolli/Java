class enum1{
    enum Days{
        Sunday,Monday,Wednesday,Thursday,Friday,Saturday;
    }

    public static void main(String[]args){
        /*
         enum methods:
         1- Days.values()
         2-
         */
        
        for(Days d: Days.values()){
            System.out.println(d+" at index "+d.ordinal()+" and name is "+d.name());

        }
        Days d1=Days.Saturday;
        System.out.println(" and value of string is "+d1.valueOf("Sunday"));

    }
}