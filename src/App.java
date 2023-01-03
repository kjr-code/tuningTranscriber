public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Hello!");
        Tuning standardTuning = new Tuning("Standard", "E,A,D,G,B,E");
        standardTuning.viewDetails();
        Tuning shortTuning = new Tuning("Janky", "E,A,D,G,B");
        shortTuning.viewDetails();
        Tuning longTuning = new Tuning("Elongated", "E,E,A,D,G,B,E");
        longTuning.viewDetails();
        Tuning brokenTuning = new Tuning("Wonky", "E,A,D,G,H,E");
        brokenTuning.viewDetails();
    }
}
