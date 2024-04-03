public class Main {
  public static void main(String[] args) {

// winter, spring, summer, autumn
//warm jacket, t-shirt, swimsuit, sweater

    double temperature = 23.5 ;
    
    if (temperature <= 5){
    System.out.println("Wear super warm");
    }
    else if (temperature<=15){
        System.out.println("Wear warm");
    }
    else if (temperature<=30){
      System.out.println("Wear normal");
    }
    else if (temperature >30){
      System.out.println("You can walk naked");
    }
    else {
      System.out.println("Temperature?");
    }
  }
}
