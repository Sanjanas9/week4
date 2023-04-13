import java.util.Scanner;
class Add{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int arr[]={10,40,90,50,30};
    System.out.println("Enter the number");
    int key=s.nextInt();
    int count=0,Iindex=-1,Jindex=-1;
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i]+arr[j]==key){
          Iindex=i;
          Jindex=j;
          count++;
        }
      }
      if(count==1){
        System.out.println("index position is:" +Iindex+ " " +Jindex);
        break;
      }
      else{
        System.out.println("There is no index values to show the sum for this entered number");
        break;
      }
    }
  }
}