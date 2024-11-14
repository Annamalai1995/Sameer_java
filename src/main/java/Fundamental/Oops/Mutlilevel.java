package Fundamental.Oops;
class Travels
{
    public void permit()
    {
        System.out.println("salem to chennai is available for the permit only");
    }
}
class bus extends Travels
{
    public void AravindTravels()
    {
        String volvo="Ac sleeper";
        String sleeper="Non Ac sleeper";
        System.out.println("Volvo:"+volvo);
        System.out.println("Sleeper bus :"+sleeper);


    }
}

class tours extends bus{
    public void tourist()
    {
        System.out.println("AC coach bus available");
        System.out.println("Non ac coach available");
    }
}


public class Mutlilevel {
    public static void main(String[] args) {
        tours tt= new tours();
        tt.tourist();
        tt.permit();
        tt.AravindTravels();
    }
}
