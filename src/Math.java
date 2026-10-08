class Math  {
    // global variables
   static   int x=2583728;
   long j = 258372832932277L;
   short l = 23298;
   static int y=10;
   static int c ;
   String k = "5";
   char m = 'y';


    static void  add () {

         c= x+y;
        System.out.println(c);

    }

    static void sub () {

        if(x>y) {

         c = x+y;
            System.out.println( "x is grater than y  "+c);
        }
        else if ( x==y) {
            c =x-y;
            System.out.println("x and y are equal"+ c);

        }
        else  {
            c= y-x;
            System.out.println( "y is grater than x  "+c);

        }

    }





}