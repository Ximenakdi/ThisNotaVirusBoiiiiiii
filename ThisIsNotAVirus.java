public class ThisIsNotAVirus{
  public static void main(String[] args){
    try {
      System.out.println("");
      System.out.println("You must be running this program because you miss me");
      Thread.sleep(3000);
      System.out.println("but don´t worry, man. I will appear...");
      Thread.sleep(3000);
      System.out.println("... someday.");
      Thread.sleep(3000);
      System.out.println("");
      System.out.println("Just please, remember this:");
      System.out.println("");
      Thread.sleep(4000);
      System.out.println("I LOVE YOU VERY VERY VERY MUCH \u2764	");
      System.out.println("");
      Thread.sleep(4000);
    } catch(InterruptedException ex) {
      Thread.currentThread().interrupt();
    }
  }
}
