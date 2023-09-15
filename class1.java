public class Math{
    public void add(int a,int b){
        int add=a+b;
        System.out.println("Sum:"+add);
    }
    public void sub(int a,int b){
        int sub=a+b;
        System.out.println("sub:"+sub);
    }
    public void div(int a,int b){
        int div=a/b;
        System.out.println("Div:"+div);
    }
    public static void main(String args[]){
        Math m=new Math();
        m.add(10, 10);
        m.sub(100, 20);
    }
}
