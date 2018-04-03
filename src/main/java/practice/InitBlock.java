package practice;

 public class InitBlock {
    {
        System.out.println("This is an Initializer block1");
    }
     {
         System.out.println("block two");
     }

     InitBlock(){
         System.out.println("Im a constructor");
     }
    public static void main (String args[]){
        InitBlock ib = new InitBlock();
    }

}
/*
 class TestInit{
    pu
}
*/
