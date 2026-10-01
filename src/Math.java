class Math  {
    // global variables
   static   int x=25;
   static int y=10;
   static int c ;


    static void  add () {

         c= x+y;
        System.out.println(c);

    }

    static void sub () {

        if(x>y) {

         c = x-y;
            System.out.println( "x is grater than y  "+c);
        }
        else  {
            c= y-x;
            System.out.println( "y is grater than x  "+c);

        }

    }





}