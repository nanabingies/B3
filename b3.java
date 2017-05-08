/* MR Eklu den this ein TA's kraa dey worry *
  * make we look sharp then plete this programming stress *
  * /
import java.util.*;

interface Animal{
  String attribute();
};

interface Aves extends Animal{
  String flies();
};

interface Terrestrial extends Animal{
  String walkOnLands();
  
};

interface Aquatic extends Animal{ 
  String swims();
};

interface Amphibians extends Terrestrial, Aquatic{
  String haveLungsGills();
}

interface flyingAnimals extends Aves, Terrestrial{
  String haveWingsTeeth();
}

class Bat implements Aves, Terrestrial, flyingAnimals{
  public String attribute(){
    return "Can move";
  }
  public String flies(){
    return "have wings";
  }
  public String walkOnLands(){
    return "have teeth and lungs";
  }
  public String haveWingsTeeth(){
    return "have wings and teeth";
  }
}

class Toad implements Terrestrial, Aquatic, Amphibians{
  public String attribute(){
    return "Can move";
  }
  public String walkOnLands(){
    return "have teeth and lungs";
  }
  public String swims(){
    return "have gills";
  }
  public String haveLungsGills(){
    return "have lungs and gills";
  }
}

public class Test{
  public static void main(String[] args){
    Animal a = new Toad();
    Aves av = new Bat();
    Toad t = new Toad();
    Bat b = new Bat();
    Amphibians ap = new Toad();
    flyingAnimals f = new Bat();
    System.out.print("Toad is animal : ");
    System.out.println(a instanceof Toad);
    System.out.print("Bat is flying animal : ");
    System.out.println(f instanceof Bat);
    System.out.print("Toad is amphibian : ");
    System.out.println(ap instanceof Amphibians);
    System.out.print("Toad is aves : ");
    System.out.println(av instanceof Toad);
    System.out.print("Bat is amphibian : ");
    System.out.println(b instanceof Amphibians);
  }
}
