public class Cat 
{
    // Property | Attribut | Field
    public String name;
    public String furColor;
    public int age;

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

public void tellYourAttributes(String checkStr){
switch (checkStr) {
    case "#name":
    System.out.println(this.name);
   
        break;
        case "#color":
        System.out.println(this.furColor);

        break;
        case "#age":
    System.out.println(this.age);
    default:
    System.out.println("ERROR");
        break;
}

}


  //  public void tellYourName() {
     //   System.out.println(this.name);
  //  }

  //  public void tellYourFurColor() {
  //      System.out.println(this.furColor);
  //  }

   // public void tellYourAge() {
   //     System.out.println(this.age);
    //}
    
}
