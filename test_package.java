import Graphics.Area;
  public class test_package {
            public static void main(String[]args)
             {
               Area A =new Area();

               System.out.println("**COMPUTATION OF AREA OF DIFFERENT FIGURES**");
               System.out.println("\n __RECTANGLE__");
               A.rectangle();
               System.out.println("\n __TRIANGLE__");
               A.triangle();
               System.out.println("\n __SQUARE__");
               A.square();
               System.out.println("\n __CIRCLE__");
               A.circle();
               }
}