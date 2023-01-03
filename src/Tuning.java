public class Tuning {

    private static String[] chromaticScale = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
    private static String[] validNotes = {"A", "A#", "Bb", "B", "C", "C#", "Db", "D", "D#", "Eb", "E", "F", "F#", "Gb",
                                            "G", "G#", "Ab"};
    private String name;
    private String[] notes = new String[6];
    private boolean validTuning = true;

    public Tuning(){
        name = "Unnamed Tuning";
        //TODO add option to default notes to standard tuning
    }

    public Tuning(String aName, String aNotes){
        this();
        name = aName;
        String[] splitInput = aNotes.split(",");
        if(splitInput.length != 6){
            System.out.println("ERROR: I can't create a tuning with "+splitInput.length+" notes!");
            this.validTuning = false;
            return;
        } else {
            for(int i = 0; i < notes.length; i++){
                boolean validNote = false;
                for(int j = 0; j < validNotes.length; j++){
                    if(validNotes[j].equalsIgnoreCase(splitInput[i])){
                        validNote = true;
                    } else {
                        continue;
                    }
                }
                if(validNote == true){
                    notes[i] = splitInput[i];
                } else {
                    System.out.println("ERROR: "+splitInput[i]+" isn't a note that I recognize! :(");
                    this.validTuning = false;
                }
            }
        }
    }

    //TODO transpose all notes in the tuning up or down "halfsteps" number of half steps, and return the result
    public Tuning transpose(int halfsteps){
        Tuning newTuning = new Tuning();
        int[] currentIndices = new int[6];
        //TODO get each index's "current position" in the chromatic scale and represent it as an int
        return newTuning;
    }

    //TODO finds the key of the tuning in question by looking at the root note and comparing it to the rest
    public void findKey(){
    }

    public void viewDetails(){
        if(validTuning == true){
            System.out.println("Tuning name: "+name);

            String noteList = "";
            for(int i = 0; i < 5; i++){
                noteList += (notes[i] + ", ");
            }
            noteList += notes[5]; // last note doesn't end in a comma + space
            
            System.out.println("Notes: "+noteList);
            System.out.println("________");
        } else {
            System.out.println("ERROR: There was something wrong with the ("+name+") tuning. "+
            "No results will be shown.");
            System.out.println("________");
        }

    }
    
    
}
