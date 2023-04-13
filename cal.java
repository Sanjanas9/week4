interface Operation{
  void add();
  void sub();
}
interface SubOperation {
  void mul();
  void div();
  void add();
}
class Calculator implements Operation,SubOperation{
  public void add(){
    int  a=10,b=20;
    System.out.println((a+b));
  }
  public void sub(){
    int  a=10,b=20;
    System.out.println((a-b));
  }
  public void mul(){
    int  a=10,b=20;
    System.out.println((a*b));
  }
  public void div(){
    int  a=10,b=20;
    System.out.println((a/b));
  }
}
 
class InterfaceDemo{
  public static void main(String args[]){
    Operation opt=new Calculator();
    opt.add();
    opt.sub();
    opt.mul();
    opt.div();
  }
}