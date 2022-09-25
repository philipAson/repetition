public class Person {  //klass är en mall utav ett objekt

    String name; //instansvariabler
    String phone;
    int age;
    boolean isHired;

    public String getName() {
        return name;
    }

    public Person () {
        this.name = "--";
        this.phone = "--";
        this.age =  0;
        this.isHired = false;
    }

    public Person (String namn, String tel, int alder) {
        this.name = namn;
        this.phone = tel;
        this.age = alder;
        this.isHired = false;
    }

    public void personToString () {
        System.out.println(this.name + ", age:" + this.age + ", nr:" + this.phone);
    }

}
