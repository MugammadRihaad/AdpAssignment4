//Q2
//Test Class for composition
package Compostion;

public class Horse {
    //composition has-a relationship
    private Animal horse;

    public Horse(){
        this.horse=new Animal();
        horse.setAge(10);
    }
    public long get() {
        return horse.getAge();
    }
}
