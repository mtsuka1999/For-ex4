
class OracleTest {
    public static void main(String[] args) {
        int t=0;
        int h=0;
        System.out.println("Tossing a coin...");
        for (int num = 1; num < 4 ; num++){
            System.out.print("Round" + num+":");           
            int rand =(int)( Math.random()*2);
            switch (rand){
              case 0:
                System.out.println("tail");
                t++;
                break;
              case 1:
                System.out.println("head");  
                h++;
                break;
          }
         }
         System.out.println("Heads:" + h + "," + "Tails:" + t);
if (h>t) System.out.println(str+" won!");
else System.out.println("You lost.");
    }
}
