
/**
 * AP CSA Problem Set 1.1
 *
 * Alicia Tang
 * September 12th, 2023
 */
public class MySolutions{
    
    public void celsuisToFahrenheit() {
       double C, F;
       C = 30.0;
       F = C * 9/5 + 32;
       System.out.println(C + "°C = " + F + "°F");
    }
    
      public void elapsedTime() {
        int H, M, S, SecondsInDay, SecondsLeft, TotalSeconds;
        double percent;
        H = 10;
        M = 53;
        S = 45;
        TotalSeconds = 24 * 60 * 60;
        SecondsInDay = (H * 3600) + (53 * 60) + 45; 
        SecondsLeft = (TotalSeconds)-SecondsInDay;
        
        percent = SecondsInDay/(24* 60 * 60.0) * 100; 
        
        System.out.print("The current time is " + H +":" + M +":"+ S +". ");
        System.out.println("It has been "+ SecondsInDay + " seconds since the day began.");
        System.out.println("There are "+ SecondsLeft + " seconds left in the day.");
        System.out.print("The day is "+percent+"% done");
    }
    
      public void secondsToHMS() {
        int totalS = 40950;
        int H, M, S;
        H = totalS/3600;
        M = (totalS - (H*3600))/60;
        S = totalS - (H*3600)- (M*60);
        System.out.println(totalS + " seconds = " + H + " hours, " + M + " minutes, and " + S + " seconds.");
    }
  
}
