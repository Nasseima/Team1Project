package AnimalProject;

public class Animal {
    private String name;
    private double weight;
    public boolean fur;
    public String sound;
    public boolean warmOrCOld;
    public Animal (String name, boolean warmOrCOld, boolean fur, String sound, double weight ) {

        this.name = name;
        this.weight = weight;
        this.fur = fur;
        this.sound = sound;
        this.warmOrCOld = warmOrCOld;
    }

    public String MakeASound (String name, String sound) {
        return "This is animal, "+ name+ ", makes this sound "+ sound;
    }
    public boolean isWarmOrCOld () {
        boolean result = warmOrCOld ? true : false;

        return result;
    }

    public boolean isFurOrNot () {
        boolean result = fur ? true : false;

        return result;
    }

    public String getAnimalInfo () {
        return "It is " + warmOrCOld + " that this " + name+ " is warm blooded and its weight is " + weight;
    }
}

